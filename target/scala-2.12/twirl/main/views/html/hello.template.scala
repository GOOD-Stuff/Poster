
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
/*1.2*/import org.poster.control._

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[Post],User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(plist: List[Post], user: User, greeting: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.51*/("""

"""),format.raw/*4.1*/("""<html>
    <head>
        <title>Poster</title>
        <!--link type="text/css" href="/css/bootstrap.css" rel="stylesheet" /!-->
        <!--link href="/css/bootstrap-responsive.css" rel="stylesheet" /!-->
        <!--link href="/css/syntax.css" rel="stylesheet" /!-->
        <link type="text/css" href="/css/scalatra.css" rel="stylesheet" />
    </head>
    <body>
        <h1>"""),_display_(/*13.14*/greeting),format.raw/*13.22*/("""</h1>
        <div id="nav">
            <a href="/post" class="btn btn-primary">Post post</a>
            <a href="/login" class="btn btn-primary"> Sing in/Sign up</a>
            """),_display_(/*17.14*/if(user.id > 1)/*17.29*/ {_display_(Seq[Any](format.raw/*17.31*/("""
                """),format.raw/*18.17*/("""<a href="/" class="btn btn-primary">All posts</a>
                <a href="/user/"""),_display_(/*19.33*/user/*19.37*/.user_name),format.raw/*19.47*/("""" class="btn btn-primary">Home</a>
                <a href="/logout" class="btn btn-primary">Logout</a>
            """)))}),format.raw/*21.14*/("""
        """),format.raw/*22.9*/("""</div>
        <dl>
            """),_display_(/*24.14*/for(post <- plist) yield /*24.32*/ {_display_(Seq[Any](format.raw/*24.34*/("""
                """),_display_(/*25.18*/if(post.msg != "")/*25.36*/ {_display_(Seq[Any](format.raw/*25.38*/("""
                    """),format.raw/*26.21*/("""<dt>"""),_display_(/*26.26*/post/*26.30*/.name),format.raw/*26.35*/("""</dt>
                        <dd>"""),_display_(/*27.30*/post/*27.34*/.date),format.raw/*27.39*/("""</dd>
                        <dd>"""),_display_(/*28.30*/post/*28.34*/.msg),format.raw/*28.38*/("""</dd>
                        """),_display_(/*29.26*/if((user.id == post.user_id) && (user.id > 1))/*29.72*/ {_display_(Seq[Any](format.raw/*29.74*/("""
                            """),format.raw/*30.29*/("""<a href="/edit/"""),_display_(/*30.45*/post/*30.49*/.id),format.raw/*30.52*/("""" class="btn btn-primary">Edit</a>
                        """)))}),format.raw/*31.26*/("""
                """)))}),format.raw/*32.18*/("""
            """)))}),format.raw/*33.14*/("""
        """),format.raw/*34.9*/("""</dl>
    </body>
</html>
"""))
      }
    }
  }

  def render(plist:List[Post],user:User,greeting:String): play.twirl.api.HtmlFormat.Appendable = apply(plist,user,greeting)

  def f:((List[Post],User,String) => play.twirl.api.HtmlFormat.Appendable) = (plist,user,greeting) => apply(plist,user,greeting)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Nov 04 18:56:49 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/hello.scala.html
                  HASH: fbe37215a2745f51ca6aa7e0cb29f18d34700f45
                  MATRIX: 269->1|617->30|761->79|789->81|1197->462|1226->470|1435->652|1459->667|1499->669|1544->686|1653->768|1666->772|1697->782|1845->899|1881->908|1941->941|1975->959|2015->961|2060->979|2087->997|2127->999|2176->1020|2208->1025|2221->1029|2247->1034|2309->1069|2322->1073|2348->1078|2410->1113|2423->1117|2448->1121|2506->1152|2561->1198|2601->1200|2658->1229|2701->1245|2714->1249|2738->1252|2829->1312|2878->1330|2923->1344|2959->1353
                  LINES: 10->1|15->2|20->2|22->4|31->13|31->13|35->17|35->17|35->17|36->18|37->19|37->19|37->19|39->21|40->22|42->24|42->24|42->24|43->25|43->25|43->25|44->26|44->26|44->26|44->26|45->27|45->27|45->27|46->28|46->28|46->28|47->29|47->29|47->29|48->30|48->30|48->30|48->30|49->31|50->32|51->33|52->34
                  -- GENERATED --
              */
          