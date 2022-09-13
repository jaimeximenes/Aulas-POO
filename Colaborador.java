package listaPoo;

public class Colaborador {
	
	private String nome;
	private Integer idade;
	private Double salario;
	public static Integer matricula = 0 ;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	Colaborador(){
		Colaborador.matricula = matricula +1;
	
	}

	@Override
	public String toString() {
		return "Colaborador [matricula=" + matricula + ", nome=" + nome + ", idade=" + idade + ", salario=" + salario
				+ "]";
	}


	
}
