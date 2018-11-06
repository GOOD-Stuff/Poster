// https://www.jetbrains.com/help/idea/run-debug-and-test-scala.html
// https://docs.scala-lang.org/getting-started-sbt-track/testing-scala-with-sbt-on-the-command-line.html
//import org.scalatra._
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.{DefaultServlet, ServletContextHandler}
import org.eclipse.jetty.webapp.WebAppContext
import org.scalatra.servlet.ScalatraListener

// https://www.programcreek.com/scala/org.scalatra.servlet.ScalatraListener
object Main {
    def main(args: Array[String]): Unit = {
        val port = 8080
        val server = new Server(port)
        val context = new WebAppContext()

        context.setContextPath("/")
        context.setResourceBase("src/main/webapp")
        context.addEventListener(new ScalatraListener)
        context.addServlet(classOf[DefaultServlet], "/")

        server.setHandler(context)

        println("Server is up!")
        server.start()
        server.join()
    }
}