
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
/*1.2*/import org.poster.control._

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[User,Post,Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User, post: Post, post_id: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.40*/("""
"""),format.raw/*3.1*/("""<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>"""),_display_(/*6.13*/user/*6.17*/.user_name),format.raw/*6.27*/("""</title>
    <link type="text/css" href="/css/scalatra.css" rel="stylesheet" />
</head>
<body>
    <h2>Edit your message: </h2>
    <script type="text/javascript">
            function validateForm() """),format.raw/*12.37*/("""{"""),format.raw/*12.38*/("""
                """),format.raw/*13.17*/("""var msg=document.forms["Form"]["message"].value;
                if (msg==null || msg=="" || msg==" ") """),format.raw/*14.55*/("""{"""),format.raw/*14.56*/("""
                    """),format.raw/*15.21*/("""alert("Message cannot be empty!");
                    return false;
                """),format.raw/*17.17*/("""}"""),format.raw/*17.18*/("""
                """),format.raw/*18.17*/("""if (!msg.replace(/\s/g, '').length) """),format.raw/*18.53*/("""{"""),format.raw/*18.54*/("""
                    """),format.raw/*19.21*/("""alert("Srsly? Stop frodding! Write something useful...");
                    return false;
                """),format.raw/*21.17*/("""}"""),format.raw/*21.18*/("""
            """),format.raw/*22.13*/("""}"""),format.raw/*22.14*/("""
        """),format.raw/*23.9*/("""</script>
    <form action="/edit/"""),_display_(/*24.26*/post_id),format.raw/*24.33*/("""" method="POST" name="Form" onsubmit="return validateForm()">
        <dl>
            <dt>Your name:
            <dd><input type="text" name="user_name" value="""),_display_(/*27.60*/user/*27.64*/.user_name),format.raw/*27.74*/(""" """),format.raw/*27.75*/("""style="padding-bottom: 0.5em"></dd>
            <dt>Your post:</dt>
            <dd><textarea name="message" rows="5" cols="40">"""),_display_(/*29.62*/post/*29.66*/.msg),format.raw/*29.70*/("""</textarea>
            <dd><input type="submit" value="Edit" class="btn btn-primary">
        </dl>
    </form>
    <a href="/" class="btn btn-primary">Back</a>
</body>
</html>
"""))
      }
    }
  }

  def render(user:User,post:Post,post_id:Int): play.twirl.api.HtmlFormat.Appendable = apply(user,post,post_id)

  def f:((User,Post,Int) => play.twirl.api.HtmlFormat.Appendable) = (user,post,post_id) => apply(user,post,post_id)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Nov 04 19:01:24 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/edit.scala.html
                  HASH: 6e56a74f80d91a2414ea2b1bcaf7776c68c61620
                  MATRIX: 269->1|607->30|740->68|767->69|856->132|868->136|898->146|1126->346|1155->347|1200->364|1331->467|1360->468|1409->489|1522->574|1551->575|1596->592|1660->628|1689->629|1738->650|1874->758|1903->759|1944->772|1973->773|2009->782|2071->817|2099->824|2287->985|2300->989|2331->999|2360->1000|2516->1129|2529->1133|2554->1137
                  LINES: 10->1|15->2|20->2|21->3|24->6|24->6|24->6|30->12|30->12|31->13|32->14|32->14|33->15|35->17|35->17|36->18|36->18|36->18|37->19|39->21|39->21|40->22|40->22|41->23|42->24|42->24|45->27|45->27|45->27|45->27|47->29|47->29|47->29
                  -- GENERATED --
              */
          