package com.example.demo.domain.kotlin


/**
 * Kotlin test
 *
 * <pre>Kotlin 功能</pre>
 * <li>简洁: 大大减少样板代码的数量</li>
 * <li>安全: 避免空指针异常等整个类的错误</li>
 * <li>互操作性: 充分利用 JVM、Android 和浏览器的现有库</li>
 * <li>工具友好: 可用任何 Java IDE 或者使用命令行构建</li>
 *
 * @author orange
 * @Time 2018/2/28 0028
 */
class KotlinTest(val name: String) {

    val a: Int = 1
    val b = 1       // 系统自动推断变量类型为Int

    fun greet() {
        print("Hello, $name")
    }

    fun sum(a: Int, b: Int): Int {   // Int 参数，返回值 Int
        return a + b
    }

    fun printSum(a: Int, b: Int): Unit {  //无返回值
        print(a + b)
    }

    fun vars(vararg v:Int){  //可变参数
        for(vt in v){
            print(vt)
        }
    }

    val sumLambda: (Int, Int) -> Int = {x,y -> x+y}
}

fun main(args: Array<String>) {
    // 可变变量定义：var 关键字
    // 不可变变量定义：val 关键字，只能赋值一次的变量
    val a: Int = 1
    val b = 1       // 系统自动推断变量类型为Int
    val c: Int      // 如果不在声明时初始化则必须提供变量类型
    c = 1           // 明确赋值


    var x = 5        // 系统自动推断变量类型为Int
    x += 1           // 变量可修改

    KotlinTest("nihao").greet()          // 创建一个对象不用 new 关键字
}


