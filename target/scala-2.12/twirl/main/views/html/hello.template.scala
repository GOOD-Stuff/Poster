
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
    <!--link href="/css/scalatra.css" rel="stylesheet" /!-->
    <link type="text/css" href="/css/poster.css" rel="stylesheet">
</head>
<body>
    <h1>"""),_display_(/*14.10*/greeting),format.raw/*14.18*/("""</h1>
    <div id="nav">
        <a href="/post" class="btn btn-primary">Post post</a>
        <a href="/login" class="btn btn-primary"> Sing in/Sign up</a>
        """),_display_(/*18.10*/if(user.id > 1)/*18.25*/ {_display_(Seq[Any](format.raw/*18.27*/("""
            """),format.raw/*19.13*/("""<a href="/" class="btn btn-primary">All posts</a>
            <a href="/user/"""),_display_(/*20.29*/user/*20.33*/.user_name),format.raw/*20.43*/("""" class="btn btn-primary">Home</a>
            <a href="/logout" class="btn btn-primary">Logout</a>
    """)))}),format.raw/*22.6*/("""
    """),format.raw/*23.5*/("""</div>
    <dl>
        """),_display_(/*25.10*/for(post <- plist) yield /*25.28*/ {_display_(Seq[Any](format.raw/*25.30*/("""
            """),_display_(/*26.14*/if(post.msg != "")/*26.32*/ {_display_(Seq[Any](format.raw/*26.34*/("""
            """),format.raw/*27.13*/("""<div class="item">
                <dt>"""),_display_(/*28.22*/post/*28.26*/.name),format.raw/*28.31*/("""</dt>
                    <div class="post_date"><dd>"""),_display_(/*29.49*/post/*29.53*/.date),format.raw/*29.58*/("""</dd></div>
                    """),_display_(/*30.22*/if(post.photo_path != null)/*30.49*/ {_display_(Seq[Any](format.raw/*30.51*/("""
                        """),_display_(/*31.26*/if(post.photo_path != "")/*31.51*/ {_display_(Seq[Any](format.raw/*31.53*/("""
                            """),format.raw/*32.29*/("""<img src=""""),_display_(/*32.40*/post/*32.44*/.photo_path),format.raw/*32.55*/("""">
                        """)))}),format.raw/*33.26*/("""
                    """)))}),format.raw/*34.22*/("""
                    """),format.raw/*35.21*/("""<dd>"""),_display_(/*35.26*/post/*35.30*/.msg),format.raw/*35.34*/("""</dd>
                    """),_display_(/*36.22*/if((user.id == post.user_id) && (user.id > 1))/*36.68*/ {_display_(Seq[Any](format.raw/*36.70*/("""
                        """),format.raw/*37.25*/("""<a href="/edit/"""),_display_(/*37.41*/post/*37.45*/.id),format.raw/*37.48*/("""" class="btn btn-primary">Edit</a>
                    """)))}),format.raw/*38.22*/("""
            """),format.raw/*39.13*/("""</div>
            """)))}),format.raw/*40.14*/("""
        """)))}),format.raw/*41.10*/("""
    """),format.raw/*42.5*/("""</dl>
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
                  DATE: Sun Nov 11 15:22:33 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/hello.scala.html
                  HASH: a0fbab13573847262c8d10f3bc074242938ea9c9
                  MATRIX: 269->1|617->30|761->79|789->81|1218->483|1247->491|1440->657|1464->672|1504->674|1545->687|1650->765|1663->769|1694->779|1829->884|1861->889|1913->914|1947->932|1987->934|2028->948|2055->966|2095->968|2136->981|2203->1021|2216->1025|2242->1030|2323->1084|2336->1088|2362->1093|2422->1126|2458->1153|2498->1155|2551->1181|2585->1206|2625->1208|2682->1237|2720->1248|2733->1252|2765->1263|2824->1291|2877->1313|2926->1334|2958->1339|2971->1343|2996->1347|3050->1374|3105->1420|3145->1422|3198->1447|3241->1463|3254->1467|3278->1470|3365->1526|3406->1539|3457->1559|3498->1569|3530->1574
                  LINES: 10->1|15->2|20->2|22->4|32->14|32->14|36->18|36->18|36->18|37->19|38->20|38->20|38->20|40->22|41->23|43->25|43->25|43->25|44->26|44->26|44->26|45->27|46->28|46->28|46->28|47->29|47->29|47->29|48->30|48->30|48->30|49->31|49->31|49->31|50->32|50->32|50->32|50->32|51->33|52->34|53->35|53->35|53->35|53->35|54->36|54->36|54->36|55->37|55->37|55->37|55->37|56->38|57->39|58->40|59->41|60->42
                  -- GENERATED --
              */
          