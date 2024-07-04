
public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("Saldo insuficiente. Impossível realizar saque! \n");
		} else {
			saldo -= valor;
		}
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void transferir(double valor, Conta contaDestino) {
		if (valor > saldo) {
			System.out.println("Saldo insuficiente. Impossível realizar transferência! \n");
		} else {
			this.sacar(valor);
			contaDestino.depositar(valor);
		}
	}
	
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: R$ %.2f \n", this.saldo));
	}

	/*
	protected void imprimirInfosComuns() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Número: " + this.numero);
		System.out.println("Saldo: R$ " + this.saldo + "\n");
	} **/

	
}
