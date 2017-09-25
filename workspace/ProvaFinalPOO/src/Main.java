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
		
		
		System.out.println("Ol�! Seja bem-vindo ao sistema da sua empresa. \nInforme o n�mero de funcion�rios:");
		total = ler.nextInt();
		
		
		//INSTANCIANDO E DECLARANDO VETORES
		
		int[] idade = new int[total];
		String[] nome = new String[total];
		String[] situacao = new String [total];	
		
		
	try{	
		
		do {
			
			System.out.println("\nBem-vindo ao menu! Informe a op��o desejada: \n1)CADASTRAR FUNCION�RIO "
					+ "\n2)CONSULTAR FUNCION�RIO \n3)LISTAR TODOS FUNCION�RIOS \n4)LISTAR SOMENTE FUNCION�RIOS ATIVOS \n5) LISTAR SOMENTE FUNCION�RIOS INATIVOS "
					+ "\n6)LISTAR FUNCION�RIOS EM ORDEM DE IDADE CRESCENTE \n10)SAIR");
			op = ler.nextInt();
			
			if(op==1){ //CADASTRO DE FUNCION�RIOS
				
			  System.out.println("CADASTRANDO FUNCION�RIOS:");
				
				for(i=0; i<total; i++){
					
					System.out.println("\nInforme o nome do funcion�rio:");
					try{
						
						nome[i] = ler.next();
						func.setNomeFunc(nome);
						
					}catch(Exception e){
						
						System.out.println("Voc� n�o informou um nome v�lido.");
						return;
						
					}
			
					System.out.println("\nInforme a idade do funcion�rio:");
					try{
						
						idade[i] = ler.nextInt();
						func.setIdadeFunc(idade);
						
					}catch(Exception e){
						
						System.out.println("Voc� n�o informou uma idade v�lida.");
						
						return;
					}
					
					System.out.println("\nInforme a situa��o do funcion�rio:");
					try{
						
						situacao[i] = ler.next();
						func.setSituacaoFunc(situacao);
						
					}catch(Exception e){
						
						System.out.println("Voc� n�o informou uma situa��o v�lida.");
						
						return;
					}
					
				}	
				
			}
			
			if(op==2){ //CONSULTA DE FUNCION�RIOS
					
				int aux=0;	
					
				 System.out.println("\nCONSULTANDO FUNCION�RIOS:");
				 System.out.println("\nInforme o nome do Funcion�rio: ");
				 String pesquisa = ler.next();
				 
				 for(i=0; i<total; i++){
				 
				 if (nome[i].equalsIgnoreCase(pesquisa)){
					 
					 aux = i;
				 }
				 
			}
				 
				 System.out.println("\nNome do Funcion�rio: " + func.getNomeFunc()[aux]);
				 System.out.println("\nIdade do Funcion�rio: " + func.getIdadeFunc()[aux]);
				 System.out.println("\nSitua��o do Funcion�rio: " + func.getSituacaoFunc()[aux]);
				 
				
			}
			
			
			if(op==3){ //LISTAGEM DE FUNCION�RIOS
				 
				 System.out.println("\nLISTANDO TODOS OS FUNCION�RIOS:");
				 
				 for (i=0; i<total; i++ ){
					 
					 System.out.println("\nNome do Funcion�rio: " +  func.getNomeFunc()[i]);
					 System.out.println("\nIdade do Funcion�rio: " + func.getIdadeFunc()[i]);
					 System.out.println("\nSitua��o do Funcion�rio: " + func.getSituacaoFunc()[i]);
					 
				 }
				
			}
			
			
			if(op==4){ //LISTAGEM DE FUNCION�RIOS ATIVOS
				
				 System.out.println("\nLISTANDO FUNCION�RIOS ATIVOS:");
				 
				 for(i=0; i<total; i++){
					 
					 if(situacao[i].equalsIgnoreCase("Ativo")){
						 
						 System.out.println("\nNome do Funcion�rio: " + func.getNomeFunc()[i]);
						 System.out.println("\nIdade do Funcion�rio: " + func.getIdadeFunc()[i]);
						 System.out.println("\nSitua��o do Funcion�rio: " + func.getSituacaoFunc()[i]);
						 
						 
					 }
					 
				
				 }
				 
			}
			
			
			if(op==5){ //LISTAGEM DE FUNCION�RIOS INATIVOS
				
				 System.out.println("\nLISTANDO FUNCION�RIOS INATIVOS:");
				 
				 for(i=0; i<total; i++){
					 
					 if(situacao[i].equalsIgnoreCase("Inativo")){
						 
						 System.out.println("\nNome do Funcion�rio: " + func.getNomeFunc()[i]);
						 System.out.println("\nIdade do Funcion�rio: " + func.getIdadeFunc()[i]);
						 System.out.println("\nSitua��o do Funcion�rio: " + func.getSituacaoFunc()[i]);
						 
						 
					 }
					 
				
				 }
				 
			}
			
			
			if(op==6){ //LISTAGEM DOS FUNCION�RIOS POR ORDEM DE IDADE UTILIZANDO BUBBLE SORT
				
				String[] auxNome = nome; //PASSAGENS DOS VETORES PARA O VETORES AUXILIARES PARA A ORDENA��O CRESCENTE
				int[] auxIdade = idade;
				String auxString = null;
				int auxInt = 0;
				
				System.out.println("\nLISTANDO OS FUNCION�RIOS PELA IDADE EM ORDEM CRESCENTE:");
				
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
					 
					 System.out.println("\nNome do Funcion�rio: " + auxNome[i]);
					 System.out.println("\nIdade do Funcion�rio: " + auxIdade[i]);
					 
				 }
				
				
			}
			 
			if(op!=1 && op!=2 && op!=3 && op!=4 && op!=5 && op!=6 && op!=10){ //RETORNA MENSAGEM DE ERRO
				
				System.out.println(func.getRetornaErro());
				
			}
			
		}while(op!=10);
		
		
	}catch(Exception e){
		
		System.out.println("Voc� n�o informou uma op��o v�lida. Encerrando o programa...");
		
		return;
		
		}
	}
}