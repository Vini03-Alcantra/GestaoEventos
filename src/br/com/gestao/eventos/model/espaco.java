package br.com.gestao.eventos.model;

public class espaco {
	private static String nome_espaco;
	private static int  limite_participantes;
	private static String descricao;
	
	public static String getNome_espaco() {
		return nome_espaco;
	}
	public static void setNome_espaco(String nome_espaco) {
		espaco.nome_espaco = nome_espaco;
	}
	public static int getLimite_participantes() {
		return limite_participantes;
	}
	public static void setLimite_participantes(int limite_participantes) {
		espaco.limite_participantes = limite_participantes;
	}
	public static String getDescricao() {
		return descricao;
	}
	public static void setDescricao(String descricao) {
		espaco.descricao = descricao;
	}
	
	
}
