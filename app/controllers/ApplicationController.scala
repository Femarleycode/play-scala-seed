package controllers

import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents, Request}
import repositories.DataRepository

import javax.inject.Inject
import scala.concurrent.ExecutionContext


class ApplicationController @Inject()(val controllerComponents: ControllerComponents,
                                      dataRepository: DataRepository,
                                      implicit val ec: ExecutionContext) extends BaseController {

  def index(): Action[AnyContent] = Action.async { implicit request =>
    dataRepository.find().map (items => Ok(Json.toJson(items)))
  }

  def create() = TODO

  def read(id: String) = TODO

  def update(id: String) = TODO

  def delete(id: String) = TODO
}