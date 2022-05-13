fun main(){
    val pedidos: MutableMap<Int, Double> = mutableMapOf(Pair(1, 20.0), 2 to 30.5)
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (p: Map.Entry<Int, Double> in pedidos){
        println( pedido )
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
}





