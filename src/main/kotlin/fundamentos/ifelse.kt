package fundamentos

fun main() {
    parOuImpar(2)
    parOuImpar(3)

    resultadoDaNota(3)
    resultadoDaNota(5)
    resultadoDaNota(8)

    println(parOuImparReturnIf(2))
    println(parOuImparReturnIf(9))
}

fun parOuImparReturnIf(numero: Int): String {
    return if (numero % 2 == 0) {
        "par"
    } else {
        "impar"
    }
}
fun parOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("par")

    } else {
        println("impar")
    }
}

//se a nota > ou maior 6 passou
//se a nota > ou igual a 4 recuperacao
// se a nota < 4 reprovou
fun resultadoDaNota(nota: Int) {
    if (nota >= 6) {
        println("passou")
    } else if (nota >= 4) {
        println("recuperacao")
    } else {
        println("reprovou")
    }

}