package br.com.gestao.eventos.model;

public class ReservaEvento {
	private  int idReservaEvento;
	private String nomeEvento;
	private String horarioEvento;
	private String dataEvento;
	private String descricaoEvento;
	private int idEspaco;
	private int idProfessor;
	
	public int getIdReservaEvento() {
		return idReservaEvento;
	}
	public void setIdReservaEvento(int idReservaEvento) {
		this.idReservaEvento = idReservaEvento;
	}
	public int getIdEspaco() {
		return idEspaco;
	}
	public void setIdEspaco(int idEspaco) {
		this.idEspaco = idEspaco;
	}
	public int getIdProfessor() {
		return idProfessor;
	}
	public void setIdProfessor(int idProfessor) {
		this.idProfessor = idProfessor;
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
	public void setHorarioEvento(String horarioEvento) {
		this.horarioEvento = horarioEvento;
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
