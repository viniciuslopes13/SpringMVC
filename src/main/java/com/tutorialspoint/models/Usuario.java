package com.tutorialspoint.models;

public class Usuario {
	
	private String nome;
	private String senha;
	private String endereco;
	private boolean receberNoticias;
	private String [] frameworkFavorito;
	private String genero;
	private String numeroFavorito;
	private String pais;
	private String [] habilidades;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public boolean isReceberNoticias() {
		return receberNoticias;
	}
	public void setReceberNoticias(boolean receberNoticias) {
		this.receberNoticias = receberNoticias;
	}
	public String[] getFrameworkFavorito() {
		return frameworkFavorito;
	}
	public void setFrameworkFavorito(String[] frameworkFavorito) {
		this.frameworkFavorito = frameworkFavorito;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getNumeroFavorito() {
		return numeroFavorito;
	}
	public void setNumeroFavorito(String numeroFavorito) {
		this.numeroFavorito = numeroFavorito;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String[] getHabilidades() {
		return habilidades;
	}
	public void setHabilidades(String[] habilidades) {
		this.habilidades = habilidades;
	}
	
}
