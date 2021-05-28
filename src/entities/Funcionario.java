package entities;

import java.util.List;

public class Funcionario {

	private Integer idFuncionario;
	private String nome;
	private String cpf;
	private String matricula;
	// Funcionario tem 1 setor(Associação)
	private Setor setor;
	// funcionario tem muitos Dependentes
	private List<Dependente> dependente;

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public Funcionario(Integer idFuncionario, String nome, String cpf, String matricula, Setor setor,
			List<Dependente> dependente) {
		super();
		this.idFuncionario = idFuncionario;
		this.nome = nome;
		this.cpf = cpf;
		this.matricula = matricula;
		this.setor = setor;
		this.dependente = dependente;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public List<Dependente> getDependente() {
		return dependente;
	}

	public void setDependente(List<Dependente> dependente) {
		this.dependente = dependente;
	}

	@Override
	public String toString() {
		return "Dependente [idFuncionario=" + idFuncionario + ", nome=" + nome + ", cpf=" + cpf + ", matricula="
				+ matricula + ", setor=" + setor + ", dependente=" + dependente + "]";
	}
}
