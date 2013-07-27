// @SOURCE:C:/Users/Mateo/Desktop/Dropbox/Dropbox/IT/MyProjects/vinodrop/conf/routes
// @HASH:18a6152f49035d0f5919ed009ad26e57f75a3f34
// @DATE:Sat Jul 27 15:43:20 CEST 2013


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix  
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" } 


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_login1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:8
private[this] lazy val controllers_Application_authenticate2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:9
private[this] lazy val controllers_Application_logout3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:11
private[this] lazy val controllers_Projects_add4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects"))))
        

// @LINE:12
private[this] lazy val controllers_Projects_addGroup5 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/groups"))))
        

// @LINE:13
private[this] lazy val controllers_Projects_delete6 = Route("DELETE", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+"""))))
        

// @LINE:14
private[this] lazy val controllers_Projects_rename7 = Route("PUT", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("projects/"),DynamicPart("project", """[^/]+"""))))
        

// @LINE:17
private[this] lazy val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+"""))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.authenticate()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects""","""controllers.Projects.add()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/groups""","""controllers.Projects.addGroup()"""),("""DELETE""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>""","""controllers.Projects.delete(project:Long)"""),("""PUT""", prefix + (if(prefix.endsWith("/")) "" else "/") + """projects/$project<[^/]+>""","""controllers.Projects.rename(project:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
       
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_login1(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:8
case controllers_Application_authenticate2(params) => {
   call { 
        invokeHandler(controllers.Application.authenticate(), HandlerDef(this, "controllers.Application", "authenticate", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:9
case controllers_Application_logout3(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:11
case controllers_Projects_add4(params) => {
   call { 
        invokeHandler(controllers.Projects.add(), HandlerDef(this, "controllers.Projects", "add", Nil,"POST", """""", Routes.prefix + """projects"""))
   }
}
        

// @LINE:12
case controllers_Projects_addGroup5(params) => {
   call { 
        invokeHandler(controllers.Projects.addGroup(), HandlerDef(this, "controllers.Projects", "addGroup", Nil,"POST", """""", Routes.prefix + """projects/groups"""))
   }
}
        

// @LINE:13
case controllers_Projects_delete6(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(controllers.Projects.delete(project), HandlerDef(this, "controllers.Projects", "delete", Seq(classOf[Long]),"DELETE", """""", Routes.prefix + """projects/$project<[^/]+>"""))
   }
}
        

// @LINE:14
case controllers_Projects_rename7(params) => {
   call(params.fromPath[Long]("project", None)) { (project) =>
        invokeHandler(controllers.Projects.rename(project), HandlerDef(this, "controllers.Projects", "rename", Seq(classOf[Long]),"PUT", """""", Routes.prefix + """projects/$project<[^/]+>"""))
   }
}
        

// @LINE:17
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}
    
}
        