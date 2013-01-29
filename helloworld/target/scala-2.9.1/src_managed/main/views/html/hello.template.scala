
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
object hello extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[String,Int,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(name: String, repeat: Int, color: String):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.44*/("""

"""),_display_(Seq[Any](/*3.2*/main("Here is the result:")/*3.29*/ {_display_(Seq[Any](format.raw/*3.31*/("""
    
    <ul style="color: """),_display_(Seq[Any](/*5.24*/if(color != null)/*5.41*/ {_display_(Seq[Any](format.raw/*5.43*/(""" """),_display_(Seq[Any](/*5.45*/color)),format.raw/*5.50*/(""" """)))}/*5.53*/else/*5.58*/{_display_(Seq[Any](format.raw/*5.59*/(""" "inherited" """)))})),format.raw/*5.73*/("""">
        """),_display_(Seq[Any](/*6.10*/for(i <- 1 to repeat) yield /*6.31*/ {_display_(Seq[Any](format.raw/*6.33*/("""
            <li>Hello """),_display_(Seq[Any](/*7.24*/name)),format.raw/*7.28*/("""!</li>
        """)))})),format.raw/*8.10*/("""
    </ul>
    
    <p class="buttons">
        <a href=""""),_display_(Seq[Any](/*12.19*/routes/*12.25*/.Application.index)),format.raw/*12.43*/("""">Back to the form</a>
    </p>
    
""")))})))}
    }
    
    def render(name:String,repeat:Int,color:String) = apply(name,repeat,color)
    
    def f:((String,Int,String) => play.api.templates.Html) = (name,repeat,color) => apply(name,repeat,color)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Tue Jan 29 11:16:47 COT 2013
                    SOURCE: C:/playframework/helloworld/app/views/hello.scala.html
                    HASH: 1622bf053509c57c291edfce31921d5aca261f23
                    MATRIX: 766->1|885->43|922->46|957->73|996->75|1060->104|1085->121|1124->123|1161->125|1187->130|1207->133|1219->138|1257->139|1302->153|1349->165|1385->186|1424->188|1483->212|1508->216|1555->232|1649->290|1664->296|1704->314
                    LINES: 27->1|30->1|32->3|32->3|32->3|34->5|34->5|34->5|34->5|34->5|34->5|34->5|34->5|34->5|35->6|35->6|35->6|36->7|36->7|37->8|41->12|41->12|41->12
                    -- GENERATED --
                */
            