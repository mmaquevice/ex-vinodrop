
package views.html.tasks

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
object item extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Task,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(task: Task):play.api.templates.Html = {
        _display_ {

Seq[Any](format.raw/*1.14*/("""

<li data-task-id=""""),_display_(Seq[Any](/*3.20*/task/*3.24*/.id)),format.raw/*3.27*/("""">
    <h4>"""),_display_(Seq[Any](/*4.10*/task/*4.14*/.title)),format.raw/*4.20*/("""</h4>
    """),_display_(Seq[Any](/*5.6*/if(task.dueDate != null)/*5.30*/ {_display_(Seq[Any](format.raw/*5.32*/(""" 
        <time datetime=""""),_display_(Seq[Any](/*6.26*/task/*6.30*/.dueDate)),format.raw/*6.38*/("""">"""),_display_(Seq[Any](/*6.41*/task/*6.45*/.dueDate.format("MMM dd yyyy"))),format.raw/*6.75*/("""</time>
    """)))})),format.raw/*7.6*/("""

    """),_display_(Seq[Any](/*9.6*/if(task.assignedTo != null && task.assignedTo.email != null)/*9.66*/ {_display_(Seq[Any](format.raw/*9.68*/("""
        <span class="assignedTo">"""),_display_(Seq[Any](/*10.35*/task/*10.39*/.assignedTo.email)),format.raw/*10.56*/("""</span>
    """)))})),format.raw/*11.6*/("""
</li>"""))}
    }
    
    def render(task:Task): play.api.templates.Html = apply(task)
    
    def f:((Task) => play.api.templates.Html) = (task) => apply(task)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Jun 16 20:07:33 CEST 2013
                    SOURCE: C:/Users/Mateo/Desktop/Dropbox/Dropbox/IT/MyProjects/vinodrop/app/views/tasks/item.scala.html
                    HASH: 8db4b4b53bbc573affd96fd1b7a2f3ad6caa62cf
                    MATRIX: 726->1|815->13|873->36|885->40|909->43|957->56|969->60|996->66|1042->78|1074->102|1113->104|1176->132|1188->136|1217->144|1255->147|1267->151|1318->181|1362->195|1405->204|1473->264|1512->266|1584->302|1597->306|1636->323|1681->337
                    LINES: 26->1|29->1|31->3|31->3|31->3|32->4|32->4|32->4|33->5|33->5|33->5|34->6|34->6|34->6|34->6|34->6|34->6|35->7|37->9|37->9|37->9|38->10|38->10|38->10|39->11
                    -- GENERATED --
                */
            