package models
import anorm._
import anorm.SqlParser._
import play.api.db._
import play.api.Play.current
/**
 * Created by srijesh on 2/24/16.
 */
 case class Users (
                  firstname:String,
                  lastname:String,
                  phone1:String,
                  phone2:String,
                  email:String
                    )


 object Users{
   val signUp = {
     get[String]("firstname")~
     get[String]("lastname")~
     get[String]("phone1")~
     get[String]("phone2")~
     get[String]("email")map{
       case firstname~lastname~phone1~phone2~email => Users(firstname,lastname,phone1,phone2,email)
     }
   }

  def showSignUp:List[Users] = DB.withConnection{ implicit a=>
      SQL(
         """ Select *
             from SignUp
         """
      ).as(SignUpForm)
   }

 }

