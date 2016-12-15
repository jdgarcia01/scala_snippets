import scala.collection.immutable._;

val list1 = List("John", "Kathy", "Maya","Moka","Kara");

val list2 = List("Moka", "Phil", "Terri","Jimmi");

list1.intersect(list2).toString;

val l = List(1,2,3,4,5);

def g(v:Int) = List(v-1, v, v + 1)

l.map(x => x * 2)

val lis = l.map(x => g(x))


val flat = l.flatMap(x => g(x))



flat.iterator.sliding(2).toList

flat:+3


val mySet = Set("Bundles","Rain Drop", "Kakey", "Milkys","Silkys")


val meanSet = Set("Bundles", "Rain Drop","Kakey", "Milkys","Silkys", "Meany")

mySet+"John"
mySet+ "Baby Trundles"
mySet+ "Baby Wundles"
mySet.contains("Rain Drop")

meanSet &~ mySet
meanSet & mySet
val unionSet = ((meanSet &~ mySet).union(mySet))
unionSet.count({ x => x == "Meany"} )
unionSet.size



case class Point(xc: Int, yc: Int){

  var x: Int = xc;
  var y: Int = yc;

  def move(dx: Int, dy: Int): Unit ={

    x = x + dx;
    y = y + dy;

    println("Point x location: " + x);
    println("Point y location: " + y);


  }

}


val point = new Point(10,10);

point.move(2,3);



def check_point(x: Any) = {

  case Point => println("We have a point");
  case _ => println("We have something else");


}


check_point(point);

check_point(List(1,2,3,4));























