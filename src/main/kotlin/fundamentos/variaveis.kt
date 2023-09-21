package fundamentos

fun main(){
    var nome = "Gustavo"
    val nomeVal = "Gustavo" // variaveis imutáveis com (val), dar preferencia para elas

    nome = "Carlos"
    //nomeVal = "Delfeu"

    val idade = 24
    println(idade)

    // Dentro da funcao consigo iniciar uma variavel para depois atribuir valor a aela
    val teste: String
    teste = "teste"
}

class variaveis {
    // Dentro de uma casse temos que iniciar a variável imutável, pois depois nao podemos modificar
    //val teste: String
    val teste0: String = "teste" ///assim ou
    lateinit var teste1: String   // assim

    fun iniciaVariavel(){
        teste1 = "teste"
    }


}