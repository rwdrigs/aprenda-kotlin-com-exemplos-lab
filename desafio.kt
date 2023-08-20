enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val name: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        
        val nomeDoUsuario = usuario.name
        
    	inscritos.add(usuario)
        
        
        println("O(a) aluno(a) $nomeDoUsuario está matriculado.")
        println()
        println("Alunos: $inscritos")
        println("------------------------------")
        
        //feito "Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos)."
    }
}

fun main() {
    
    // obs: eu sei que n é uma boa pratica nomear variaveis numerando-as com 1, 2, 3... primeira e ultima
    
    val aluno1 = Usuario("Lucas")
    val aluno2 = Usuario("Eliel")
    val aluno3 = Usuario("Rodrigues")
    
    val listaDeConteudo = mutableListOf<ConteudoEducacional>()
    listaDeConteudo.add(ConteudoEducacional(nome = "Conhecendo a linguagem de programação Kotlin"))
    
    
    val listContent : List<ConteudoEducacional> =  listaDeConteudo
    
    
    val formacaoBasica = Formacao("O Poder das Funções", listContent, Nivel.BASICO)
    val formacaoIntermediaria = Formacao("Tratamento de Exceções em Kotlin", listContent, Nivel.INTERMEDIARIO)
    
    formacaoBasica.matricular(aluno1)
    formacaoBasica.matricular(aluno2)
    formacaoBasica.matricular(aluno3)
    
    formacaoIntermediaria.matricular(aluno2)
  
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
