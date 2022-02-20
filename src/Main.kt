fun main () {
    //uma função principal onde o codigo roda
//sempre deve existir a função main para o kotlin funcionar e aqui que fica todo funcionamento do kotlin

    //herança ajuda a criar novas classe sem precisar criar novas propriedades
    //herança herda informações de outra classe
    //criando um objeto
    val objetodotipopessoa = Pessoa() //aqui a variavel e o objeto
    //posso usar a variavel para usar informações da classe Pessoa
    //depois do = foi criada a instancia

    objetodotipopessoa.nome = "João"
    //depois do ponto a gente acessar a classe Pessoa atraves do objto e acessando assim as propriedades
    objetodotipopessoa.idade = 15
    objetodotipopessoa.cpf = "152.365.152.659"
    println(objetodotipopessoa.nome)

    //podendo criar varios tipos de objeto
    val pessoa2 = Pessoa()
    pessoa2.nome = "Sabrina"
    pessoa2.cpf = "551515161"
    pessoa2.idade = 15

    val pessoa3 = Pessoa()
    pessoa3.nome = "João"
    pessoa3.cpf = "3424"
    pessoa3.idade = 14

    val pessoa4 = Pessoa()
    pessoa4.nome = "Carlos"
    pessoa4.cpf = "4243424"
    pessoa4.idade = 12
    pessoa4.senha = "EumaSenha"
    pessoa4.email="emersonsousa@gmail.com"


    //aqui no if invocamos a função que recebe um parametro e e comparada com a senha atual do usuario
    if (pessoa4.autenticador("EumaSenha")) { //senhaok e o parametro recebido, para invocar a função deve ser chamada o objto seguido a função
        //aqui vai no objto e seguida chama a função com uma string definida no caso o parametro assim esse valor chega na função e e comparado com a senha atual definida
        //caso a condição seja true valida a opcao abaixo
        //apenas esta se referenciando ao objto pessoa4 que a funcao verifica a variavel senha e ver a comparação entre o parametro e senha
        println(" ${pessoa4.nome} autenticado com sucesso")
    } else {
        println("Usuario não autenticado senha incorreta")
    }

    if (pessoa4.verficadorEmail()){
        print("Email validado")
    }else{
        print("Não deu certo")
    }

    val objtodoAutent = Autent()

    if(objtodoAutent.autenct(pessoa3.senha)){

        println("OK SUCESS")
    }else{
        println(" NO NOT DON'T")
    }

    val listadePessoas = listOf(pessoa2,pessoa2,pessoa4,pessoa3,pessoa2)
    fun mostraQuantidade(list: List<Pessoa>) {
        val check = list
        var nomeIguais = 0

        for (i in list) {
            if (i.nome == i.nome && check === i) {
                nomeIguais++
                println("$nomeIguais")
            }
            else
            println("Não foi validado")
        }

    }
    mostraQuantidade(listadePessoas)

}
//funçãos de validacao ou algo sigiloso devem ser feitas em classes solitaria