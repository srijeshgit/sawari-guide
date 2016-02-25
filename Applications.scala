package controllers

import play.api.data._
import play.api.data.Forms._
import play.api.mvc._
import models._

/**
 * Created by srijesh on 2/24/16.
 */
object Applications extends Controller {

  val signUpForm = Form(
    mapping(
      "firstname" -> nonEmptyText,
      "lastname" -> nonEmptyText,
      "phone1" -> nonEmptyText,
      "phone2" -> text,
      "email" -> nonEmptyText
    )(Users.apply)(Users.unapply)
  )

  def signForm = Action {
    Ok(views.html.signup(signUpForm))
  }

  def
}
