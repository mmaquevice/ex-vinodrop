
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
                    DATE: Sat Jul 27 17:55:21 CEST 2013
                    SOURCE: C:/Users/Mateo/Desktop/Dropbox/Dropbox/IT/MyProjects/vinodrop/app/views/index.scala.html
                    HASH: 92fcfdc8cad5f4100eabf8ba0b5fe8a9f52616c4
                    MATRIX: 746->1|883->61|922->66|950->86|989->88|1214->277|1232->286|1264->309|1275->325|1308->349|1348->351|1439->406|1455->413|1480->416|1579->479|1595->486|1622->491|1797->630|1811->635|1824->639|1872->649|1929->670|1943->675|1987->697|2036->714|2152->808
                    LINES: 26->1|29->1|31->3|31->3|31->3|41->13|41->13|41->13|41->14|41->14|41->14|42->15|42->15|42->15|44->17|44->17|44->17|48->21|48->21|48->21|48->21|49->22|49->22|49->22|50->23|54->28
                    -- GENERATED --
                */
            