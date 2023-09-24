package fundamentos

fun main() {
    printa1a10()
    whileMenorQue10 ()
}

fun whileMenorQue10(){
    var x = 0
    println("while")
    while (x < 10){
        println(x)
        x++
    }
}


fun doWhieleMenorQue10(){
    var x = 0
    do {
        println(x)
        x++
    }while(x<10)
}

fun printa1a10(){
    for(numero in 1 .. 10){
        println(numero)
    }
}
fun printa10a1(){
    for(numero in 10 downTo 1){
        println(numero)
    }
}
fun printa1a10_2em2(){
    for(numero in 2 .. 10 step 2){
        println(numero)
    }
}

fun printa1a10_2em2(inicio: Int, fim: Int){
    for(numero in inicio .. fim){
        println(numero)
    }
}



