import java.util.Scanner;
public class Carros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nVendas = 0;
		double vTotal = 0;
		double sFixo = 0;
		double comissao = 0;
		double sFinal = 0;
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Informe o n�mero de carros vendidos:");
		nVendas = ler.nextInt();
		System.out.println("Informe o valor total das vendas:");
		vTotal = ler.nextDouble();
		System.out.println("Informe o seu sal�rio fixo:");
		sFixo = ler.nextDouble();
		System.out.println("Informe o valor recebido por carro vendido:");
		comissao = ler.nextDouble();
		
		
		vTotal = vTotal * 0.05;  //5% das vendas efetuadas por ele
		
		comissao = comissao * nVendas; //comiss�o multiplicada pelo numero de vendas
		
		sFinal = (sFixo + vTotal + comissao); //Sal�rio Final
		
		
		System.out.println("Valor final: " + sFinal);
		
		
		
	}

}
