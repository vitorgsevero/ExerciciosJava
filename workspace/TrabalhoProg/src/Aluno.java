
public class Aluno {

	private String nomeAluno;
	private String emailAluno;
	private String conceito;
	private String statusAluno;
	private String mensagem = "Você escolheu sair.\nEncerrando o programa..." ;
	private String mensagemDefault = "Informe uma opção válida.";
	
	private int totalAlunos;
	private int i;
	
	private double rgAluno;
	private double cpfAluno;
	private double telefoneAluno;
	private double prova1;
	private double prova2;
	private double trabalho1;
	private double trabalho2;
	private double mediaAluno;
	
	
	//SETTERS
	
	public void setNomeAluno(String nome) {
		this.nomeAluno = nome;
	}
	
	public void setEmailAluno(String email) {
		this.emailAluno = email;
	}
	
	public void setRgAluno(double rg) {
		this.rgAluno = rg;
	}
	public void setCpfAluno(double cpf) {
		this.cpfAluno = cpf;
	}
	
	public void setTelefoneAluno(double telefone) {
		this.telefoneAluno = telefone;
	}
	
	public void setTotalAlunos(int totalAlunos){
		this.totalAlunos = totalAlunos;
		
	}
	
	
	public void setProva1(double p1) {
		this.prova1 = p1;
	}
	
	public void setProva2(double p2) {
		this.prova2 = p2;
	}
	
	public void setTrabalho1(double t1) {
		this.trabalho1 = t1;
	}
	
	public void setTrabalho2(double t2) {
		this.trabalho2 = t2;
	}
	
	public void setMediaAluno(double media) {
		
		this.mediaAluno = media;
		
	}
	
	
	
	//PROCESSAMENTO
	
	
	public void calculoMediaAlunos(){
		
		//for(i=0; i<totalAlunos; i++){
			
			this.mediaAluno = (this.prova1 + this.prova2 + this.trabalho1 + this.trabalho2)/4;
			
			if (this.mediaAluno<3.0){

				this.conceito = "E";
				this.statusAluno = "Reprovado.";

			}
			
			if (this.mediaAluno>=3.0 && this.mediaAluno<5.0){
				
				this.conceito = "D";
				this.statusAluno = "Reprovado.";
				
				}
			
			if (this.mediaAluno>=5.0 && this.mediaAluno<=7.0){
				
				this.conceito = "C";
				this.statusAluno = "Parabéns! Você foi aprovado.";
				
			}
			
			if (this.mediaAluno>7.0 && this.mediaAluno<9.9){
				
				this.conceito = "B";
				this.statusAluno = "Parabéns! Você foi aprovado.";

			}
			
			
			if (this.mediaAluno==10.0){
				
				this.conceito = "A";
				this.statusAluno = "Parabéns! Você tirou a nota máxima e foi aprovado.";
				
			}
			
		}
		
	//}
	
	public void mostraDadosAlunos(){
		

		
	}
	
	
	
	//GETTERS
	
	public String getStatus(){
		return this.statusAluno;
	}
	
	public String getConceito(){
		return this.conceito;	
	}
	
	public String getEncerrandoPrograma(){
		return this.mensagem;
	}
	
	public String getDefault(){
		return this.mensagemDefault;
	}
	

	public String getNomeAluno() {
		return nomeAluno;
	}

	public String getEmailAluno() {
		return emailAluno;
	}

	public double getRgAluno() {
		return rgAluno;
	}

	public double getCpfAluno() {
		return cpfAluno;
	}

	public double getTelefoneAluno() {
		return telefoneAluno;
	}

	public double getProva1() {
		return prova1;
	}

	public double getProva2() {
		return prova2;
	}

	public double getTrabalho1() {
		return trabalho1;
	}

	public double getTrabalho2() {
		return trabalho2;
	}

	public double getMediaAluno() {
		return mediaAluno;
	}
	
	

}
