
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
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object login extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Application.Login],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[Application.Login]):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.33*/("""

<html>
    <head>
        <title>Zentasks</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*6.59*/routes/*6.65*/.Assets.at("images/favicon.png"))),format.raw/*6.97*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*7.70*/routes/*7.76*/.Assets.at("stylesheets/login.css"))),format.raw/*7.111*/("""">
    </head>
    <body>
        <header>
            <a href=""""),_display_(Seq[Any](/*11.23*/routes/*11.29*/.Application.index)),format.raw/*11.47*/("""" id="logo"><span>Zen</span>tasks</a>
        </header>
        
        """),_display_(Seq[Any](/*14.10*/helper/*14.16*/.form(routes.Application.authenticate)/*14.54*/ {_display_(Seq[Any](format.raw/*14.56*/("""
		   <h1>Sign in</h1>
		
			"""),_display_(Seq[Any](/*17.5*/if(form.hasGlobalErrors)/*17.29*/ {_display_(Seq[Any](format.raw/*17.31*/("""
    			<p class="error">
       				"""),_display_(Seq[Any](/*19.13*/form/*19.17*/.globalError.message)),format.raw/*19.37*/("""
    			</p>
			""")))})),format.raw/*21.5*/("""
			
			"""),_display_(Seq[Any](/*23.5*/if(flash.contains("success"))/*23.34*/ {_display_(Seq[Any](format.raw/*23.36*/("""
			    <p class="success">
			        """),_display_(Seq[Any](/*25.13*/flash/*25.18*/.get("success"))),format.raw/*25.33*/("""
			    </p>
			""")))})),format.raw/*27.5*/("""
		
		   <p>
		       <input type="email" name="email" placeholder="Email" value=""""),_display_(Seq[Any](/*30.71*/form("email")/*30.84*/.value)),format.raw/*30.90*/("""">
		   </p>
		   <p>
		       <input type="password" name="password" placeholder="Password">
		   </p>
		   <p>
		       <button type="submit">Login</button>
		   </p>
	""")))})),format.raw/*38.3*/("""
    
    </body>
</html>"""))}
    }
    
    def render(form:Form[Application.Login]): play.api.templates.Html = apply(form)
    
    def f:((Form[Application.Login]) => play.api.templates.Html) = (form) => apply(form)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 16 22:21:41 CEST 2013
                    SOURCE: C:/Users/Mateo/Desktop/Dropbox/Dropbox/IT/MyProjects/vinodrop/app/views/login.scala.html
                    HASH: 515e058ebb2d8ea24663888b9cdae5fc021cf38c
                    MATRIX: 740->1|848->32|998->147|1012->153|1065->185|1173->258|1187->264|1244->299|1349->368|1364->374|1404->392|1517->469|1532->475|1579->513|1619->515|1687->548|1720->572|1760->574|1836->614|1849->618|1891->638|1941->657|1987->668|2025->697|2065->699|2143->741|2157->746|2194->761|2244->780|2366->866|2388->879|2416->885|2626->1064
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|39->11|39->11|39->11|42->14|42->14|42->14|42->14|45->17|45->17|45->17|47->19|47->19|47->19|49->21|51->23|51->23|51->23|53->25|53->25|53->25|55->27|58->30|58->30|58->30|66->38
                    -- GENERATED --
                */
            