public class Conta {
    
    
public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 584;
	private static final int NUMERO_BANCO   = 15;
	
	private static int SEQUENCIAL = 1;

	protected int     agencia;
    protected int     numeroBanco;
	protected int     conta;
	protected double  saldo;
	protected Cliente cliente;
	
	
	public Conta(Cliente cliente) {
		 this.numeroBanco = NUMERO_BANCO;
		 this.agencia = Conta.AGENCIA_PADRAO;
	     this.conta = SEQUENCIAL++;
		 this.cliente = cliente;
		 }
	@Override
	public void sacar(double valor) { 
		
		saldo -= valor;
		
	}
	@Override
	public void depositar(double valor) {
		saldo += valor;
		
	}
	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
	public int getAgencia() {
		return agencia;
	}
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}

	protected void ImprimirMovimentacao() {
		
		
		System.out.println(String.format("Conta: %d - Saldo: %.2f - Titular:%s", this.conta, this.saldo, this.cliente.getNome() ));
	}

}

}
