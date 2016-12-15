

val my_list = List(2,3,4,5,6,7);

my_list.length;

my_list.last;


print("Init of list: " + my_list.init);





my_list.take(4);
my_list.drop(2);

my_list(0);









val xs = List(1,2,3,4,5,6);
val ys = List(7,8,9,10,11);

xs ++ ys;
xs ::: ys

xs::ys


xs.reverse;


def myReverse(x: List[Int]): List[Int] = {

  var length = x.length - 1;
  var reverseList: List[Int] = Nil;


  while( length > 0){
   println( x(length) );
    reverseList:+x(length);
    length = length - 1;


}
  reverseList;


}

val rev = myReverse(xs);

rev.foreach(println);
val new_xs = xs.updated(0, 12)
xs
xs indexOf(3);
xs contains 3

def myLast[T](xs: List[T]): T = xs match {

  case List() => throw new Error("Last of empty list")
  case List(x) => x
  case y::ys => myLast(ys)


}


myLast(xs);

def init[T](xs: List[T]): List[T] = xs match {

  case List() => throw new Error("init of empty");
  case List(x) => List();
  case y :: ys => {

    y :: init(ys); }


}

print(xs);

val my_init = init(xs);


my_init.foreach(println);




