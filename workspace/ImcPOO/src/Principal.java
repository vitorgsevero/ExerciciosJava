import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe seu peso:");
		double peso = ler.nextDouble();
		
		System.out.println("Informe sua altura:");
		double altura = ler.nextDouble();
		
		
		IMC indice = new IMC(peso, altura);
		
		boolean pesoOk = indice.pesoValido();
		boolean alturaOK = indice.alturaValida();
		
			if (pesoOk == false){
				
					System.out.println("Peso Inválido.");
					
			}else {
				
				if (alturaOK==false){
					
					System.out.println("Altura Inválida.");
					
				}else{
					
					double imc = indice.calculaImc();
					
					System.out.println("Valor do IMC: " + imc);
					
					
					
				}
				
				
				
			}
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
