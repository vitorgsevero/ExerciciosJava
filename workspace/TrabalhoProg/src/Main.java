
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//VARI�VEIS
		
		String nome;
		String email;
		
		int i;
		int op = 0;
		int totalAlunos = 0;
		
		double cpf;
		double rg;
		double telefone;
		double p1;
		double p2;
		double t1;
		double t2; 
		double media;
		
		//INSTANCIANDO CLASSES
		
		Scanner ler = new Scanner (System.in);
		Aluno al = new Aluno();
		
		//PERGUNTANDO O TOTAL DE ALUNOS
		
		try{
			
			System.out.println("Bem-vindo ao sistema! Informe o total de alunos: ");
			totalAlunos = ler.nextInt();
			
		}catch(Exception erro){
			
			System.out.println("Informe um valor inteiro.");
		}
		
		
		
		//String nome[] = new String[totalAlunos];
		
		//CADASTRO DO ALUNO
		
		for (i=0; i<totalAlunos; i++){
			
			System.out.println("\nFa�a o cadastro para utilizar as fun��es dispon�veis.");
			
			try{
				
				System.out.println("\nInforme seu nome: ");
				nome = ler.next();
				al.setNomeAluno(nome);
				
			}catch(Exception e){
				
				System.out.println("Voc� n�o informou um nome v�lido.");
				
			}
			
			
			try{
				
				System.out.println("\nInforme o seu CPF: ");
				cpf = ler.nextDouble();
				al.setCpfAluno(cpf);
				
			}catch(Exception e){
				
				System.out.println("Voc� n�o informou um n�mero de CPF v�lido.");
				
			}
			
			
			try{
				
				System.out.println("\nInforme seu e-mail: ");
				email = ler.next();
				al.setEmailAluno(email);
				
			}catch(Exception e){
				
				System.out.println("Voc� n�o informou um endere�o de E-mail v�lido.");
				
			}
			

			try{
				
				System.out.println("\nInforme o seu RG: ");
				rg = ler.nextDouble();
				al.setRgAluno(rg);
				
			}catch(Exception e){
				
				System.out.println("Voc� n�o informou um n�mero de RG v�lido.");
				
			}
			
			
			try{
				
				System.out.println("\nInforme o n�mero do seu telefone: ");
				telefone = ler.nextDouble();
				al.setTelefoneAluno(telefone);
				
			}catch(Exception e){
				
				System.out.println("Voc� n�o informou um n�mero de telefone v�lido.");
				
			}
			
		}
		
		
		
		for (i=0; i<totalAlunos; i++){
			
			do{
				
				try{
					
					System.out.println("\nBem-vindo! Informe a op��o desejada: \n1)Calcular a m�dia \n2)Notas das provas \n3)Notas das trabalhos"
							+ " \n4)Informa��es sobre o aluno \n5)Sair do programa");
					op = ler.nextInt();
					
				}catch(Exception e){
					
					System.out.println("Op��o Inv�lida.");
					
				}
					

				switch (op){
				
				case 1: //ENTRADA DAS NOTAS E C�LCULO DA M�DIA
					
						System.out.println("\n====== C�LCULO DA M�DIA ======");
						
						System.out.println("\nInforme a nota da Prova 1: ");
						p1 = ler.nextDouble();
						al.setProva1(p1);
						
						System.out.println("\nInforme a nota da Prova 2: ");
						p2 = ler.nextDouble();
						al.setProva2(p2);
						
						System.out.println("\nInforme a nota do Trabalho 1: ");
						t1 = ler.nextDouble();
						al.setTrabalho1(t1);
						
						System.out.println("\nInforme a nota do Trabalho 2: ");
						t2 = ler.nextDouble();
						al.setTrabalho2(t2);
						
						al.calculoMediaAlunos(); //CHAMADA DO M�TODO 
						
						System.out.println("\nM�dia do Aluno " + al.getNomeAluno() +": " + al.getMediaAluno());
						
						System.out.println("Conceito Final: " + al.getConceito());
						System.out.println("Status do Aluno: " + al.getStatus());
							
					
					break;
					
				case 2:
					
						System.out.println("\n====== NOTAS DE PROVAS ======");						
						System.out.println("\nNota da Prova 1: " + al.getProva1());
						System.out.println("Nota da Prova 2: " + al.getProva2());
			
					break;
					
				case 3:
					
						System.out.println("\n====== NOTAS DE TRABALHO ======");
						System.out.println("\nNota do Trabalho 1: " + al.getTrabalho1());
						System.out.println("Nota do Trabalho 2: " + al.getTrabalho2());
					
					break;
					
				case 4:
					
						System.out.println("\n====== INFORMA��ES ======");
						System.out.println("\nNome do Aluno: " + al.getNomeAluno());
						System.out.println("\nE-mail do Aluno: " + al.getEmailAluno());
						System.out.println("\nCPF do Aluno: " + al.getCpfAluno());
						System.out.println("\nRG do Aluno: " + al.getRgAluno());
						System.out.println("\nTelefone do Aluno: " + al.getTelefoneAluno());
						System.out.println("\n\nM�dia do Aluno no Semestre: " + al.getMediaAluno());
						System.out.println("\nStatus do Aluno: " + al.getStatus());
					
					
					break;
					
				case 5:
					
						System.out.println(al.getEncerrandoPrograma());		
					
					break;
					
				default:
					
						System.out.println(al.getDefault());
			
				}
				
				
			}while(op!=5);	
			
				}				
		
	}

}
