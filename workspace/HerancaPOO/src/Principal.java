import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Professor prof = new Professor();
		
		Scanner leitura = new Scanner(System.in);
		
		Aluno alu = new Aluno();
		
		
		System.out.println("Informe o nome do professor:");
		String nomeProf = leitura.nextLine();
		prof.setNome(nomeProf);
		
		System.out.println("Nome do Professor: " + prof.getNome());
		
		System.out.println("\nInforme o nome do aluno:");
		String nomeAluno = leitura.nextLine();
		alu.setNome(nomeAluno);
		
		System.out.println("Nome do Aluno: " + alu.getNome());
		
		

		
	}

}
