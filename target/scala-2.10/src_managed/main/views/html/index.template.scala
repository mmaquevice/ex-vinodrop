
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[List[Project],List[Task],User,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(projects: List[Project], todoTasks: List[Task], user: User):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.62*/("""

"""),_display_(Seq[Any](/*3.2*/main(projects, user)/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""

    <header>
        <hgroup>
            <h1>Dashboard</h1>
            <h2>Tasks over all projects</h2>
        </hgroup>
    </header>

    <article  class="tasks">
        """),_display_(Seq[Any](/*13.10*/todoTasks/*13.19*/.groupBy(_.project).map/*13.42*/ {/*14.13*/case (project, tasks) =>/*14.37*/ {_display_(Seq[Any](format.raw/*14.39*/("""
                <div class="folder" data-folder-id=""""),_display_(Seq[Any](/*15.54*/project/*15.61*/.id)),format.raw/*15.64*/("""">
                    <header>
                        <h3>"""),_display_(Seq[Any](/*17.30*/project/*17.37*/.name)),format.raw/*17.42*/("""</h3>
                    </header>
                    <ul class="list">
                            <ul class="list">
        						"""),_display_(Seq[Any](/*21.16*/tasks/*21.21*/.map/*21.25*/ { task =>_display_(Seq[Any](format.raw/*21.35*/("""
            						"""),_display_(Seq[Any](/*22.20*/views/*22.25*/.html.tasks.item(task))),format.raw/*22.47*/("""
       							""")))})),format.raw/*23.16*/("""
    						</ul>
                    </ul>
                </div>
            """)))}})),format.raw/*28.10*/("""
    </article>

""")))})))}
    }
    
    def render(projects:List[Project],todoTasks:List[Task],user:User): play.api.templates.Html = apply(projects,todoTasks,user)
    
    def f:((List[Project],List[Task],User) => play.api.templates.Html) = (projects,todoTasks,user) => apply(projects,todoTasks,user)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 16 22:26:21 CEST 2013
                    SOURCE: C:/Users/Mateo/Desktop/Dropbox/Dropbox/IT/MyProjects/vinodrop/app/views/index.scala.html
                    HASH: 14974624277cc486f2803624cc81b36046e0cb68
                    MATRIX: 746->1|883->61|920->64|948->84|987->86|1202->265|1220->274|1252->297|1263->312|1296->336|1336->338|1426->392|1442->399|1467->402|1564->463|1580->470|1607->475|1778->610|1792->615|1805->619|1853->629|1909->649|1923->654|1967->676|2015->692|2127->781
                    LINES: 26->1|29->1|31->3|31->3|31->3|41->13|41->13|41->13|41->14|41->14|41->14|42->15|42->15|42->15|44->17|44->17|44->17|48->21|48->21|48->21|48->21|49->22|49->22|49->22|50->23|54->28
                    -- GENERATED --
                */
            