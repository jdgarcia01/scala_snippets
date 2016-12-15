
object mergesort {

  val list1 = List(23,1,5,32,76,10,11,43,50,13,14,26);



  def msort(xs: List[Int]): List[Int] = {

    /**
      * Split the list into two lists.
      */
    val n = xs.length / 2

    /**
      * If  list is empty, then return the list.
      */
    if( n == 0) xs;

    else {

      def merge(xs: List[Int], ys: List[Int] ): List[Int] = (xs, ys) match {


        case (Nil, ys) => ys

        case (xs, Nil) => xs

        case (x :: xs1, y :: ys1 ) =>

          if(x < y) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }


      val (fst,snd) = xs splitAt(n)

      merge(msort(fst), msort(snd));

    }
  }

msort(list1);

}
/**
def scaleList(xs: List[Double], factor: Double): List[Double] = xs match {

  case Nil     => xs;
  case y :: ys => y * factor :: scaleList(ys, factor);


}



val list3 = List(2.0,3.0,4.0,5.0,6.0,7.0,8.0,9.0);

(scaleList(list3,4);  */






