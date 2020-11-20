package br.com.gestao.eventos.model;

public class Participante {
	private static String nomeParticipante;
	private static int matriculaParticipante;
	private static String cursoParticipante;
	
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
