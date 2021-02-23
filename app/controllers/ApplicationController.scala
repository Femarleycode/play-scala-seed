package controllers

import com.google.inject.Inject
import play.api.mvc.{BaseController, ControllerComponents}

class ApplicationController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index() = TODO
}