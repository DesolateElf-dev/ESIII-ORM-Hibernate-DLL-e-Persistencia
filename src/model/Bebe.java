package model;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="bebe")
public class Bebe {
	
	@Column(name = "cpf")
	@NotNull
	private float cpf;
	
	
	private String nome;
	private LocalDateTime dataNascimento;
	private double peso;
	private double altura;
	private int idMae;
	private int idMedico;
	
	public float getCpf() {
		return cpf;
	}
	public void setCpf(float cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdMae() {
		return idMae;
	}
	public void setIdMae(int idMae) {
		this.idMae = idMae;
	}
	public int getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(int idMedico) {
		this.idMedico = idMedico;
	}
	
	@Override
	public String toString() {
		return "Bebe [cpf=" + cpf + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", peso=" + peso
				+ ", altura=" + altura + ", idMae=" + idMae + ", idMedico=" + idMedico + "]";
	}
	

}
