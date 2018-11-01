
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
/*1.2*/import org.poster.control._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Post],User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(plist: List[Post], user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.33*/("""

"""),format.raw/*4.1*/("""<html>
    <head>
        <title>
            """),_display_(/*7.14*/if(user.id > 0)/*7.29*/ {_display_(Seq[Any](format.raw/*7.31*/("""
                """),_display_(/*8.18*/user/*8.22*/.user_name),format.raw/*8.32*/("""
            """)))}),format.raw/*9.14*/("""
            """),format.raw/*10.13*/("""else """),format.raw/*10.18*/("""{"""),format.raw/*10.19*/("""
                """),format.raw/*11.17*/("""Kek
            """),format.raw/*12.13*/("""}"""),format.raw/*12.14*/("""
        """),format.raw/*13.9*/("""</title>
        <!--link type="text/css" href="/css/bootstrap.css" rel="stylesheet" /!-->
        <!--link href="/css/bootstrap-responsive.css" rel="stylesheet" /!-->
        <!--link href="/css/syntax.css" rel="stylesheet" /!-->
        <link type="text/css" href="/css/scalatra.css" rel="stylesheet" />
    </head>
    <body>
        <h1>RABOTAY!1!!!1, """),_display_(/*20.29*/user/*20.33*/.id),format.raw/*20.36*/("""</h1>
        <div id="nav">
            <a href="/post" class="btn btn-primary">Post post</a>
            <a href="/login" class="btn btn-primary"> Sing in/Sign up</a>
            """),_display_(/*24.14*/if(user.id > 0)/*24.29*/ {_display_(Seq[Any](format.raw/*24.31*/("""
                """),format.raw/*25.17*/("""<a href="/" class="btn btn-primary">All posts</a>
                <a href="/user/:uname" class="btn btn-primary">Home</a>
            """)))}),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""</div>
        <dl>
            """),_display_(/*30.14*/for(post <- plist) yield /*30.32*/ {_display_(Seq[Any](format.raw/*30.34*/("""
                """),_display_(/*31.18*/if(post.msg != "")/*31.36*/ {_display_(Seq[Any](format.raw/*31.38*/("""
                    """),format.raw/*32.21*/("""<dt>"""),_display_(/*32.26*/post/*32.30*/.name),format.raw/*32.35*/("""</dt>
                        <dd>"""),_display_(/*33.30*/post/*33.34*/.date),format.raw/*33.39*/("""</dd>
                        <dd>"""),_display_(/*34.30*/post/*34.34*/.msg),format.raw/*34.38*/("""</dd>
                """)))}),format.raw/*35.18*/("""
            """)))}),format.raw/*36.14*/("""
        """),format.raw/*37.9*/("""</dl>
    </body>
</html>
"""))
      }
    }
  }

  def render(plist:List[Post],user:User): play.twirl.api.HtmlFormat.Appendable = apply(plist,user)

  def f:((List[Post],User) => play.twirl.api.HtmlFormat.Appendable) = (plist,user) => apply(plist,user)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 01 23:19:02 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/hello.scala.html
                  HASH: 58f5ee2420371306967bf7c1231a452098a49783
                  MATRIX: 269->1|610->30|736->61|764->63|837->110|860->125|899->127|943->145|955->149|985->159|1029->173|1070->186|1103->191|1132->192|1177->209|1221->225|1250->226|1286->235|1670->592|1683->596|1707->599|1916->781|1940->796|1980->798|2025->815|2191->950|2227->959|2287->992|2321->1010|2361->1012|2406->1030|2433->1048|2473->1050|2522->1071|2554->1076|2567->1080|2593->1085|2655->1120|2668->1124|2694->1129|2756->1164|2769->1168|2794->1172|2848->1195|2893->1209|2929->1218
                  LINES: 10->1|15->2|20->2|22->4|25->7|25->7|25->7|26->8|26->8|26->8|27->9|28->10|28->10|28->10|29->11|30->12|30->12|31->13|38->20|38->20|38->20|42->24|42->24|42->24|43->25|45->27|46->28|48->30|48->30|48->30|49->31|49->31|49->31|50->32|50->32|50->32|50->32|51->33|51->33|51->33|52->34|52->34|52->34|53->35|54->36|55->37
                  -- GENERATED --
              */
          