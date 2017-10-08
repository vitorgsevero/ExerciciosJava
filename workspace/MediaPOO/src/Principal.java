import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double n1;
		double n2;
		double n3;
		double media = 0;
		int op;
		
		Scanner ler = new Scanner (System.in);
		
		mediaPOO m = new mediaPOO();
		
		
		do{
	
		System.out.println("\nInforme um número: ");
		n1 = ler.nextDouble();
		
		m.setNumero1(n1);
		
		System.out.println("Informe outro número: ");
		n2 = ler.nextDouble();
		
		m.setNumero2(n2);
		
		System.out.println("Informe mais um número: ");
		n3 = ler.nextDouble();
		
		m.setNumero3(n3);
		
		//CHAMADA DO MÉTODO QUE CALCULA E MÉDIA
		
		m.calculoMedia(media);
		
		System.out.println("Média: " + m.getMedia());
		
		
		System.out.println("\nVocê deseja continuar? \nInforme 0 para sair ou 1 para continuar");
		op = ler.nextInt();
		
		}while(op!=0);
	}

}
