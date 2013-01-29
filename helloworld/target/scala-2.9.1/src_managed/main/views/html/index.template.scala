
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Hello],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(helloForm: Form[Application.Hello]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main(title = "The 'helloworld' application")/*5.46*/ {_display_(Seq[Any](format.raw/*5.48*/("""
    
    <h1>Configure your 'Hello world':</h1>
    
    """),_display_(Seq[Any](/*9.6*/form(action = routes.Application.sayHello, args = 'id -> "helloform")/*9.75*/ {_display_(Seq[Any](format.raw/*9.77*/("""
        
        """),_display_(Seq[Any](/*11.10*/inputText(
            field = helloForm("name"),
            args = '_label -> "What's your name?", 'placeholder -> "World"
        ))),format.raw/*14.10*/("""
        
        """),_display_(Seq[Any](/*16.10*/inputText(
            field = helloForm("repeat"),
            args = '_label -> "How many times?", 'size -> 3, 'placeholder -> 10
        ))),format.raw/*19.10*/("""
        
        """),_display_(Seq[Any](/*21.10*/select(
            field = helloForm("color"), 
            options = options(
                "" -> "Default",
                "red" -> "Red",
                "green" -> "Green",
                "blue" -> "Blue"
            ),
            args = '_label -> "Choose a color"
        ))),format.raw/*30.10*/("""
        
        <p class="buttons">
            <input type="submit">
        <p>
        
    """)))})),format.raw/*36.6*/("""
    
""")))})))}
    }
    
    def render(helloForm:Form[Application.Hello]) = apply(helloForm)
    
    def f:((Form[Application.Hello]) => play.api.templates.Html) = (helloForm) => apply(helloForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 29 11:16:47 COT 2013
                    SOURCE: C:/playframework/helloworld/app/views/index.scala.html
                    HASH: a7bcb92cbbd2192c79d62f07e796bddc76698e66
                    MATRIX: 772->1|901->37|929->56|965->58|1017->102|1056->104|1149->163|1226->232|1265->234|1320->253|1476->387|1531->406|1694->547|1749->566|2056->851|2185->949
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|38->9|38->9|38->9|40->11|43->14|45->16|48->19|50->21|59->30|65->36
                    -- GENERATED --
                */
            