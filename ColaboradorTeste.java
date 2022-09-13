package listaPoo;

public class ColaboradorTeste {
	public static void main(String[] args) {
		Colaborador c = new Colaborador();
		c.setIdade(22);
		c.setNome("capitao");
		c.setSalario(3000.0);
		
		
		System.out.println(c.toString());
		Colaborador c2 = new Colaborador();
		c2.setIdade(22);
		c2.setNome("capitao");
		c2.setSalario(3000.0);
		
		
		System.out.println(c2.toString());
	}

}
