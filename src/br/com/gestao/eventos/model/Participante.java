package br.com.gestao.eventos.model;

public class Participante {
	private  int idReservaEvento;	
	private  int idParticipante;	
	private  String nomeParticipante;
	private  int matriculaParticipante;
	private  String cursoParticipante;
	
	public  int getIdReservaEvento() {
		return idReservaEvento;
	}
	public  void setIdReservaEvento(int idReservaEvento) {
		this.idReservaEvento = idReservaEvento;
	}
	
	public  int getIdParticipante() {
		 return idParticipante;
	}
	public  void setIdParticipante(int idParticipante) {
		this.idParticipante = idParticipante;
	}
	
	public  String getNomeParticipante() {
		return nomeParticipante;
	}
	public  void setNomeParticipante(String nomeParticipante) {
		this.nomeParticipante = nomeParticipante;
	}
	public  int getMatriculaParticipante() {
		return matriculaParticipante;
	}
	public  void setMatriculaParticipante(int matriculaParticipante) {
		this.matriculaParticipante = matriculaParticipante;
	}
	public  String getCursoParticipante() {
		return cursoParticipante;
	}
	public  void setCursoParticipante(String cursoParticipante) {
		this.cursoParticipante = cursoParticipante;
	}
	
	
}
