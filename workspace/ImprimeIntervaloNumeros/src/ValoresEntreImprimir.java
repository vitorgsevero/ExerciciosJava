import java.util.Scanner;
public class ValoresEntreImprimir {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int n1=0;
		int n2=0;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe um número:");
		n1 = ler.nextInt();
		
		System.out.println("Informe outro número:");
		n2 = ler.nextInt();
	
		
		//System.out.println("" + n1);
		
		
		do {
			
			//n2--;
			
			System.out.println("\n" + n2);
			
			n2--;
			
		}while(n2>n1);
		
			System.out.println("\n" + n1);	
		
		
	}

}
