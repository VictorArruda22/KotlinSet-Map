fun main(){
    val assistiramCursoDeKotlin:List<String> = listOf<String>("Victor", "João", "Ronaldo", "Viviane")
    val assistiramCursoDeAndroid:List<String> = listOf<String>("Alex", "Carlos", "Ronaldo", "Viviane")
    val assistiramAmbos: MutableList<String> = mutableListOf()

    assistiramAmbos.addAll(assistiramCursoDeKotlin)
    assistiramAmbos.addAll(assistiramCursoDeAndroid)

    println(assistiramAmbos.distinct())
}




