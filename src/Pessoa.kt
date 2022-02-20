open class Pessoa { //status open para deixa a classe aberta para uso de herança
    //caracteristicas
    //propriedades
    var nome : String = ""
    var idade : Int = 0
    var cpf : String = ""
    var email : String = ""
    var senha : String = "" //o parametro da função autenticador e comparado com o valor desssa senha definida no objto de outra classe
//cada variavel esta definindo uma senha diferente

    //dentro da classe posso usar as funções que são usada em outros lugar um exemplo a fun main
    fun autenticador(senhaok: String): Boolean{ //usuario não pode autenticar de preferencia deve ser criada uma classe unica para autenticação  e usar as herança
                    //senhaok: recebe um valor em string
        return senhaok == senha //aqui ele verifica e da um retorno de true ou false se o valor recebido em parametro for igual a senha do usuario
    }
    //o tipo de retorno e boleano, a funcao verifica a string colocada no parametro se e igual a senha do usuario
    //caso for true a condição e feita
    //a senhaok e igual a senha do usuario

    fun verficadorEmail (): Boolean{ //não precisa passar parametro pois o tipo de variavel ja existe dentro da classe pessoa
        //todo tipo de função para ser usada pode ser colocada dentro da classe para uso
        if (email.contains("@") && email.contains(".")){ //verifica se o email definido pelo objto tem o @ e o ponto
            return true
        }
        return false
    }




}
//assim que chamamos a função a funcao verifica o parametro com a senha do objto e assim retorna um boleano