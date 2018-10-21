package org.poster.control

import java.util.Date
import java.text.SimpleDateFormat
import org.slf4j.{Logger, LoggerFactory}
import scalikejdbc._
import java.sql.{Connection, DriverManager}


object DBWorker {
    val logger = LoggerFactory.getLogger(getClass)
    val url = "jdbc:mysql://localhost:3306/test_lol"
    val username = "root"
    val password = "idinahuy"
    var connection: Connection = null

    logger.info("Try to connecto to DB")
    println("Into DB")
    def connectDB() {
        try {
            connection = DriverManager.getConnection(url, username, password)
        } catch {
            case e: Exception => e.printStackTrace
        }
    }

    def getAll(): String = {
        var text: String = ""
        try {
            val state = connection.createStatement
            val rs = state.executeQuery("SELECT id, post_msg, pdate FROM tpost;")
            while (rs.next) {
                val id = rs.getInt("id")
                val name = rs.getString("post_msg")
                val date = rs.getString("pdate")
                text += id.toString + " " + name + " " + date + " | "
            }
            state.close()
        } catch {
            case e: Exception => e.printStackTrace
        }
        text
    }

    /**
      * @brief Write post_msg into table tpost
      * @param[in] post_msg - string with message of post
      *
      * @return none
      */
    def SetPost(post_msg: String): Unit = {
        try {
            val date = new java.util.Date
            val format_date = new SimpleDateFormat("yyyy-MM-dd")
            val statement = connection.prepareStatement("INSERT INTO tpost (post_msg, pdate) VALUES (?, ?);")
            statement.setString(1, post_msg)
            statement.setString(2, format_date.format(date))
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
