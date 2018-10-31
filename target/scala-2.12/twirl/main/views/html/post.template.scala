
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml

object post extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[org.poster.control.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: org.poster.control.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""

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
    <script type="text/javascript">
        function validateForm() """),format.raw/*14.33*/("""{"""),format.raw/*14.34*/("""
            """),format.raw/*15.13*/("""var msg=document.forms["Form"]["message"].value;
            if (msg==null || msg=="") """),format.raw/*16.39*/("""{"""),format.raw/*16.40*/("""
                """),format.raw/*17.17*/("""alert("Message cannot be empty!");
                return false;
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/("""
        """),format.raw/*20.9*/("""}"""),format.raw/*20.10*/("""
    """),format.raw/*21.5*/("""</script>
    <form action="/post" method="POST" name="Form" onsubmit="return validateForm()">
        <dl>
            <dt>Your name:
                <dd><input type="text" name="user_name" value="""),_display_(/*25.64*/user/*25.68*/.user_name),format.raw/*25.78*/(""" """),format.raw/*25.79*/("""style="padding-bottom: 0.5em"></dd>
            <dt>Your post:</dt>
            <dd><textarea name="message" rows="5" cols="40"></textarea>
            <dd><input type="submit" value="Post" class="btn btn-primary">
        </dl>
    </form>
    <a href="/" class="btn btn-primary">Back</a>
</body>
</html>
"""))
      }
    }
  }

  def render(user:org.poster.control.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((org.poster.control.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 31 23:48:28 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/post.scala.html
                  HASH: 803381089096efc367a0133d819b997357ef6ee0
                  MATRIX: 582->1|708->32|736->34|1154->424|1183->425|1224->438|1339->525|1368->526|1413->543|1518->620|1547->621|1583->630|1612->631|1644->636|1869->834|1882->838|1913->848|1942->849
                  LINES: 14->1|19->1|21->3|32->14|32->14|33->15|34->16|34->16|35->17|37->19|37->19|38->20|38->20|39->21|43->25|43->25|43->25|43->25
                  -- GENERATED --
              */
          