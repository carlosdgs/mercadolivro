package fundamentos

fun main() {
    var nome : String = "Gustavo"
    var nome1 : String? = "Gustavo"

    println(nome.length)
    // a interrogacao evita o nullexception
    println(nome1?.length?.toShort())
    


}