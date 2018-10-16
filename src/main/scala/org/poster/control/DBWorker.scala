package org.poster.control

import org.slf4j.{Logger, LoggerFactory}
import scalikejdbc._
import java.sql.{Connection, DriverManager}


object DBWorker {
    val logger = LoggerFactory.getLogger(getClass)
    val url = "jdbc:mysql://localhost:3306/test_lol"
    val username = "root"
    val password = "*****"
    var connection: Connection = null

    logger.info("Try to connecto to DB")
    println("Into DB")
    def connectDB() {

        try {
            connection = DriverManager.getConnection(url, username, password)
            logger.info("Set quere")
          /*  val statement = connection.createStatement
            val rs = statement.executeQuery("SELECT id, name, pdate FROM tpost")
            while (rs.next) {
                val id = rs.getInt("id")
                val name = rs.getString("name")
                val date = rs.getString("pdate")
                println("ID = " + id + " name = " + name + " date = " + date)
            }*/
        } catch {
            case e: Exception => e.printStackTrace
        }
       // connection.close
    }

    def getAll(): String = {
        var text: String = ""
        //var connection: Connection = null
        try {
          //  connection = DriverManager.getConnection(url, username, password)
            val state = connection.createStatement
            val rs = state.executeQuery("SELECT id, name, pdate FROM tpost;")
            while (rs.next) {
                val id = rs.getInt("id")
                val name = rs.getString("name")
                val date = rs.getString("pdate")
                text += id.toString + " " + name + " " + date + " "
            }
        } catch {
            case e: Exception => e.printStackTrace
        }
        //connection.close
        text
    }

    def disconnectDB(): Unit = {
        connection.close()
    }
}
