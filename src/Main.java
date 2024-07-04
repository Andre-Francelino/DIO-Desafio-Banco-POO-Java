
public class Main {

	public static void main(String[] args) {
		
		Cliente dean = new Cliente();
		dean.setNome("Dean Winchester");
		
		Conta cc = new ContaCorrente(dean);
		Conta cp = new ContaPoupanca(dean);
		
		cc.depositar(25000);
		cp.depositar(18704.55);
		
		//cc.sacar(251);
		//cc.depositar(1);
		cc.transferir(1750.95, cp);
		
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
	}

}
