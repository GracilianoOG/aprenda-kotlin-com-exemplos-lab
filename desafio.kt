enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val nivel: Nivel, val duracaoHoras: Int)

data class Formacao(val nome: String, val nivel: Nivel, val conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    // TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    fun matricular(vararg usuarios: Usuario) { for (u in usuarios) inscritos.add(u) }
}

fun main() {
    // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    // Usuários
    val user1 = Usuario("Carlos")
    val user2 = Usuario("Leandro")
    val user3 = Usuario("Maria")
    
    // Conteúdos
    val conteudo1 = ConteudoEducacional("Conhecendo o Kotlin e Sua Documentação Oficial", Nivel.BASICO, 1)
    val conteudo2 = ConteudoEducacional(
        "Introdução Prática à Linguagem de Programação Kotlin", Nivel.INTERMEDIARIO, 2)
    val conteudo3 = ConteudoEducacional(
        "Orientação a Objetos (OO) Visando Soluções Mais Idiomáticas", Nivel.AVANCADO, 1)
    
    val conteúdosKotlin = listOf(conteudo1, conteudo2, conteudo3)
    
    // Formações
    val formacaoKotlin = Formacao("Formação Kotlin Back-end Developer", Nivel.INTERMEDIARIO, conteúdosKotlin)
    
    // Amostras
    println("Conteúdos educacionais para a formação Kotlin: \n$conteúdosKotlin\n")
    println("Formação Kotlin: \n$formacaoKotlin\n")
    println("Formação Kotlin sem inscritos: \n${formacaoKotlin.inscritos}\n")
    formacaoKotlin.matricular(user1, user2, user3)
    println("Novos inscritos da formação Kotlin: \n${formacaoKotlin.inscritos}")
}