import java.util.Scanner;
public class Lista10BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//DECLARA��O E INICIALIZA��O DAS VARI�VEIS

		int numeros[] = new int [5];
		int i=0;
		int j=0;
		int aux=0;

		Scanner ler = new Scanner (System.in);

		//DADOS DE ENTRADA

		for (i=0; i<numeros.length; i++){	//for para receber os valores do vetor

			System.out.println("Informe um n�mero:");
			numeros[i] = ler.nextInt();

		}

		//ORDENA��O DOS N�MEROS EM ORDEM CRESCENTE

		for (i=0; i<numeros.length; i++){
			for (j=0; j<(numeros.length)-1; j++){


				if (numeros[j]>numeros[j+1]){ //BUBBLE SORT

					aux = numeros[j];
					numeros[j] = numeros[j+1];
					numeros[j+1] = aux;


				}


			}
		}

		
					System.out.println("\nN�meros em ordem crescente:");


		//EXIBI��O DOS N�MEROS EM ORDEM CRESCENTE
					
					
		for (i=0; i<numeros.length; i++){
		
				System.out.println(numeros[i]);
				
		
		}
					
					
					
	}

}
