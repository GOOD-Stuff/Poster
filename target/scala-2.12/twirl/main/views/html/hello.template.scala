
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
        <title>Kek</title>
        <!--link type="text/css" href="/css/bootstrap.css" rel="stylesheet" /!-->
        <!--link href="/css/bootstrap-responsive.css" rel="stylesheet" /!-->
        <!--link href="/css/syntax.css" rel="stylesheet" /!-->
        <link type="text/css" href="/css/scalatra.css" rel="stylesheet" />
    </head>
    <body>
        <h1>RABOTAY!1!!!1, """),_display_(/*13.29*/user/*13.33*/.id),format.raw/*13.36*/("""</h1>
        <div id="nav">
            <a href="/post" class="btn btn-primary">Post post</a>
            <a href="/login" class="btn btn-primary"> Sing in/Sign up</a>
        </div>
        <dl>
            """),_display_(/*19.14*/for(order <- plist) yield /*19.33*/ {_display_(Seq[Any](format.raw/*19.35*/("""
                """),_display_(/*20.18*/if(order.msg != "")/*20.37*/ {_display_(Seq[Any](format.raw/*20.39*/("""
                    """),format.raw/*21.21*/("""<dt>"""),_display_(/*21.26*/order/*21.31*/.name),format.raw/*21.36*/("""</dt>
                        <dd>"""),_display_(/*22.30*/order/*22.35*/.date),format.raw/*22.40*/("""</dd>
                        <dd>"""),_display_(/*23.30*/order/*23.35*/.msg),format.raw/*23.39*/("""</dd>
                """)))}),format.raw/*24.18*/("""
            """)))}),format.raw/*25.14*/("""
        """),format.raw/*26.9*/("""</dl>
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
                  DATE: Wed Oct 31 23:45:50 MSK 2018
                  SOURCE: /home/vldmr/Projects/Scala/Poster/src/main/twirl/views/hello.scala.html
                  HASH: a65dea48ad9ce5d23c42e010101f2003aa2774d8
                  MATRIX: 269->1|610->30|736->61|764->63|1184->456|1197->460|1221->463|1458->673|1493->692|1533->694|1578->712|1606->731|1646->733|1695->754|1727->759|1741->764|1767->769|1829->804|1843->809|1869->814|1931->849|1945->854|1970->858|2024->881|2069->895|2105->904
                  LINES: 10->1|15->2|20->2|22->4|31->13|31->13|31->13|37->19|37->19|37->19|38->20|38->20|38->20|39->21|39->21|39->21|39->21|40->22|40->22|40->22|41->23|41->23|41->23|42->24|43->25|44->26
                  -- GENERATED --
              */
          