
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
/*1.2*/import org.poster.control._

object user extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[User,List[Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(user: User, plist: List[Post]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.33*/("""
"""),format.raw/*3.1*/("""<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>"""),_display_(/*6.13*/user/*6.17*/.user_name),format.raw/*6.27*/("""</title>
    <link type="text/css" href="/css/scalatra.css" rel="stylesheet" />
</head>
<body>
    <h1>Hello """),_display_(/*10.16*/user/*10.20*/.user_name),format.raw/*10.30*/("""!</h1>
    <div id="nav">
        <a href="/" class="btn btn-primary">Home</a>
    </div>
    <dl>
        """),_display_(/*15.10*/for(post <- plist) yield /*15.28*/ {_display_(Seq[Any](format.raw/*15.30*/("""
            """),_display_(/*16.14*/if(post.msg != "")/*16.32*/ {_display_(Seq[Any](format.raw/*16.34*/("""
                """),format.raw/*17.17*/("""<dt>"""),_display_(/*17.22*/post/*17.26*/.name),format.raw/*17.31*/("""</dt>
                    <dd>"""),_display_(/*18.26*/post/*18.30*/.date),format.raw/*18.35*/("""</dd>
                    <dd>"""),_display_(/*19.26*/post/*19.30*/.msg),format.raw/*19.34*/("""</dd>
            """)))}),format.raw/*20.14*/("""
        """)))}),format.raw/*21.10*/("""
    """),format.raw/*22.5*/("""</dl>
</body>
</html>
"""))
      }
    }
  }

  def render(user:User,plist:List[Post]): play.twirl.api.HtmlFormat.Appendable = apply(user,plist)

  def f:((User,List[Post]) => play.twirl.api.HtmlFormat.Appendable) = (user,plist) => apply(user,plist)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Nov 01 22:19:19 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/edit.scala.html
                  HASH: d64056a9b6bdf743cf863eeb0b09c86e91609ae8
                  MATRIX: 269->1|609->30|735->61|762->62|851->125|863->129|893->139|1030->249|1043->253|1074->263|1209->371|1243->389|1283->391|1324->405|1351->423|1391->425|1436->442|1468->447|1481->451|1507->456|1565->487|1578->491|1604->496|1662->527|1675->531|1700->535|1750->554|1791->564|1823->569
                  LINES: 10->1|15->2|20->2|21->3|24->6|24->6|24->6|28->10|28->10|28->10|33->15|33->15|33->15|34->16|34->16|34->16|35->17|35->17|35->17|35->17|36->18|36->18|36->18|37->19|37->19|37->19|38->20|39->21|40->22
                  -- GENERATED --
              */
