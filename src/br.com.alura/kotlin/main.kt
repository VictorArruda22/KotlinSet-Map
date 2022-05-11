fun main(){
    val banco = BancoDeNomes()

    banco.salva("Alex")
    println(banco.nomes)
    println(BancoDeNomes().nomes)
}

class BancoDeNomes{
    val nomes: Collection<String> get() = dados

    fun salva(nome: String){
       dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = listOf(
        "Alex",
        "Carlos",
        "Carol",
        "Lucas",
        "Breno"
    )

    println(nomes.size)
    for (nome in nomes) {
        println(nome)
    }
}



