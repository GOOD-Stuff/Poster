package org.poster.model

import java.util.Date
import java.text.SimpleDateFormat

import org.slf4j.{Logger, LoggerFactory}
import scalikejdbc._
import java.sql.{Connection, DriverManager, ResultSet}


// TODO: rewrite, set 1 class and 2 traits
object DBWorker {
    val logger = LoggerFactory.getLogger(getClass)
    val url = "jdbc:mysql://localhost:3306/test_lol"
    val username = "root"
    val password = "******"
    var connection: Connection = null
    var cursor: ResultSet = _
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
            cursor = state.executeQuery("SELECT id, user_name, message, post_date, user_id FROM tpost_f;")
            isAccessed = true
        } catch {
            case e: Exception => e.printStackTrace
        }
    }

    def setUserCursor(user_id: Int): Unit = {
        try {
            val state = connection.prepareStatement("SELECT id, user_name, message, post_date, user_id FROM tpost_f WHERE user_id = ?;")
            state.setInt(1, user_id)
            cursor = state.executeQuery()
            isAccessed = true
        } catch {
            case e: Exception => e.printStackTrace
        }
    }


    def setPostCursor(post_id: Int): Unit = {
        try {
            val state = connection.prepareStatement("SELECT id, user_name, message, post_date, user_id FROM tpost_f WHERE id = ?;")
            state.setInt(1, post_id)
            cursor = state.executeQuery()
            isAccessed = true
        } catch {
            case e: Exception => e.printStackTrace
        }
    }


    // XXX: rewrite, return sequence
    def getRow(): (Int, String, String, String, Int) = {
        var id: Int = 0
        var name: String = ""
        var msg:  String = ""
        var date: String = ""
        var tuser_id: Int = 0

        try {
            if (cursor.next) {
                id   = cursor.getInt("id")
                name = cursor.getString("user_name")
                msg  = cursor.getString("message")
                date = cursor.getString("post_date")
                tuser_id = cursor.getInt("user_id")
            } else {
                isAccessed = false;
            }
        } catch {
            case e: Exception => e.printStackTrace;  isAccessed = false; name = ""; msg = ""; date = "";
        }
        (id, name, msg, date, tuser_id)
    }


    /**
      * @brief Write post_msg into table tpost
      * @param[in] post_msg - string with message of post
      *
      * @return none
      */
    def SetPost(user_name: String, post_msg: String, post_date: String, user_id: Int): Unit = {
        try {
            val statement = connection.prepareStatement("INSERT INTO tpost_f (user_name, message, post_date, user_id) VALUES (?, ?, ?, ?);")
            statement.setString(1, user_name)
            statement.setString(2, post_msg)
            statement.setString(3, post_date)
            statement.setInt(4, user_id)
            val rs = statement.executeUpdate()
            statement.close()
        } catch {
            case e: Exception => e.printStackTrace
        }
    }


    /**
      *
      */
    def UpdatePost(user_name: String, post_msg: String, post_date: String, user_id: Int, post_id: Int): Unit = {
        try {
            val statement = connection.prepareStatement("UPDATE tpost_f SET user_name = ?, message = ?, post_date = ? WHERE user_id = ? AND id = ?;")
            statement.setString(1, user_name)
            statement.setString(2, post_msg)
            statement.setString(3, post_date)
            statement.setInt(4, user_id)
            statement.setInt(5, post_id)
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
