
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
    </head>
    <body>
        <h1>RABOTAY!1!!!1</h1>
        <h3>"""),_display_(/*9.14*/myStr),format.raw/*9.19*/("""</h3>
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
                  DATE: Tue Oct 16 23:23:51 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/hello.scala.html
                  HASH: d95cff0f8487acc59fa6ffcb5b977d3a7bd37068
                  MATRIX: 566->1|676->16|704->18|842->130|867->135
                  LINES: 14->1|19->1|21->3|27->9|27->9
                  -- GENERATED --
              */
          