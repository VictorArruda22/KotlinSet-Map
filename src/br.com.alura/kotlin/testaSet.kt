fun testaSet() {
    val assistiramCursoDeKotlin: MutableSet<String> = mutableSetOf<String>("Victor", "João", "Ronaldo", "Viviane")
    val assistiramCursoDeAndroid: MutableSet<String> = mutableSetOf<String>("Alex", "Carlos", "Ronaldo", "Viviane")
//    val assistiramAmbos: Set<String> = assistiramCursoDeKotlin + assistiramCursoDeAndroid

    val assistiramAmbos = mutableSetOf<String>()

    assistiramAmbos.addAll(assistiramCursoDeKotlin)
    assistiramAmbos.addAll(assistiramCursoDeAndroid)
    assistiramAmbos.add("Claudio")

    println(assistiramAmbos)
    println(assistiramCursoDeAndroid intersect assistiramCursoDeKotlin)
    println(assistiramCursoDeAndroid union assistiramCursoDeKotlin)
    println(assistiramCursoDeAndroid subtract assistiramCursoDeKotlin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("Alex")
    println(assistiramList)
    println(assistiramList.toSet())
}