object ScalaFor extends App {
  for (x <- 1 to 10) {
    println(x)
  }
  for (x <- 1 until 10) {
    println(x)
  }
  //for循环高级
  //双循环,守卫条件
  for (i <- 1 to 3; j <- 1 to 4 if i != j) {
    printf("i = %d, j = %d , res = %d ", i, j, i * j)
    println()
  }

  //yield，是循环中处理每个元素，产生新集合
  for (x <- 1 to 10) yield x % 2;





}