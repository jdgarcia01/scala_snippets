

/* def squareList(xs: List[Int]): List[Int] = xs match {

  case Nil => xs;
  case y :: ys => y * y :: squareList(ys)


}  */

def squareList(xs: List[Int]): List[Int] = {

  xs map(x => x * x )

}

def posElems(xs: List[Int]): List[Int] = xs match {

  case Nil => xs;
  case y :: ys => if( y > 5){

    y::posElems(ys)

    } else {

    posElems(ys)
  }

}

def pack[T](xs: List[T]): List[List[T]] = xs match{
  case Nil => Nil;
  case x::xs1 => val (first, rest) = xs span(y => y == x)
    first:: pack(rest);


}
def encode[T](xs: List[T]): List[(T, Int)] =
{
  pack(xs).map(ys => (ys.head, ys.length))
}


def sum(xs: List[Int]): Int = xs match {

  case Nil => 0;
  case y::ys => y + sum(ys)

}

val john = List(1,2,3,4,5);
john :: 6 :: 7:: 8;


val list2 = List(2,3,4,4,4,5,5,5,5,5,2);
squareList(list2);
sum(list2);


posElems(list2);

encode(list2);


val result = pack(list2);


type Word = String;

val test: Word = "Hello";


test.groupBy(_.toLower).map { p => (p._1, p._2.length) }


