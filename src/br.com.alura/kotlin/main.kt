fun main(){
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 30.0),
        Pedido(3, 60.0),
        Pedido(4, 52.0)
    )
    println(pedidos)
    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFreteGratis)

    val pedidosFrete = pedidos.groupBy { pedido: Pedido ->
        pedido.valor > 50.0
    }

    println(pedidosFrete)
//    val mapa = pedidos.associateBy { pedido -> pedido.valor > 50.0 }
//    println(mapa)

    val nomes = listOf<String>(
        "Carla",
        "Carlos",
        "Cleber",
        "Julia",
        "Junior",
        "Victor",
        "Vanessa"
    )

    val agenda = nomes.groupBy { nome -> nome.first() }
    println(agenda)
}

data class Pedido(val numero: Int, val valor: Double)





