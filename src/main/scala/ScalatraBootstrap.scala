import javax.servlet.ServletContext
import org.poster.view._
import org.scalatra._

class ScalatraBootstrap extends LifeCycle {
    override def init(context: ServletContext): Unit = {
        context.mount(new MyScalatraServlet, "/")
    }
}