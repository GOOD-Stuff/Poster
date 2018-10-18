package org.poster.view

import org.poster.control.DBWorker
import org.scalatra._
import views._
// https://alvinalexander.com/scala/how-to-connect-mysql-database-scala-jdbc-select-query

class MyScalatraServlet extends ScalatraServlet {
    get("/") {
        html.hello(DBWorker.getAll())
    }

    get("/post") {
        DBWorker.SetName("Kekeke")
        html.post()
    }

}