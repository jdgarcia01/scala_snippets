
def concat[T](xs: List[T], ys: List[T]): List[T] = xs match {

  case List() => ys;
  case z :: zs => z :: concat(zs,ys)



}

def reverse[T](xs:List[T]):List[T] = xs match {

  case List() => xs;
  case xs :: xz =>  reverse(xz) ++ List(xs)



}

val str = new java.lang.String("My String");
val str2 = new java.lang.String(" Connect me");

str.toList.foreach(println);

val str3 = concat(str.toList, str2.toList);

str3.foreach(println);


reverse(str3);






List("Connect","Me").mkString(" ");


def isOdd(number: Int): Boolean = number match {

  case number => {

    if( number % 2 == 1) true
    else false;

  }

}



val list1 = List(1,2,3,4,5);
val list2 = List(6);
val list4 = List(7);

val rev = reverse(list1);


rev.filter(_ % 2 == 1 );





val list3 = concat(list1, list2);



list3;

val list5 = concat(list3, list4);

concat(List(), List(1,2,3,4,5,6,7));

def g(v: Int) = List(v - 1, v, v+ 1);



list5.map( x => { scala.math.pow(x, 8)});

list5.flatMap(x => g(x));
