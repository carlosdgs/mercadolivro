package fundamentos

fun main() {
    println(retornaNome())
    // passando parametro
    dizOi(retornaNome(), 24)
    //pode passar parametro invertido ??
    dizOi(idade=24, nome="Carlos")
}

fun retornaNome(): String {
    return "Carlos"
}

fun dizOi( nome: String, idade: Int) {
    println("Oi ${nome}, parabens pelos seus ${idade} anos")
}