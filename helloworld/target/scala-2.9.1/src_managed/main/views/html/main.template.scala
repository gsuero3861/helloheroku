
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*9.59*/routes/*9.65*/.Assets.at("images/favicon.png"))),format.raw/*9.97*/("""">
        <script src=""""),_display_(Seq[Any](/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.6.4.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        
        <header>
            <a href=""""),_display_(Seq[Any](/*15.23*/routes/*15.29*/.Application.index)),format.raw/*15.47*/("""">"""),_display_(Seq[Any](/*15.50*/title)),format.raw/*15.55*/("""</a>
        </header>
        
        <section>
            """),_display_(Seq[Any](/*19.14*/content)),format.raw/*19.21*/("""
        </section>
        
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html) = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.Html) = (title) => (content) => apply(title)(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 29 11:16:47 COT 2013
                    SOURCE: C:/playframework/helloworld/app/views/main.scala.html
                    HASH: 3247ec34fa0118c44305bccfc084ffb723fcc225
                    MATRIX: 759->1|866->31|954->84|980->89|1077->151|1091->157|1146->191|1242->252|1256->258|1309->290|1370->315|1385->321|1452->366|1594->472|1609->478|1649->496|1688->499|1715->504|1814->567|1843->574
                    LINES: 27->1|30->1|36->7|36->7|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|44->15|44->15|44->15|44->15|44->15|48->19|48->19
                    -- GENERATED --
                */
            