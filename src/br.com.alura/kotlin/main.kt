fun main(){
    val pedidos: MutableMap<Int, Double> = mutableMapOf(
        Pair(1, 20.0),
        2 to 30.5,
        3 to 60.0,
        4 to 100.0,
        5 to 60.0,
        6 to 25.0
    )
    val valorPedido = pedidos.getValue(1)
    println(pedidos)
    val mensagem = pedidos.getOrElse(4) {
        "Pedido não encontrado"
    }
    println(mensagem)

    pedidos.getOrDefault(1, 50.0)

    println(pedidos.getOrDefault(0, -20.0))

    for (numero in pedidos.keys){
        println("Pedido: $numero")
    }

    for (valor in pedidos.values){
        println("Valor do pedido: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 40.0
    }

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }

    println(pedidosAcima)
    println(pedidosPares)
    println(pedidosFiltrados)

    println(pedidos - listOf(5, 4))

    pedidos.putAll(setOf(7 to 90.0, 8 to 95.0))
//    pedidos += (setOf(7 to 90.0, 8 to 95.0))
    println(pedidos)

    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove(60.0)
    println(pedidos)

    pedidos -= 6
    println(pedidos)

}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos) {
        println(pedido)
        println("Número do pedido: ${p.key}")
        println("Valor do pedido: ${p.value}")
    }
    pedidos[3] = 70.0
    println(pedidos)
    pedidos.put(4, 25.0)
    println(pedidos)
    pedidos[1] = 10.0
    println(pedidos)
    pedidos.putIfAbsent(5, 50.0)
    println(pedidos)

    pedidos.remove(5)
    println(pedidos)
}





