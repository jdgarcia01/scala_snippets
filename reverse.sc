
val list1 = List(1,2,3,4,5);
val list2 = List(6,7,8,9,10);



def reverse[T](xs: List[T]): List[T] = xs match {

  case List() => xs;
  case y::ys  => reverse(ys) ++ List(y);


}


val list3 = reverse(list1);

def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n + 1)

removeAt(1, list1);





