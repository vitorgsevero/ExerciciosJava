
public class Professor extends Pessoa{
	
	private String especialidade;
	private double salario;
	private double valorAumento=1000;
	
	
	public void receberAumento(){
		
		this.salario = this.salario + this.valorAumento;
	}


	public String getEspecialidade() {
		return especialidade;
	}


	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}

	
	
	
	
	
	
	
}
