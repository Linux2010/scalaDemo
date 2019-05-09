/**
  * 99乘法表
  */
object whileDo extends App {
  var row = 1
  while ( {
    row <= 9
  }) {
    var col = 1
    while ( {
      col <= row
    }) {
      printf("%d x %d = %d\t", col, row, row * col)
      col += 1
    }
    println
    row += 1
  }
}
//白钱买百鸡
//100块钱100只鸡。
//公鸡:5块/只
//  母鸡:3块/只
//  小鸡:1块/3只
object whee extends App(){
  //公鸡
  var cock = 0
  while ( {
    cock <= 20
  }) { //母鸡
    var hen = 0
    while ( {
      hen <= 100 / 3
    }) {
      var chicken = 0
      while ( {
        chicken <= 100
      }) {
        val money = cock * 5 + hen * 3 + chicken / 3
        val mount = cock + hen + chicken
        if (money == 100 && mount == 100){
          printf("cock: %d , hen : %d , chicken : %d", cock, hen, chicken)
          println()
        }
        chicken += 3;
      }
      hen += 1;
    }
    cock += 1;
  }
}