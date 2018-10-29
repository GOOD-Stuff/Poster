package org.poster.view

import org.poster.model.DBWorker
import org.poster.control.Post
import org.scalatra._
import views._

import org.json4s.JsonDSL._
import org.json4s._
import org.scalatra.atmosphere._
import org.scalatra.json.{JValueResult, JacksonJsonSupport}
import org.scalatra.scalate.ScalateSupport

import scala.concurrent.ExecutionContext.Implicits.global
// https://alvinalexander.com/scala/how-to-connect-mysql-database-scala-jdbc-select-query

class MyScalatraServlet extends ScalatraServlet with ScalateSupport
    with JValueResult with JacksonJsonSupport with SessionSupport with AtmosphereSupport {
    val pwork = new Post
    implicit protected val jsonFormats: Formats = DefaultFormats

    get("/") {
        html.hello(pwork.GetAllPosts())
    }

    get("/login") {

    }

    post("/login") {

    }

    post("/logout") {

    }

    get("/post") {
        html.post()
    }

    post("/post") {
        val rs = pwork.WritePost(params("user_name"), params("message"))
        if (rs == 0)
            redirect("/")
    }

    get("/json") {

    }

    atmosphere("/the-chat") {
        new AtmosphereClient {
            def receive = {
                case Connected =>
                case Disconnected(disconnector, Some(error)) =>
                case Error(Some(error)) =>
                case TextMessage(text) => send("ECHO: " + text)
                case JsonMessage(json) => broadcast(json)
            }
        }
    }
}
