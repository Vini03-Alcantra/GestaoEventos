package br.com.gestao.eventos.model;

public class ReservaEvento {
	private  int idReservaEvento;
	private String nomeEvento;
	private String horarioEvento;
	private String dataEvento;
	private String descricaoEvento;
	private String nomeEspaco;
	private String nomeProfessor;
	
	public String getNomeEspaco() {
		return nomeEspaco;
	}
	public void setNomeEspaco(String nomeEspaco) {
		this.nomeEspaco = nomeEspaco;
	}
	public String getNomeProfessor() {
		return nomeProfessor;
	}
	public void setNomeProfessor(String nomeProfessor) {
		this.nomeProfessor = nomeProfessor;
	}
	
	
	public int getIdReservaEvento() {
		return idReservaEvento;
	}
	public void setIdReservaEvento(int idReservaEvento) {
		this.idReservaEvento = idReservaEvento;
	}
	
	
	public String getNomeEvento() {
		return nomeEvento;
	}
	public void setNomeEvento(String nomeEvento) {
		this.nomeEvento = nomeEvento;
	}
	public String getHorarioEvento() {
		return horarioEvento;
	}
	public void setHorarioEvento(String horarioIniEvento) {
		this.horarioEvento = horarioIniEvento;
	}
	public String getDataEvento() {
		return dataEvento;
	}
	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}
	public String getDescricaoEvento() {
		return descricaoEvento;
	}
	public void setDescricaoEvento(String descricaoEvento) {
		this.descricaoEvento = descricaoEvento;
	}
	
	
	
}
