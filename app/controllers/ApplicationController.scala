javax.inject.Inject
play.api.mvc.ControllerComponents

class ApplicationController @Inject()(val controllerComponents: ControllerComponents) extends BaseController




def index() = TODO