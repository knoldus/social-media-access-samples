package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  def index = Action {
    Ok(views.html.fbpublicdata("Facebook"))
  }
  
  def fbdata(fbusername:String) = Action{
    
    Ok(views.html.fbdata(fbusername))
 
  }
}

