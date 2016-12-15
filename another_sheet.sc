


val cmd = "stop";

cmd match {

  case "start" | "go" => println("Starting process");
  case "stop"  | "quit" | "exit" => println("Exiting process");
  case _ => println("Invalid command");


}


// Match multiple case objects.
trait Command

case object Start extends Command;
case object Go    extends Command;
case object Stop  extends Command;
case object Whoa  extends Command;
case object John  extends Command;

def stop(): String  = { "Stopping";  }
def start(): String = { "Starting";  }


def isTrue(a: Any) = a match {

  case 0 | " " => false;
  case _ => true;

}



def executeCommand(cmd: Command) = cmd match {

  case Start | Go   => start();
  case Stop  | Whoa => stop();
  case default => println("You gave me default: " + default);

}


executeCommand(Start);
executeCommand(Stop);
executeCommand(John);

def echoWhatYouGaveMe(x: Any): String = x match {

  case 0 => "Zero";
  case true => "true";
  case false => "false";
  case "Hello" => "You said hello";
  case Nil => "Empty";
  case _ => "You gave me" + x.getClass();
}

echoWhatYouGaveMe(List(1,2,3,4));
echoWhatYouGaveMe(0)
echoWhatYouGaveMe(true)
echoWhatYouGaveMe(false);


val l = 1::2::3::7::Nil;

val z = 3::4::5::7::Nil;

l.toSet & z.toSet;


def listIntersect(a: List[Int], b: List[Int]): List[Int] = {

  var intersectList:List[Int] = Nil;

  if(a.isEmpty || b.isEmpty){
    a;
  }

  else {

   for(elem_a <- a){
     for(elem_b <- b){
       if(elem_a == elem_b) {
         println("Found a match: " + elem_b);
        intersectList = intersectList:+elem_b
       }

     }

   }



  }

  return intersectList;


}

def unionList(a: List[Int],b: List[Int]): List[Int] = {

  var unionList:List[Int] = Nil;

  for(elem_a <- a)
    unionList = unionList:+elem_a;

  for(elem_b <- b)
    unionList = unionList:+elem_b;

  unionList;



}

val list1 = List(1,2,3,4,5,6,7,8);
val list2 = List(2,4,6,8,10);


val list3 = listIntersect(list1,list2);



val list4 = unionList(list1, list2);
println("List4 is: " + list4);


print("List is: " + list3);
















