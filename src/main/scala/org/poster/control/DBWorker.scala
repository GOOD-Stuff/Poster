package org.poster.control

import java.util.Date
import java.text.SimpleDateFormat

import org.slf4j.{Logger, LoggerFactory}
import scalikejdbc._
import java.sql.{Connection, DriverManager, ResultSet}


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

    def getAll(): String = {//List[String] = {//String = {
        var text: String = ""
        //var text = List[String]()
        try {
            val state = connection.createStatement
            val rs = state.executeQuery("SELECT id, name, pdate FROM tpost;")
            while (rs.next) {
                val id = rs.getInt("id")
                val name = rs.getString("name")
                val date = rs.getString("pdate")
                text += id.toString + " " + name + " " + date + " | "
                //text ::= name
            }
            state.close()
        } catch {
            case e: Exception => e.printStackTrace
        }
        text
    }

    def setCursor(): Unit = {
        try {
            val state = connection.createStatement
            cursor = state.executeQuery("SELECT user_name, message, post_date FROM tpost_f;")
            isAccessed = true
        } catch {
            case e: Exception => e.printStackTrace
        }
    }

    // XXX: rewrite, return sequence
    def getRow(): (String, String, String) = {//List[String] = {//String = {
        var name: String = ""
        var msg:  String = ""
        var date: String = ""

        try {
            if (cursor.next) {
                name = cursor.getString("user_name")
                msg  = cursor.getString("message")
                date = cursor.getString("post_date")
            } else {
                isAccessed = false;
            }
        } catch {
            case e: Exception => e.printStackTrace;  isAccessed = false; name = ""; msg = ""; date = "";
        }
        (name, msg, date)
    }

    /**
      * @brief Write post_msg into table tpost
      * @param[in] post_msg - string with message of post
      *
      * @return none
      */
    def SetPost(user_name: String, post_msg: String, post_date: String): Unit = {
        try {
            val statement = connection.prepareStatement("INSERT INTO tpost_f (user_name, message, post_date) VALUES (?, ?, ?);")
            statement.setString(1, user_name)
            statement.setString(2, post_msg)
            statement.setString(3, post_date)
            val rs = statement.executeUpdate()
            statement.close()
        } catch {
            case e: Exception => e.printStackTrace
        }
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
