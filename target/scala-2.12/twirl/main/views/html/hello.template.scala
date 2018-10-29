
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
/*1.2*/import org.poster.control.Post

object hello extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Post],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(plist: List[Post]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.21*/("""

"""),format.raw/*4.1*/("""<html>
    <head>
        <title>Kek</title>
        <!--link type="text/css" href="/css/bootstrap.css" rel="stylesheet" /!-->
        <!--link href="/css/bootstrap-responsive.css" rel="stylesheet" /!-->
        <!--link href="/css/syntax.css" rel="stylesheet" /!-->
        <link type="text/css" href="/css/scalatra.css" rel="stylesheet" />
    </head>
    <body>
        <h1>RABOTAY!1!!!1</h1>
        <div id="nav">
            <a href=/post class="btn btn-primary">Post post</a>
        </div>
        <dl>
            """),_display_(/*18.14*/for(order <- plist) yield /*18.33*/ {_display_(Seq[Any](format.raw/*18.35*/("""
                """),_display_(/*19.18*/if(order.msg != "")/*19.37*/ {_display_(Seq[Any](format.raw/*19.39*/("""
                    """),format.raw/*20.21*/("""<dt>"""),_display_(/*20.26*/order/*20.31*/.name),format.raw/*20.36*/("""</dt>
                        <dd>"""),_display_(/*21.30*/order/*21.35*/.date),format.raw/*21.40*/("""</dd>
                        <dd>"""),_display_(/*22.30*/order/*22.35*/.msg),format.raw/*22.39*/("""</dd>
                """)))}),format.raw/*23.18*/("""
            """)))}),format.raw/*24.14*/("""
        """),format.raw/*25.9*/("""</dl>
    </body>
</html>
"""))
      }
    }
  }

  def render(plist:List[Post]): play.twirl.api.HtmlFormat.Appendable = apply(plist)

  def f:((List[Post]) => play.twirl.api.HtmlFormat.Appendable) = (plist) => apply(plist)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Oct 29 22:07:56 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/hello.scala.html
                  HASH: 13bede2b2eb36054290800ef3696c09397284ba7
                  MATRIX: 269->1|608->33|722->52|750->54|1301->578|1336->597|1376->599|1421->617|1449->636|1489->638|1538->659|1570->664|1584->669|1610->674|1672->709|1686->714|1712->719|1774->754|1788->759|1813->763|1867->786|1912->800|1948->809
                  LINES: 10->1|15->2|20->2|22->4|36->18|36->18|36->18|37->19|37->19|37->19|38->20|38->20|38->20|38->20|39->21|39->21|39->21|40->22|40->22|40->22|41->23|42->24|43->25
                  -- GENERATED --
              */
          