
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml

object auth extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[org.poster.control.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: org.poster.control.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.33*/("""
"""),format.raw/*2.1*/("""<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <!--link href="/css/bootstrap.css" rel="stylesheet" /!-->
    <!--link href="/css/bootstrap-responsive.css" rel="stylesheet" /!-->
    <link href="/css/syntax.css" rel="stylesheet" />
    <link href="/css/scalatra.css" rel="stylesheet" />
</head>
<body>
    <h2>Login</h2>
    <script type="text/javascript">
        function validateForm() """),format.raw/*14.33*/("""{"""),format.raw/*14.34*/("""
            """),format.raw/*15.13*/("""var login=document.forms["Form"]["login"].value;
            var passw=document.forms["Form"]["password"].value;

            if (login==null || login=="") """),format.raw/*18.43*/("""{"""),format.raw/*18.44*/("""
                """),format.raw/*19.17*/("""alert("Login cannot be empty!");
                return false;
            """),format.raw/*21.13*/("""}"""),format.raw/*21.14*/("""
            """),format.raw/*22.13*/("""if (passw==null || passw=="") """),format.raw/*22.43*/("""{"""),format.raw/*22.44*/("""
                """),format.raw/*23.17*/("""alert("Password cannot be empty!");
                return false;
            """),format.raw/*25.13*/("""}"""),format.raw/*25.14*/("""
        """),format.raw/*26.9*/("""}"""),format.raw/*26.10*/("""
    """),format.raw/*27.5*/("""</script>
    <form action="/login" method="POST" name="Form" onsubmit="return validateForm()">
        <dl>
            <dt>Your login:
            <dd><input type="text" name="login" value="login" style="padding-bottom: 0.5em"></dd>

            <dt>Your password:</dt>
            <dd><input type="password" name="password" value="password" style="padding-bottom: 0.5em"></dd>
            <dd><input type="submit" value="Sign in" class="btn btn-primary">
                <a href="/register" class="btn btn-primary">Sign up</a> </dd>
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
                  DATE: Wed Oct 31 23:37:48 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/auth.scala.html
                  HASH: 5ac16a31f8d01802a6382ddca86bfbf9a8cfa6c0
                  MATRIX: 582->1|708->32|735->33|1184->454|1213->455|1254->468|1438->624|1467->625|1512->642|1615->717|1644->718|1685->731|1743->761|1772->762|1817->779|1923->857|1952->858|1988->867|2017->868|2049->873
                  LINES: 14->1|19->1|20->2|32->14|32->14|33->15|36->18|36->18|37->19|39->21|39->21|40->22|40->22|40->22|41->23|43->25|43->25|44->26|44->26|45->27
                  -- GENERATED --
              */
          