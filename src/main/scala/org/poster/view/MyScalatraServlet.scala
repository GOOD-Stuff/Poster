package org.poster.view

import org.poster.control.Post
import org.poster.control.User
import org.scalatra._
import views._

import servlet.{MultipartConfig, SizeConstraintExceededException, FileUploadSupport}

/*import org.json4s.JsonDSL._
import org.json4s._
import org.scalatra.atmosphere._
import org.scalatra.json.{JValueResult, JacksonJsonSupport}
import org.scalatra.scalate.ScalateSupport
*/
import scala.concurrent.ExecutionContext.Implicits.global
// https://alvinalexander.com/scala/how-to-connect-mysql-database-scala-jdbc-select-query

class MyScalatraServlet extends ScalatraServlet with SessionSupport with FlashMapSupport with FileUploadSupport {
    //with JValueResult with JacksonJsonSupport with ScalateSupport with AtmosphereSupport {
    val pwork = new Post
    var user = new User//: User = _

    //implicit protected val jsonFormats: Formats = DefaultFormats

    before() {
        //user = new User
    }

    get("/") {
        html.hello(pwork.GetAllPosts(), user, "Welcome to the Poster!")
    }

    get("/user/:uname") {
        if ((params("uname") == user.user_name) && (params("uname") != "anonymous"))
            html.hello(pwork.GetUserPosts(user.id), user, "Hi " + user.user_name + ", this is your home page!")
        else
            halt(404)
    }


    /*get("/:path") {
        contentType = "image/jpeg"
        val file = new java.io.File("/tmp/poster/photos/2_001.jpg")
        response.setHeader("Content-Disposition", "attachment; filename=" + file.getName)
        file
    }*/


    get("/login") {
        html.auth(user)
    }

    post("/login") {
        val rs = user.UserLogin(params("login"), params("password"))
        if (rs == 0) redirect("/user/" + user.user_name)
        else redirect("/login")
    }

    get("/logout") {
        user.UserLogout()
        redirect("/")
    }

    get("/register") {
        html.regs()
    }

    post("/register") {
        val rs = user.UserRegister(params("login"), params("password"))
        if (rs == 0) redirect("/")
        else {
          <p>Hahaha, very funny, but try again!</p>
        }
    }

    get("/post") {
        html.post(user)
    }

    post("/post") {
        contentType   = "text/html"
        val user_name = multiParams("user_name")
        val message   = multiParams("message")
        val photo     = fileParams("photo")

        if (photo.getName != "")
            pwork.UploadImage(photo.getName, photo.getInputStream)
        val rs = pwork.WritePost(user_name(0), message(0), user.id, photo.getName)
        if (rs == 0)
            redirect("/")
    }

    get("/edit/:id") {
        pwork.GetSpecPost(params("id").toInt)
        html.edit(user, pwork, pwork.id)
    }

    post("/edit/:id") {
        val rs = pwork.EditUserPost(params("user_name"), params("message"))
        if (rs == 0)
            redirect("/")
        else
            println("Something bad: " + rs)

    }

    get("/json") {

    }

    /*atmosphere("/the-chat") {
        new AtmosphereClient {
            def receive = {
                case Connected =>
                case Disconnected(disconnector, Some(error)) =>
                case Error(Some(error)) =>
                case TextMessage(text) => send("ECHO: " + text)
                case JsonMessage(json) => broadcast(json)
            }
        }
    }*/
}
