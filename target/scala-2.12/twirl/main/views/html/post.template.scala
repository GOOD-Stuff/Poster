
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml

object post extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<html>
<head>
    <title>Post mess</title>
    <link href="/css/bootstrap.css" rel="stylesheet" />
    <link href="/css/bootstrap-responsive.css" rel="stylesheet" />
    <link href="/css/syntax.css" rel="stylesheet" />
    <link href="/css/scalatra.css" rel="stylesheet" />
</head>
<body>
    <h2>Post your message: </h2>
    <form action="/post" method="POST">
        <input type="text" name="message">
        <input type="submit" value="Post" class="btn btn-primary">
    </form>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 21 22:47:32 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/post.scala.html
                  HASH: dabe01eee7266952781bc54b827921b4592af63a
                  MATRIX: 558->1|654->3|682->5
                  LINES: 14->1|19->1|21->3
                  -- GENERATED --
              */
          