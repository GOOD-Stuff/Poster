package com.wtf
import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {

    get("/") {
        <p>Hello, Scuuuukaaa!</p>
    }

}