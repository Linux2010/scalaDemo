object ScalaDef extends App     {
  //阶乘递归方法
  def fac(n: Int): Int = {
    if (n == 1) {
      1
    } else {
      n * fac(n - 1)
    }
  }

  println(fac(10))

  def sum (args: Int*):Int={
    var sum=0;
    for(arg<- args){
      sum +=arg
    }
     return sum
  }
  println(sum(1,2,3,4,5,6,7))
}
