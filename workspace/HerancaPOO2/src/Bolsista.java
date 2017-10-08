
public class Bolsista extends Aluno { //Herança da Classe Aluno que herda características e comportamentos da Classe Pessoa
	private double bolsa;
	
	public void renovaBolsa(){
		
		System.out.println("Renovando bolsa de " + this.getNome());
		
	}
	
	@Override
	public void pagarMensalidade(){
		System.out.println(this.getNome() + " é bolsista. Pagamento Facilitado.");
		
	}

	public double getBolsa() {
		return bolsa;
	}

	public void setBolsa(double bolsa) {
		this.bolsa = bolsa;
	}
	

}
