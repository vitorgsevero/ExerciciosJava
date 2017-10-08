
public class mediaPOO {

	private double numero1;
	private double numero2;
	private double numero3;
	private double media;
	
	//ENTRADA 
	
	public void setNumero1(double n1) { //CARREGA O NUMERO 1
		this.numero1 = n1;
	}

	public void setNumero2(double n2) { //CARREGA O NUMERO 2
		this.numero2 = n2;
	}

	public void setNumero3(double n3) { //CARREGA O NUMERO 3
		this.numero3 = n3;
	}
	
	//PROCESSAMENTO
	
	public void calculoMedia(double media){
		
		this.media = (this.numero1 + this.numero2 + this.numero3)/3;
		
	}

	//SAÍDA
	
	public double getMedia() { //RETORNA A MÉDIA DOS VALORES
		return media;
	}


	

	
	
	
	
	
	
	
	
	
	
	
}
