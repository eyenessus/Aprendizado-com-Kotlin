open class Autent : Pessoa() { //aqui a classe Autent usa as informações da classe Pessoa que no caso está aberta
    fun autenct(senhaok: String): Boolean{

        return senhaok == senha //senha e uma variavel da classe Pessoa
}}