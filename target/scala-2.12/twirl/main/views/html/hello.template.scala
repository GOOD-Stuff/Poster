
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(myStr: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<html>
    <head>
        <title>Kek</title>
        <link type="text/css" href="/css/bootstrap.css" rel="stylesheet" />
        <!--link href="/css/bootstrap-responsive.css" rel="stylesheet" /!-->
        <!--link href="/css/syntax.css" rel="stylesheet" /!-->
        <link type="text/css" href="/css/scalatra.css" rel="stylesheet" />
    </head>
    <body>
        <h1>RABOTAY!1!!!1</h1>
        <div id="nav">
        <a href=/post class="btn btn-primary">Post post</a>
        </div>
        <h3>"""),_display_(/*16.14*/myStr),format.raw/*16.19*/("""</h3>
    </body>
</html>"""))
      }
    }
  }

  def render(myStr:String): play.twirl.api.HtmlFormat.Appendable = apply(myStr)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (myStr) => apply(myStr)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 21 22:47:32 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/hello.scala.html
                  HASH: ef7625ddf199859ffc9503c8bbaddcc1308b66a0
                  MATRIX: 566->1|676->16|704->18|1232->519|1258->524
                  LINES: 14->1|19->1|21->3|34->16|34->16
                  -- GENERATED --
              */
          