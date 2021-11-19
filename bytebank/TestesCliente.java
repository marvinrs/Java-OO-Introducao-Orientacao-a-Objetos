public class TestesCliente {
	
	public static void main(String[] args) {
	
		Conta contaMarcelo = new Conta();
		contaMarcelo.titular = new Cliente();
		contaMarcelo.titular.nome = "Marcelo";
		System.out.println(contaMarcelo.titular.nome);
		System.out.println(contaMarcelo.titular.cpf);
		System.out.println(contaMarcelo.titular.profissao);
		
	}
		
}
