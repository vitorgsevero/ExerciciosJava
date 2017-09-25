import java.util.Scanner;
public class SortParouImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=0;
		int j=0;
		int aux=0;
		int num[] = new int [10];
		int vPar[] = new int [10];
		int vImpar[] = new int [10];
		
		
		Scanner ler = new Scanner (System.in);
		
		
		for (i=0; i<num.length; i++){      //FOR QUE RECEBE OS VALORES E DEFINE COMO PAR OU IMPAR
			
			System.out.println("Informe um número:");
			num[i] = ler.nextInt();
			
				if (num[i]%2==0){
					
						vPar[i] = num[i];
					
				}
				
				if (num[i]%2==1){
					
					vImpar[i] = num[i];
				
			    }
				
				
		for (i=0; i<vPar.length; i++){ 		//FOR QUE ORDENA OS VALORES PARES
			
			for (j=0; j<(vPar.length-1); j++){
				
				if (vPar[j+1]>vPar[j]){
					
						aux = vPar[j];
						vPar[j] = vPar[j+1];
						aux = vPar [j+1];						
						
				}
				
			}
			
			
		}
		
		
		for (i=0; i<vImpar.length; i++){ 		//FOR QUE ORDENA OS VALORES IMPARES
			
			for (j=0; j<(vImpar.length-1); j++){
				
				if (vImpar[j+1]>vImpar[j]){
					
						aux = vImpar[j];
						vImpar[j] = vImpar[j+1];
						aux = vImpar [j+1];						
						
				}
				
			}
			
			
		}
						
				
				
		for (i=0; i<num.length; i++){		 //FOR QUE EXIBE OS VALORES PARES
			
			System.out.println("Pares:" + vPar[i]);
			
		}
		
		
		for (i=0; i<num.length; i++){		 //FOR QUE EXIBE OS VALORES IMPARES
			
			System.out.println("Impares:" + vImpar[i]);
			
		}
		
		
		
		
			
			
		}
		
	}

}
