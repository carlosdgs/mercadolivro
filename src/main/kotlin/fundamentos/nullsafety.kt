package fundamentos

fun main() {
//    var nome : String = "Gustavo"
//    // (?)tornando a variavel nullable
//    var nome1 : String? = null //"Gustavo"
//
//    println(nome.length)
//
//    // nao pode pois a variavel poderá ser null e podera estourar um nullexception
//    //println(nome1.length)
//
//    // safecall -> chamar com ponto de interrogacao
//    // neste casso ira retornar null
//    println(nome1?.length)
//
//    //
//
//    // a interrogacao evita o nullexception --
//    println(nome1?.length?.toShort())
//
//    // esses pontos de exclamacao é quando se tem certeza de que a var nunca sera null
//    val toShort :Short = nome1!!.length.toShort()


//    val pessoa: Pessoa? Pessoa(Gustavo", 24)
//    println(pessoa!!.nome)

    // vai dar exception, mesmo, pois a var é null
//    val pessoa2: Pessoa? = null
//    println(pessoa2!!.nome)

    var nome : String? = null
    // usando o elvisoperator (?:  --> topete do Elvis) caso seja null retorna 0
    var tamanho : Int = nome?.length ?: 0
    println(tamanho)
    var nomethrow : String? = null
    // usando o elvisoperator (?:  --> topete do Elvis)  caso seja, null return um exception
    var tamanhothrow : Int = nome?.length ?: return throw Exception()
    println(tamanhothrow)
    //lista que nao pode ser null, mas pode conter elementos null
    var lista : List<Int?> = listOf(1,2,null)
    // a lista recebe o safetycall
    var listaNula : List<Int>? = null




}