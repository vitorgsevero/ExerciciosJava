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
	
		System.out.println("\nInforme um n�mero: ");
		n1 = ler.nextDouble();
		
		m.setNumero1(n1);
		
		System.out.println("Informe outro n�mero: ");
		n2 = ler.nextDouble();
		
		m.setNumero2(n2);
		
		System.out.println("Informe mais um n�mero: ");
		n3 = ler.nextDouble();
		
		m.setNumero3(n3);
		
		//CHAMADA DO M�TODO QUE CALCULA E M�DIA
		
		m.calculoMedia(media);
		
		System.out.println("M�dia: " + m.getMedia());
		
		
		System.out.println("\nVoc� deseja continuar? \nInforme 0 para sair ou 1 para continuar");
		op = ler.nextInt();
		
		}while(op!=0);
	}

}
