package fundamentos

fun main() {
    var lista = listOf(1,2,3)
    val pares = lista.filter { it % 2 == 0 }
    println(pares)

    var lista1 = listOf(1,2,3,4,6)
    val pares1 = lista1.filter { it % 2 == 0 }
    println(pares1)

    var listaFirst = listOf(1,2,3,4,6)
    val paresFirst = listaFirst.filter { it % 2 == 0 }.first()
    println(paresFirst)

    var listaFirstDireto = listOf(1,2,3,4,6)
    val paresFirstDireto = listaFirstDireto.first()
    println(paresFirstDireto)

    var listaForEach = listOf(1,2,3,4,6)
    listaForEach.forEach(){
        println(it)
    }

    var listaForIn = listOf(1,2,3,4,6)
    for (numero in listaForIn){
        println(numero)
    }

    // Printa o primeiro item da lista (1)
    println(lista[0])
    println(lista.get(0))
    println(lista.size)
    println(lista.indexOf(6))

    var listaMuta = mutableListOf( 1,2,3,4,6)
    println(listaMuta)
    listaMuta.add(8)
    println(listaMuta)
    listaMuta.removeAt(0)
    listaMuta.remove(3)

    var listaMutaOrdena = mutableListOf( 3, 6, 1,2,4)
    listaMutaOrdena.sort()
    println(listaMutaOrdena)
    listaMutaOrdena.shuffle()
    println(listaMutaOrdena)


    var listaNome = mutableListOf("Carlos", "Miguel", "Juliana")
    listaNome.sort()
    println(listaNome)

    var listaSet = mutableListOf(1,2,3,2)
    println(listaSet)
    var listaSet1 = setOf(1,2,3)
    println(listaSet1)

    println(listaSet1.contains(2))

    var mapNomeIdade = mapOf("Gustavo " to 24, "Daniel" to 20)
    println(mapNomeIdade)

    var mapNomeIdadeMuta = mutableMapOf("Gustavo" to 24, "Daniel" to 20)
    mapNomeIdadeMuta.put("Bruna",33)
    println(mapNomeIdadeMuta)

    var mapNomeIdadeMuta1 = mutableMapOf("Gustavo" to 24, "Daniel" to 20)
    mapNomeIdadeMuta1["Bruna"]=33
    println(mapNomeIdadeMuta1)

    // essse vai apagar a Bruna
    mapNomeIdadeMuta1.remove("Bruna")
    println(mapNomeIdadeMuta1)
    //Esse vai sobrescrever Gustavo
    mapNomeIdadeMuta1["Gustavo"]=45
    println(mapNomeIdadeMuta1)
    //esse só vai adicionar se Gustavo nao existir
    mapNomeIdadeMuta1.putIfAbsent("Gustavo", 34)
    println(mapNomeIdadeMuta1)

    //nào pode repetir a chave
}