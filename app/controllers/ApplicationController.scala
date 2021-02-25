package controllers

import play.api.mvc.{BaseController, ControllerComponents}

import javax.inject.Inject

class ApplicationController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def index() = TODO

  def create() = TODO

  def read() = TODO

  def update() = TODO

  def delete() = TODO
}