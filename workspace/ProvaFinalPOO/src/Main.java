import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int i=0;
		int op=0;
		int total;
		
		
		//INSTANCIANDO CLASSES
		
		Scanner ler = new Scanner (System.in);
		Funcionario func = new Funcionario();
		
		
		System.out.println("Olá! Seja bem-vindo ao sistema da sua empresa. \nInforme o número de funcionários:");
		total = ler.nextInt();
		
		
		//INSTANCIANDO E DECLARANDO VETORES
		
		int[] idade = new int[total];
		String[] nome = new String[total];
		String[] situacao = new String [total];	
		
		
	try{	
		
		do {
			
			System.out.println("\nBem-vindo ao menu! Informe a opção desejada: \n1)CADASTRAR FUNCIONÁRIO "
					+ "\n2)CONSULTAR FUNCIONÁRIO \n3)LISTAR TODOS FUNCIONÁRIOS \n4)LISTAR SOMENTE FUNCIONÁRIOS ATIVOS \n5) LISTAR SOMENTE FUNCIONÁRIOS INATIVOS "
					+ "\n6)LISTAR FUNCIONÁRIOS EM ORDEM DE IDADE CRESCENTE \n10)SAIR");
			op = ler.nextInt();
			
			if(op==1){ //CADASTRO DE FUNCIONÁRIOS
				
			  System.out.println("CADASTRANDO FUNCIONÁRIOS:");
				
				for(i=0; i<total; i++){
					
					System.out.println("\nInforme o nome do funcionário:");
					try{
						
						nome[i] = ler.next();
						func.setNomeFunc(nome);
						
					}catch(Exception e){
						
						System.out.println("Você não informou um nome válido.");
						return;
						
					}
			
					System.out.println("\nInforme a idade do funcionário:");
					try{
						
						idade[i] = ler.nextInt();
						func.setIdadeFunc(idade);
						
					}catch(Exception e){
						
						System.out.println("Você não informou uma idade válida.");
						
						return;
					}
					
					System.out.println("\nInforme a situação do funcionário:");
					try{
						
						situacao[i] = ler.next();
						func.setSituacaoFunc(situacao);
						
					}catch(Exception e){
						
						System.out.println("Você não informou uma situação válida.");
						
						return;
					}
					
				}	
				
			}
			
			if(op==2){ //CONSULTA DE FUNCIONÁRIOS
					
				int aux=0;	
					
				 System.out.println("\nCONSULTANDO FUNCIONÁRIOS:");
				 System.out.println("\nInforme o nome do Funcionário: ");
				 String pesquisa = ler.next();
				 
				 for(i=0; i<total; i++){
				 
				 if (nome[i].equalsIgnoreCase(pesquisa)){
					 
					 aux = i;
				 }
				 
			}
				 
				 System.out.println("\nNome do Funcionário: " + func.getNomeFunc()[aux]);
				 System.out.println("\nIdade do Funcionário: " + func.getIdadeFunc()[aux]);
				 System.out.println("\nSituação do Funcionário: " + func.getSituacaoFunc()[aux]);
				 
				
			}
			
			
			if(op==3){ //LISTAGEM DE FUNCIONÁRIOS
				 
				 System.out.println("\nLISTANDO TODOS OS FUNCIONÁRIOS:");
				 
				 for (i=0; i<total; i++ ){
					 
					 System.out.println("\nNome do Funcionário: " +  func.getNomeFunc()[i]);
					 System.out.println("\nIdade do Funcionário: " + func.getIdadeFunc()[i]);
					 System.out.println("\nSituação do Funcionário: " + func.getSituacaoFunc()[i]);
					 
				 }
				
			}
			
			
			if(op==4){ //LISTAGEM DE FUNCIONÁRIOS ATIVOS
				
				 System.out.println("\nLISTANDO FUNCIONÁRIOS ATIVOS:");
				 
				 for(i=0; i<total; i++){
					 
					 if(situacao[i].equalsIgnoreCase("Ativo")){
						 
						 System.out.println("\nNome do Funcionário: " + func.getNomeFunc()[i]);
						 System.out.println("\nIdade do Funcionário: " + func.getIdadeFunc()[i]);
						 System.out.println("\nSituação do Funcionário: " + func.getSituacaoFunc()[i]);
						 
						 
					 }
					 
				
				 }
				 
			}
			
			
			if(op==5){ //LISTAGEM DE FUNCIONÁRIOS INATIVOS
				
				 System.out.println("\nLISTANDO FUNCIONÁRIOS INATIVOS:");
				 
				 for(i=0; i<total; i++){
					 
					 if(situacao[i].equalsIgnoreCase("Inativo")){
						 
						 System.out.println("\nNome do Funcionário: " + func.getNomeFunc()[i]);
						 System.out.println("\nIdade do Funcionário: " + func.getIdadeFunc()[i]);
						 System.out.println("\nSituação do Funcionário: " + func.getSituacaoFunc()[i]);
						 
						 
					 }
					 
				
				 }
				 
			}
			
			
			if(op==6){ //LISTAGEM DOS FUNCIONÁRIOS POR ORDEM DE IDADE UTILIZANDO BUBBLE SORT
				
				String[] auxNome = nome; //PASSAGENS DOS VETORES PARA O VETORES AUXILIARES PARA A ORDENAÇÃO CRESCENTE
				int[] auxIdade = idade;
				String auxString = null;
				int auxInt = 0;
				
				System.out.println("\nLISTANDO OS FUNCIONÁRIOS PELA IDADE EM ORDEM CRESCENTE:");
				
				for(i=0; i<total; i++){ //FOR PARA ORDENAR
					for (int j=0; j<total-1; j++){
						
							if (idade[j] > idade[j+1]){
								
								auxString = auxNome[j];		//NOME
								auxNome[j] = auxNome[i];
								auxNome[i] = auxString;
								
								auxInt = auxIdade[j];		//IDADE
								auxIdade[j] = auxIdade[i];
								auxIdade[i] = auxInt;
								
							}
					}
				}
				
				
				 for (i=0; i<total; i++){ //FOR PARA EXIBIR AS IDADES ORDENADAS EM ORDEM CRESCENTE
					 
					 System.out.println("\nNome do Funcionário: " + auxNome[i]);
					 System.out.println("\nIdade do Funcionário: " + auxIdade[i]);
					 
				 }
				
				
			}
			 
			if(op!=1 && op!=2 && op!=3 && op!=4 && op!=5 && op!=6 && op!=10){ //RETORNA MENSAGEM DE ERRO
				
				System.out.println(func.getRetornaErro());
				
			}
			
		}while(op!=10);
		
		
	}catch(Exception e){
		
		System.out.println("Você não informou uma opção válida. Encerrando o programa...");
		
		return;
		
		}
	}
}