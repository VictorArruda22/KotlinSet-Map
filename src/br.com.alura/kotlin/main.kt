fun main(){
    val pedidos = mapOf(Pair(1, 20.0), 2 to 30.5)
    println(pedidos)
    val pedido = pedidos[3]
    pedido?.let {
        println("pedido $it")
    }
    for (pedido in pedidos){
        println( pedido )
        println("Número do pedido: ${pedido.key}")
        println("Valor do pedido: ${pedido.value}")
    }

}





