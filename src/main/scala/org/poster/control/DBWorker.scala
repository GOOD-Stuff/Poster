package org.poster.control

import org.slf4j.{Logger, LoggerFactory}
import scalikejdbc._
import java.sql.{Connection, DriverManager}


object DBWorker {
    val logger = LoggerFactory.getLogger(getClass)
    val url = "jdbc:mysql://localhost:3306/test_lol"
    val username = "root"
    val password = "****" // XXX: Set your own password!
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
            val rs = state.executeQuery("SELECT id, name, pdate FROM tpost;")
            while (rs.next) {
                val id = rs.getInt("id")
                val name = rs.getString("name")
                val date = rs.getString("pdate")
                text += id.toString + " " + name + " " + date + " "
            }
            state.close()
        } catch {
            case e: Exception => e.printStackTrace
        }
        text
    }

    def SetName(name: String): Unit = {
        try {
            val statement = connection.prepareStatement("INSERT INTO tpost (name, pdate) VALUES (?, '2018-10-18');")
            statement.setString(1, name)
            val rs = statement.executeUpdate()
            statement.close()
        } catch {
            case e: Exception => e.printStackTrace
        }

    }

    def disconnectDB(): Unit = {
        connection.close()
    }
}
