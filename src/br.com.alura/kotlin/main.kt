fun main(){
    val pedidos: MutableMap<Int, Double?> = mutableMapOf(
        Pair(1, 20.0),
        2 to 30.5,
        3 to null
    )
    val valorPedido = pedidos.getValue(1)
    println(pedidos)
    val mensagem = pedidos.getOrElse(4) {
        "Pedido não encontrado"
    }
    println(mensagem)

    pedidos.getOrDefault(1, 50.0)

    println(pedidos.getOrDefault(0, -20.0))
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





