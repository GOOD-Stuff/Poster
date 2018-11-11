package org.poster.model

import java.util.Date
import java.text.SimpleDateFormat

import org.slf4j.{Logger, LoggerFactory}
import scalikejdbc._
import java.sql.{Connection, DriverManager, ResultSet}


// TODO: rewrite, set 1 class and 2 traits
object DBWorker {
    private val logger = LoggerFactory.getLogger(getClass)
    private val url = "jdbc:mysql://localhost:3306/test_lol"
    private val username = "root"
    private val password = "******"
    private var connection: Connection = null
    private var cursor: ResultSet = _
    var isAccessed = true

    logger.info("Try to connecto to DB")
    println("Into DB")
    def connectDB() {
        try {
            connection = DriverManager.getConnection(url, username, password)
        } catch {
            case e: Exception => e.printStackTrace
        }
    }


    def CreateUserTable(): Unit = {
        try {
            val state = connection.createStatement
            var rs = state.executeQuery("CREATE TABLE user_auth (" +
                "id INT NOT NULL AUTO_INCREMENT," +
                "user_name NVARCHAR(128) NOT NULL," +
                "password nvarchar(128));")
            //rs = state.executeQuery("INSERT INTO user_auth (user_name) values(\"anonymous\");")
        } catch {
            case e: Exception => e.printStackTrace
        }
    }


    def CreatePostTable(): Unit = {
        try {
            val state = connection.createStatement
            var rs = state.executeQuery("CREATE TABLE post_full (" +
                "id INT NOT NULL AUTO_INCREMENT," +
                "user_name NVARCHAR(128) DEFAULT 'anonymous'," +
                "message NVARCHAR(10000) NOT NULL," +
                "post_date DATE NOT NULL," +
                "user_id INT NOT NULL," +
                "image_path text," +
                "PRIMARY KEY(id)," +
                "FOREIGN KEY(user_id) REFERENCES user_auth(id));")
        } catch {
            case e: Exception => e.printStackTrace
        }
    }


    def setCursor(): Unit = {
        try {
            val state = connection.createStatement
            cursor = state.executeQuery("SELECT * FROM tpost_f;")
            isAccessed = true
        } catch {
            case e: Exception => e.printStackTrace
        }
    }

    def setUserCursor(user_id: Int): Unit = {
        try {
            val state = connection.prepareStatement("SELECT * FROM tpost_f WHERE user_id = ?;")
            state.setInt(1, user_id)
            cursor = state.executeQuery()
            isAccessed = true
        } catch {
            case e: Exception => e.printStackTrace
        }
    }


    def setPostCursor(post_id: Int): Unit = {
        try {
            val state = connection.prepareStatement("SELECT * FROM tpost_f WHERE id = ?;")
            state.setInt(1, post_id)
            cursor = state.executeQuery()
            isAccessed = true
        } catch {
            case e: Exception => e.printStackTrace
        }
    }


    // XXX: rewrite, return sequence
    def getRow(): (Int, String, String, String, Int, String) = {
        var id: Int = 0
        var name: String = ""
        var msg:  String = ""
        var date: String = ""
        var tuser_id: Int = 0
        var image_path: String = ""

        try {
            if (cursor.next) {
                id   = cursor.getInt("id")
                name = cursor.getString("user_name")
                msg  = cursor.getString("message")
                date = cursor.getString("post_date")
                tuser_id = cursor.getInt("user_id")
                image_path = cursor.getString("image_path")
            } else {
                isAccessed = false;
            }
        } catch {
            case e: Exception => e.printStackTrace;  isAccessed = false; name = ""; msg = ""; date = "";
        }
        (id, name, msg, date, tuser_id, image_path)
    }


    /**
      * @brief Write post_msg into table tpost
      * @param[in] post_msg - string with message of post
      *
      * @return none
      */
    def SetPost(user_name: String, post_msg: String, post_date: String, user_id: Int, photo_path: String): Unit = {
        try {
            val statement = connection.prepareStatement("INSERT INTO tpost_f (user_name, message, post_date, user_id, image_path) VALUES (?, ?, ?, ?, ?);")
            statement.setString(1, user_name)
            statement.setString(2, post_msg)
            statement.setString(3, post_date)
            statement.setInt(4, user_id)
            statement.setString(5, photo_path)
            val rs = statement.executeUpdate()
            statement.close()
        } catch {
            case e: Exception => e.printStackTrace
        }
    }


    /**
      *
      */
    def UpdatePost(user_name: String, post_msg: String, post_date: String, user_id: Int, post_id: Int, photo_path: String): Unit = {
        try {
            val statement = connection.prepareStatement("UPDATE tpost_f SET user_name = ?, message = ?, post_date = ?, image_path = ? WHERE user_id = ? AND id = ?;")
            statement.setString(1, user_name)
            statement.setString(2, post_msg)
            statement.setString(3, post_date)
            statement.setString(4, photo_path)
            statement.setInt(5, user_id)
            statement.setInt(6, post_id)

            val rs = statement.executeUpdate()
            statement.close()
        } catch {
            case e: Exception => e.printStackTrace
        }
    }


    /**
      *
      */
    def FindUser(login: String): (Int, String) = {
        var id = 0
        var password = ""
        try {
            val statement = connection.prepareStatement("SELECT id, password FROM tuser WHERE user_name = ?;")
            statement.setString(1, login)
            val rs = statement.executeQuery()
            if (rs.next()) {
                id = rs.getInt("id")
                password = rs.getString("password")
            }
            statement.close()
        } catch{
            case e: Exception => e.printStackTrace
        }
        (id, password)
    }


    /**
      *
      */
    def AddUser(login: String, password: String): Int = {
        try {
            val (res, t) = FindUser(login)
            if (res > 0) -1
            else {
                val statement = connection.prepareStatement("INSERT INTO tuser (user_name, password) VALUES (?, ?);")
                statement.setString(1, login)
                statement.setString(2, password)
                val rs = statement.executeUpdate()
                println("Add rs: " + rs)
                statement.close()
            }
        } catch {
            case e: Exception => e.printStackTrace
        }
        0
    }


    /**
      * @brief Disconnect from database
      * @param none
      *
      * @return none
      */
    def disconnectDB(): Unit = {
        connection.close()
    }
}
