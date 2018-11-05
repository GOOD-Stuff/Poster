
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
            if (msg==null || msg=="" || msg==" ") """),format.raw/*16.51*/("""{"""),format.raw/*16.52*/("""
                """),format.raw/*17.17*/("""alert("Message cannot be empty!");
                return false;
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/("""
            """),format.raw/*20.13*/("""if (!msg.replace(/\s/g, '').length) """),format.raw/*20.49*/("""{"""),format.raw/*20.50*/("""
                """),format.raw/*21.17*/("""alert("Srsly? Stop frodding! Write something useful...");
                return false;
            """),format.raw/*23.13*/("""}"""),format.raw/*23.14*/("""
        """),format.raw/*24.9*/("""}"""),format.raw/*24.10*/("""
    """),format.raw/*25.5*/("""</script>
    <form action="/post" method="POST" name="Form" onsubmit="return validateForm()">
        <dl>
            <dt>Your name:
                <dd><input type="text" name="user_name" value="""),_display_(/*29.64*/user/*29.68*/.user_name),format.raw/*29.78*/(""" """),format.raw/*29.79*/("""style="padding-bottom: 0.5em"></dd>
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
                  DATE: Sun Nov 04 18:33:35 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/post.scala.html
                  HASH: 2fcf8f89881f937cea35907b6c6476cf3cf71f35
                  MATRIX: 582->1|708->32|736->34|1154->424|1183->425|1224->438|1351->537|1380->538|1425->555|1530->632|1559->633|1600->646|1664->682|1693->683|1738->700|1866->800|1895->801|1931->810|1960->811|1992->816|2217->1014|2230->1018|2261->1028|2290->1029
                  LINES: 14->1|19->1|21->3|32->14|32->14|33->15|34->16|34->16|35->17|37->19|37->19|38->20|38->20|38->20|39->21|41->23|41->23|42->24|42->24|43->25|47->29|47->29|47->29|47->29
                  -- GENERATED --
              */
          