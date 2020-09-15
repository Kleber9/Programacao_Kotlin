fun main() {

    println("Hello world!");

    val conta1 = Conta(titular = "Kleber", numero = 3377);
    conta1.deposita(300.00)
    conta1.saldo;

    val conta2 = Conta(numero = 773, titular = "Cinthya");
    conta2.deposita(400.00)
    conta2.sacar(150.00);
    conta2.saldo;







    println("Titular: ${conta1.titular}, Numero: ${conta1.numero}, Saldo: ${conta1.saldo}");
    println("Titular: ${conta2.titular}, Numero: ${conta2.numero}, Saldo: ${conta2.saldo}");


    println()
    println("Tranferencia realizada da conta1 para conta 2 de: 20.00 ")
    conta1.transferencia(destino = conta2, valor = 30.00)

    println()
    println("Titular: ${conta1.titular}, Numero: ${conta1.numero}, Saldo: ${conta1.saldo}");
    println("Titular: ${conta2.titular}, Numero: ${conta2.numero}, Saldo: ${conta2.saldo}");

    println()
    println("Tentativa de transferencia da conta 2 para conta 1 (Valor 321 R$)")
    conta2.transferencia(321.00, conta1)
    println()
    println("Titular: ${conta1.titular}, Numero: ${conta1.numero}, Saldo: ${conta1.saldo}");
    println("Titular: ${conta2.titular}, Numero: ${conta2.numero}, Saldo: ${conta2.saldo}");


}


class Conta(var titular: String, val numero: Int) {
    var saldo: Double = 0.0
        private set

    /*constructor(titular : String, numero : Int){
        this.titular = titular
        this.numero = numero
    }*/

    fun deposita(valor: Double) {
        this.saldo += valor

    }

    fun sacar(valor: Double) {
        if (this.saldo >= valor) {
            this.saldo -= valor
        } else {
            println("Saldo insuficiente")
        }
    }

    fun transferencia(valor: Double, destino: Conta) {
        if (this.saldo >= valor) {
            this.saldo -= valor
            destino.deposita(valor)


        } else
            println("Não possui saldo suficiente para transferência")
    }


}


//****Inicio de funcoes***

fun testaLacos() {

    var i: Int = 0;
    while (i <= 5) {
        println(i);
        i++
    }



    for (i in 1..3) {

        if (i == 3) {
            break;
        }

        val titular: String = "Kleber $i";
        val numeroConta: Int = 3377 + i;
        var saldo: Double = 00.00 + i + 10;


        println("Titular: $titular");
        println("Nº Conta: $numeroConta");
        println("Saldo: $saldo");
        println();

    }


    println();

    for (i in 7 downTo 0 step 1) {
        println(i);
    }


}

// fim funcao testaLacos

fun testaCondicoes(saldo: Double) {
    when {
        (saldo > 0.0) -> {
            println("Saldo positivo");
        }
        (saldo == 0.0) -> {
            println("Saldo está zerado");
        }
        else -> {
            print("Conta está negativa");
        }
    }


    fun contaTestesCopiaEReferencia() {
        val conta3 = Conta("Joao", 77321);
        conta3.titular = "Joao";

        var contaTeste = conta3;
        contaTeste.titular = "Maria";


        println("${conta3.titular}")
        println("${contaTeste.titular}")

        println(conta3);
        println(contaTeste);
    }


}

//fim funcao testaCondicoes
/*
fun getSaldo() : Double {
    return this.saldo;
}

fun setSaldo(valor : Double){
    if(this.saldo > 0)
        this.saldo = valor;
}*/