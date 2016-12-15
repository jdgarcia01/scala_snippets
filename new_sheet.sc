abstract class Notification;

case class Email(sourceEmail: String, title: String, body: String) extends Notification;
case class SMS(sourceNUmber: String, message: String) extends Notification;


val emailFromMe = Email("john.d.garcia@gmail.com", "Test", "Hello!");
val sms = SMS("210-555-6666", "Hello World, from Mars");





val title_ = emailFromMe.title;
println(title_ );


val mess = sms.message;

println(mess);


def showNotification(notification: Notification): String = {

  val textSet = Set();

  notification match {
    case Email(email, title,_ ) =>
      "You got an email from " + email + " with title: " + title + " body ";

    case SMS(number, message) =>
      "You got an SMS from " + number + " ! Message: " + message;
    case _ => "We got some unusual!"

  }



}

val myList = List(1,2,3,4);

showNotification(emailFromMe);
showNotification(sms);


def getClassAsString(x: Any): String = x match {

  case s: String => s + " is a String";
  case i: Int => "Int";
  case l: List[_] => "List";
  case f: Float => "Float";
  case d: Double => "Double";
  case default => "default: " + default;


}

getClassAsString(myList);
getClassAsString(sms);
getClassAsString(1);
getClassAsString(1.0);




val i = 2;


i match {
  case 1 | 3 |5 |7 |9 => println("odd");
  case 2 | 4 |6 |8 | 10 => println("Even");


}

