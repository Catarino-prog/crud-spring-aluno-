package br.gotasdetecnologia.crud.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "alunos")
public class Aluno implements Serializable {
	
	private static final long serialVersionUID = 5793193696456139068L;

	@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_aluno")
    @SequenceGenerator(name = "seq_aluno", sequenceName = "seq_aluno_id", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "sobrenome", nullable = false)
	private String sobrenome;
	
	@Column(name = "idade")
	private int idade;
	
	@Column(name = "email")
	private String email;

	public Aluno() {
		super();
	}

	public Aluno(Long id, String nome, String sobrenome, int idade, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Aluno [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", idade=" + idade + ", email="
				+ email + "]";
	}
}
