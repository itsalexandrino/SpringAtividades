package br.com.escola.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity // criar tabela
@Table(name = "tb_turma") // esta criando a tabela no banco com os atributos
public class Turma {
	
	@Id // minha chave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
	private long id;
	
	@NotNull
	private String turma;
	
	
	private boolean ativo;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTurma() {
		return turma;
	}
	public void setTurma(String turma) {
		this.turma = turma;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

}
