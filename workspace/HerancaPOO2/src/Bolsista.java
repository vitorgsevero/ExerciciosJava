
public class Bolsista extends Aluno { //Heran�a da Classe Aluno que herda caracter�sticas e comportamentos da Classe Pessoa
	private double bolsa;
	
	public void renovaBolsa(){
		
		System.out.println("Renovando bolsa de " + this.getNome());
		
	}
	
	@Override
	public void pagarMensalidade(){
		System.out.println(this.getNome() + " � bolsista. Pagamento Facilitado.");
		
	}

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	

}
