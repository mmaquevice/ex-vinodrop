
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],User,Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projects: List[Project], user: User)(body: Html):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.51*/("""

<html>
    <head>
        <title>Zentasks</title>
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq[Any](/*6.70*/routes/*6.76*/.Assets.at("stylesheets/main.css"))),format.raw/*6.110*/("""">
        <script type="text/javascript" src=""""),_display_(Seq[Any](/*7.46*/routes/*7.52*/.Assets.at("javascripts/jquery-1.7.1.js"))),format.raw/*7.93*/(""""></script>        
    </head>
    <body>
		<header>
		    <a href=""""),_display_(Seq[Any](/*11.17*/routes/*11.23*/.Application.index)),format.raw/*11.41*/("""" id="logo"><span>Zen</span>tasks</a>
			<dl id="user">
			    <dt>"""),_display_(Seq[Any](/*13.13*/user/*13.17*/.name)),format.raw/*13.22*/(""" <span>("""),_display_(Seq[Any](/*13.31*/user/*13.35*/.email)),format.raw/*13.41*/(""")</span></dt>
			    <dd>
			        <a href=""""),_display_(Seq[Any](/*15.22*/routes/*15.28*/.Application.logout())),format.raw/*15.49*/("""">Logout</a>
			    </dd>
			</dl>
		</header>
        <nav>
            <h4 class="dashboard"><a href="#/">Dashboard</a></h4>
            <ul id="projects">
                """),_display_(Seq[Any](/*22.18*/projects/*22.26*/.groupBy(_.folder).map/*22.48*/ {/*23.21*/case (group, projects) =>/*23.46*/ {_display_(Seq[Any](format.raw/*23.48*/("""
                        """),_display_(Seq[Any](/*24.26*/views/*24.31*/.html.projects.group(group, projects))),format.raw/*24.68*/("""
                    """)))}})),format.raw/*26.18*/("""
            </ul>
        </nav>
        <section id="main">
            """),_display_(Seq[Any](/*30.14*/body)),format.raw/*30.18*/("""
        </section>
    </body>
</html>"""))}
    }
    
    def render(projects:List[Project],user:User,body:Html): play.api.templates.Html = apply(projects,user)(body)
    
    def f:((List[Project],User) => (Html) => play.api.templates.Html) = (projects,user) => (body) => apply(projects,user)(body)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 16 22:26:21 CEST 2013
                    SOURCE: C:/Users/Mateo/Desktop/Dropbox/Dropbox/IT/MyProjects/vinodrop/app/views/main.scala.html
                    HASH: ca36f0cdb2a1c83c53fd22339d7893ec9788b8ae
                    MATRIX: 739->1|865->50|1021->171|1035->177|1091->211|1174->259|1188->265|1250->306|1356->376|1371->382|1411->400|1515->468|1528->472|1555->477|1600->486|1613->490|1641->496|1724->543|1739->549|1782->570|1993->745|2010->753|2041->775|2052->798|2086->823|2126->825|2188->851|2202->856|2261->893|2316->933|2427->1008|2453->1012
                    LINES: 26->1|29->1|34->6|34->6|34->6|35->7|35->7|35->7|39->11|39->11|39->11|41->13|41->13|41->13|41->13|41->13|41->13|43->15|43->15|43->15|50->22|50->22|50->22|50->23|50->23|50->23|51->24|51->24|51->24|52->26|56->30|56->30
                    -- GENERATED --
                */
            