package br.com.gestao.eventos.model;

public class Sugestoes {
	private  int idSugestoes;	
	private  String emailEnviado;
	private  String nomeEnviado;
	private  String assunto;
	
	public  int getIdSugestoes() {
		return idSugestoes;
	}
	public  void setIdSugestoes(int idSugestoes) {
		this.idSugestoes = idSugestoes;
	}
	
	public  String getEmailEnviado() {
		return emailEnviado;
	}
	public  void setEmailEnviado(String emailEnviado) {
		this.emailEnviado = emailEnviado;
	}
	public  String getNomeEnviado() {
		return nomeEnviado;
	}
	public  void setNomeEnviado(String nomeEnviado) {
		this.nomeEnviado = nomeEnviado;
	}
	public  String getAssunto() {
		return assunto;
	}
	public  void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	
	
	
}
