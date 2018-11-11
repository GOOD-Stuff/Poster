
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
            function validateForm() """),format.raw/*14.37*/("""{"""),format.raw/*14.38*/("""
                """),format.raw/*15.17*/("""var msg=document.forms["Form"]["message"].value;
                if (msg==null || msg=="" || msg==" ") """),format.raw/*16.55*/("""{"""),format.raw/*16.56*/("""
                    """),format.raw/*17.21*/("""alert("Message cannot be empty!");
                    return false;
                """),format.raw/*19.17*/("""}"""),format.raw/*19.18*/("""
                """),format.raw/*20.17*/("""if (!msg.replace(/\s/g, '').length) """),format.raw/*20.53*/("""{"""),format.raw/*20.54*/("""
                    """),format.raw/*21.21*/("""alert("Srsly? Stop frodding! Write something useful...");
                    return false;
                """),format.raw/*23.17*/("""}"""),format.raw/*23.18*/("""
            """),format.raw/*24.13*/("""}"""),format.raw/*24.14*/("""
        """),format.raw/*25.9*/("""</script>
    <form action="/post" method="POST" name="Form" enctype="multipart/form-data" onsubmit="return validateForm()">
        <dl>
            <dt>Your name:
                <dd><input type="text" name="user_name" value="""),_display_(/*29.64*/user/*29.68*/.user_name),format.raw/*29.78*/(""" """),format.raw/*29.79*/("""style="padding-bottom: 0.5em"></dd>
            <dt>Your post:</dt>
                <dd><textarea name="message" rows="5" cols="40"></textarea>
            <dt>Photo (optional):</dt>
                <dd><input type="file" name="photo" class="btn btn-primary"></dd>
            <dd><input type="submit" value="Post" class="btn btn-primary"></dd>
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
                  DATE: Sun Nov 11 15:19:27 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/post.scala.html
                  HASH: 26cd920c63f8716583b338a1fff65684b60ecb77
                  MATRIX: 582->1|708->32|736->34|1158->428|1187->429|1232->446|1363->549|1392->550|1441->571|1554->656|1583->657|1628->674|1692->710|1721->711|1770->732|1906->840|1935->841|1976->854|2005->855|2041->864|2296->1092|2309->1096|2340->1106|2369->1107
                  LINES: 14->1|19->1|21->3|32->14|32->14|33->15|34->16|34->16|35->17|37->19|37->19|38->20|38->20|38->20|39->21|41->23|41->23|42->24|42->24|43->25|47->29|47->29|47->29|47->29
                  -- GENERATED --
              */
          