
public class TestaMetodos {
	
	public static void main(String[] args) {
		
		Conta contaTeste = new Conta();
		System.out.println(contaTeste.saldo);
		contaTeste.deposita(100);	
		System.out.println(contaTeste.saldo);
		contaTeste.saca(50);
		System.out.println("contaTeste tem "+contaTeste.saldo+" depois de sacar 50");
		
		Conta contaTeste2 = new Conta();
		
		contaTeste.transfere(30, contaTeste2);
		System.out.println("O novo saldo da contaTeste2 é "+contaTeste2.saldo);
	}

}
