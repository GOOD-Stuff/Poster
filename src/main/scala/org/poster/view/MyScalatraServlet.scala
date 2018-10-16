package org.poster.view

//import org.poster.control._
import org.poster.control.DBWorker
import org.scalatra._
import views._
// https://alvinalexander.com/scala/how-to-connect-mysql-database-scala-jdbc-select-query

class MyScalatraServlet extends ScalatraServlet {
    get("/") {
        /*<html>
            <head>
                <title>Hello!</title>
            </head>
            <body>
                <p>Hello, folks!</p>
            </body>
        </html>*/

        html.hello(DBWorker.getAll())
    }

    get("/post") {
        html.post()
        /*contentType="text/html"
        <html>
            <head>
                <title>WTF</title>
            </head>
            <body>
                <h1>YOU WILL NOT SHALL PASS</h1>
            </body>
        </html>*/
    }

}