package br.com.gestao.eventos.model;

public class Sugestoes {
	private static String emailEnviado;
	private static String nomeEnviado;
	private static String assunto;
	
	public static String getEmailEnviado() {
		return emailEnviado;
	}
	public static void setEmailEnviado(String emailEnviado) {
		Sugestoes.emailEnviado = emailEnviado;
	}
	public static String getNomeEnviado() {
		return nomeEnviado;
	}
	public static void setNomeEnviado(String nomeEnviado) {
		Sugestoes.nomeEnviado = nomeEnviado;
	}
	public static String getAssunto() {
		return assunto;
	}
	public static void setAssunto(String assunto) {
		Sugestoes.assunto = assunto;
	}
	
	
	
}
