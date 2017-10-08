
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pessoa p1 = new Pessoa();
		Visitante v1 = new Visitante();
		
		v1.setNome("Augusto");
		v1.setIdade(23);
		v1.setSexo("Masculino");
	
		System.out.println(v1.toString());
		
		Aluno a1 = new Aluno();
		
		a1.setNome("Antônio");
		a1.setMatricula(6317100);
		a1.setCurso("Análise e Desenvolvimento de Sistemas");
		a1.setIdade(25);
		a1.setSexo("Masculino");
		System.out.println(a1.toString());
		a1.pagarMensalidade();
		
		
		Bolsista bolsista = new Bolsista();
		
		bolsista.setMatricula(6317105);
		bolsista.setNome("Gabriel");
		bolsista.setBolsa(19.5f);
		bolsista.setSexo("Masculino");
		System.out.println(bolsista.toString());
		bolsista.pagarMensalidade();
		
		Professor p1 = new Professor();
		
		p1.setNome("Prof. João Victor");
		p1.setEspecialidade("Doutor em Direito pela PUCRS");
		p1.setIdade(32);
		p1.setSalario(8000);
		p1.setSexo("Masculino");
		p1.fazerAniversario();

		System.out.println(p1.toString());
		System.out.println(p1.getEspecialidade());
		
		
	}

}
