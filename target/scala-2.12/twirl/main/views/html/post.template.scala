
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
        <dl>
            <dt>Your name:
                <dd><input type="text" name="user_name" value="anon" style="padding-bottom: 0.5em"></dd>
            <dt>Your post:</dt>
            <dd><textarea name="message" rows="5" cols="40"></textarea>
            <dd><input type="submit" value="Post" class="btn btn-primary">
        </dl>
    </form>
</body>
</html>
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 28 19:28:26 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/post.scala.html
                  HASH: 3c882d94e188e94a00a48611a793bba6a6bd16f4
                  MATRIX: 558->1|654->3|682->5
                  LINES: 14->1|19->1|21->3
                  -- GENERATED --
              */
          