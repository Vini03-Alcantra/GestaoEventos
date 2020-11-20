package br.com.gestao.eventos.model;

public class Espaco {
	private  int idEspaco;	
	private  String nome_espaco;
	private  int  limite_participantes;
	private  String descricao;
	
	public  int getIdEspaco() {
		return idEspaco;
	}
	public  void setIdEspaco(int idEspaco) {
		this.idEspaco = idEspaco;
	}
	
	public  String getNome_espaco() {
		return nome_espaco;
	}
	public  void setNome_espaco(String nome_espaco) {
		this.nome_espaco = nome_espaco;
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
