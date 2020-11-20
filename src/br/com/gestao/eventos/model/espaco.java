package br.com.gestao.eventos.model;

public class Espaco {
	private  int idthis;	
	private  String nome_this;
	private  int  limite_participantes;
	private  String descricao;
	
	public  int getIdthis() {
		return idthis;
	}
	public  void setIdthis(int idthis) {
		this.idthis = idthis;
	}
	
	public  String getNome_this() {
		return nome_this;
	}
	public  void setNome_this(String nome_this) {
		this.nome_this = nome_this;
	}
	public  int getLimite_participantes() {
		return limite_participantes;
	}
	public  void setLimite_participantes(int limite_participantes) {
		this.limite_participantes = limite_participantes;
	}
	public  String getDescricao() {
		return descricao;
	}
	public  void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
