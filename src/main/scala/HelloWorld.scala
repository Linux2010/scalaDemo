/**
  * @项目名称: helloworld
  * @类名称:
  * @类描述:
  * @功能描述:
  * @创建人: tianfs1@yusys.com.cn
  * @创建时间: 2018/12/20
  * @修改备注:
  * @修改记录: 修改时间    修改人员    修改原因
  *        -------------------------------------------------------------
  * @version 1.0.0
  * @Copyright (c) 2018宇信科技-版权所有
  */
object HelloWorld extends App {
  println("hello world!")
  println("hello " + args(0) + "!!")
  /*
  * 函数
  * */
  var helloName = hello("tianfusheng")
  println(helloName)

  def hello(name: String): String = s"hello,${name}"

  /*
  * if list for
  * */
  var list = List("TOM", "CAT", "WEB", "tianfusheng", "YES")
  for (s <- list) println(s) //遍历list元素
  for (s <- list) if (s.length > 3) println(s) //输出list中length大于3的元素
  for {s <- list; list2 = s.toUpperCase; if (s.length > 3)} yield (list2); //导出新的list2

  /*
  * try
  * */
  try {
    Integer.parseInt("hello")
  } catch {
    case _ => 0
  } finally {
    println("hello is not a number")
  }
  /*
  *match
  * */
  var code = 1;
  var result_match = code match {
    case 1 => "one"
    case 2 => "two"
    case _ => "other"
  }
  println(result_match)

  /*
  * 柯里化
  * */
  def curriedAdd(a: Int)(b: Int): Int = a + b

  println(curriedAdd(2)(3))
  val addOne = curriedAdd(1) _
  addOne(2)

  /*
  * 递归函数
  * */
  @annotation.tailrec
  def factorial(n: Int, m: Int): Int =
    if (n <= 0) m
    else factorial(n - 1, m * n)

  println(factorial(5, 1))

  def sum(f: Int => Int)(a: Int)(b: Int): Int = {
    @annotation.tailrec
    def loop(n: Int, acc: Int): Int =
      if (n > b) acc
      else loop(n + 1, acc + f(n))

    loop(a, 0)
  }

  var result = sum(x => x * x)(1)(5)
  println(result)

  /*
  * collections  -- list
  *
  * */
  val a = List(1, 2, 3, 4)
  val b = 0 :: a
  val c = "x" :: "y" :: "z" :: Nil
  val d = a ::: c

  println(a.head)
  println(b.tail)
  println(c.isEmpty)

  def forEach(l: List[Int]): String = {
    if (l.isEmpty) ""
    else l.head.toString + "," + forEach(l.tail)
  }

  println(forEach(a))

  println(a.filter(x => x % 2 == 1))

  println(c.map(x => x.toUpperCase))


  /*
  * map
  *
  * */
  val p = Map(1 -> "David", 2 -> "Tom")
  println(p(1))
  println(p.contains(2))
  println(p.values)
  p + (8 -> "Ant")
  p - 1
  println(p.keys)
  p ++ List(3 -> "fff", 4 -> "ddd")
  println(p)


  def qSort(a: List[Int]): List[Int] = {
    if (a.length < 2) a
    else qSort(a.filter(a.head > _)) ++
      a.filter(a.head == _) ++
      qSort(a.filter(a.head < _))
  }

  println(qSort(List(5, 3, 4, 2, 7, 8, 0, 1, 11, 9)))


}

