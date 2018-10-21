import javax.servlet.ServletContext
import org.poster.control.DBWorker
import org.poster.view._
import org.scalatra._

class ScalatraBootstrap extends LifeCycle {
    override def init(context: ServletContext): Unit = {
        println("Fuck you")
        DBWorker.connectDB()
        context.mount(new MyScalatraServlet, "/")
    }

    override def destroy(context:ServletContext) {
        println("Good bye!")
        DBWorker.disconnectDB()
    }
}