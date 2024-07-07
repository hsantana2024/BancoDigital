
public class Movimentacao {



public static void main(String[] args) {
    Cliente nomeCliente = new Cliente();
    nomeCliente.setNome("João Pedro");
    Conta cc = new ContaCorrente(nomeCliente);
    Conta poupanca = new ContaPoupanca(nomeCliente);
   System.out.println(String.format("Número do banco : %d e Agência : %d ", cc.numeroBanco, cc.agencia));
 
    
    cc.depositar(200.75);	
    poupanca.depositar(150.20);
 
   cc.imprimirExtrato();
    poupanca.imprimirExtrato();

}

}


