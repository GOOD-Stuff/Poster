
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml

object regs extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""
"""),format.raw/*2.1*/("""<html lang="ru">
<head>
    <meta charset="UTF-8">
    <title>Regs</title>
    <link href="/css/syntax.css" rel="stylesheet" />
    <link href="/css/scalatra.css" rel="stylesheet" />
</head>
<body>
    <h2>Registration</h2>
    <script type="text/javascript">
        function validateForm() """),format.raw/*12.33*/("""{"""),format.raw/*12.34*/("""
            """),format.raw/*13.13*/("""var login=document.forms["Form"]["login"].value;
            var passw=document.forms["Form"]["password"].value;

            if (login==null || login=="") """),format.raw/*16.43*/("""{"""),format.raw/*16.44*/("""
                """),format.raw/*17.17*/("""alert("Login cannot be empty!");
                return false;
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/("""
            """),format.raw/*20.13*/("""if (passw==null || passw=="") """),format.raw/*20.43*/("""{"""),format.raw/*20.44*/("""
                """),format.raw/*21.17*/("""alert("Password cannot be empty!");
                return false;
            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/("""
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/("""
    """),format.raw/*25.5*/("""</script>
    <form action="/register" method="POST" name="Form" onsubmit="return validateForm()">
        <dl>
            <dt>Your login:
            <dd><input type="text" name="login" value="login" style="padding-bottom: 0.5em"></dd>

            <dt>Your password:</dt>
            <dd><input type="password" name="password" value="password" style="padding-bottom: 0.5em"></dd>
            <dd><input type="submit" value="Sign up" class="btn btn-primary"></dd>
        </dl>
    </form>
    <a href="/" class="btn btn-primary">Back</a>
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
                  DATE: Wed Oct 31 23:45:50 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/regs.scala.html
                  HASH: 9ffd963a60f656dc6dd1ca46cc624146df71710a
                  MATRIX: 558->1|654->3|681->4|1001->296|1030->297|1071->310|1255->466|1284->467|1329->484|1432->559|1461->560|1502->573|1560->603|1589->604|1634->621|1740->699|1769->700|1805->709|1834->710|1866->715
                  LINES: 14->1|19->1|20->2|30->12|30->12|31->13|34->16|34->16|35->17|37->19|37->19|38->20|38->20|38->20|39->21|41->23|41->23|42->24|42->24|43->25
                  -- GENERATED --
              */
          