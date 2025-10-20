package com.example.activitat_04_m8_02

fun main (){
    var age = 1
    val ano:Int = 0

    val a:Long = 30

    //Float
    val floatExample:Float = 33.5f

    val charExample:Char = 'a'
    val stringExample:String = "mecagoenti"

    //variables booleanas

    val booleanExample:Boolean = false
    val hola = true

    // esto osn valores
  /*  fun getAge(age:Int){
        if (age == 1){
            println("enano")
        } else if (age >=2 ){
                println("hola"  )
            }else{
                println("adeu")
            }
    }   */

    fun getAge(age:Int){
        when(age){
            1 -> print("joven")
            2 -> println("joven")
            3-> print("joven casi joven")
            4 -> {  print("PROMPT")
                print("uuh")
            }
         }
    }




}
