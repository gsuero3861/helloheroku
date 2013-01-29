// @SOURCE:C:/playframework/helloworld/conf/routes
// @HASH:e0351f62f1d1f23e407acf2e52411ada49e9b625
// @DATE:Tue Jan 29 11:16:47 COT 2013

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def sayHello() = {
   Call("GET", "/hello")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def sayHello = JavascriptReverseRoute(
   "controllers.Application.sayHello",
   """
      function() {
      return _wA({method:"GET", url:"/hello"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:9
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def sayHello() = new play.api.mvc.HandlerRef(
   controllers.Application.sayHello(), HandlerDef(this, "controllers.Application", "sayHello", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:12
class ReverseAssets {
    


 
// @LINE:12
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                