fun main(){
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 30.0),
        Pedido(3, 40.0),
        Pedido(4, 52.0)
    )
    println(pedidos)
    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratis)
}

data class Pedido(val numero: Int, val valor: Double)





