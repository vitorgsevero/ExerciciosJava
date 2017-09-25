
public class Funcionario {

	private String retornaErro = "Você não informou uma opção corretamente.";
	private String[] nomeFunc;
	private String[] situacaoFunc;
	private String pesquisa;

	private int[] idadeFunc;
	private int[] totalFunc;

	
	
	//SETTERS
	
	public void setNomeFunc(String[] nome) {
		this.nomeFunc = nome;
	}
	
	public void setSituacaoFunc(String[] situacao) {
		this.situacaoFunc = situacao;
	}
	
	public void setIdadeFunc(int[] idade) {
		this.idadeFunc = idade;
	}
	
	public void setTotalFunc(int[] total) {
		this.totalFunc = total;
	}

	public void setPesquisa(String pesquisa) {
		this.pesquisa = pesquisa;
	}
	
	
	//GETTERS
	
	public String getRetornaErro() {
		return this.retornaErro;
	}

	public String[] getNomeFunc() {
		return nomeFunc;
	}

	public String[] getSituacaoFunc() {
		return situacaoFunc;
	}

	public int[] getIdadeFunc() {
		return idadeFunc;
	}
	
}
