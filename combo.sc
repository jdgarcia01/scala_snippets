

val ys = Map("a" -> List(1 -> 11,1 -> 111), "b" -> List(2 -> 22,2 -> 222)).flatMap(_._2)

ys

val my_set = List(('a', 2), ('b', 2))

val result = ((1 to my_set.length) flatMap(x => my_set.combinations(x));
result;
