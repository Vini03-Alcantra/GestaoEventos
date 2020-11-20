package br.com.gestao.eventos.model;

public class Participante {
	private static int idReservaEvento;	
	private static int idParticipante;	
	private static String nomeParticipante;
	private static int matriculaParticipante;
	private static String cursoParticipante;
	
	public static int getIdReservaEvento() {
		return idReservaEvento;
	}
	public static void setIdReservaEvento(int idReservaEvento) {
		Participante.idReservaEvento = idReservaEvento;
	}
	
	public static int getIdParticipante() {
		return idParticipante;
	}
	public static void setIdParticipante(int idParticipante) {
		Participante.idParticipante = idParticipante;
	}
	
	public static String getNomeParticipante() {
		return nomeParticipante;
	}
	public static void setNomeParticipante(String nomeParticipante) {
		Participante.nomeParticipante = nomeParticipante;
	}
	public static int getMatriculaParticipante() {
		return matriculaParticipante;
	}
	public static void setMatriculaParticipante(int matriculaParticipante) {
		Participante.matriculaParticipante = matriculaParticipante;
	}
	public static String getCursoParticipante() {
		return cursoParticipante;
	}
	public static void setCursoParticipante(String cursoParticipante) {
		Participante.cursoParticipante = cursoParticipante;
	}
	
	
}
