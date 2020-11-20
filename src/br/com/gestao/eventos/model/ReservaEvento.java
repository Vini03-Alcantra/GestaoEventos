package br.com.gestao.eventos.model;

public class ReservaEvento {
	private static int idReservaEvento;
	private static String nomeEvento;
	private static String horarioEvento;
	private static String dataEvento;
	private static String descricaoEvento;
	private static int idEspaco;
	private static int idProfessor;
	
	public static int getIdReservaEvento() {
		return idReservaEvento;
	}
	public static void setIdReservaEvento(int idReservaEvento) {
		ReservaEvento.idReservaEvento = idReservaEvento;
	}
	public static int getIdEspaco() {
		return idEspaco;
	}
	public static void setIdEspaco(int idEspaco) {
		ReservaEvento.idEspaco = idEspaco;
	}
	public static int getIdProfessor() {
		return idProfessor;
	}
	public static void setIdProfessor(int idProfessor) {
		ReservaEvento.idProfessor = idProfessor;
	}
	
	public static String getNomeEvento() {
		return nomeEvento;
	}
	public static void setNomeEvento(String nomeEvento) {
		ReservaEvento.nomeEvento = nomeEvento;
	}
	public static String getHorarioEvento() {
		return horarioEvento;
	}
	public static void setHorarioEvento(String horarioEvento) {
		ReservaEvento.horarioEvento = horarioEvento;
	}
	public static String getDataEvento() {
		return dataEvento;
	}
	public static void setDataEvento(String dataEvento) {
		ReservaEvento.dataEvento = dataEvento;
	}
	public static String getDescricaoEvento() {
		return descricaoEvento;
	}
	public static void setDescricaoEvento(String descricaoEvento) {
		ReservaEvento.descricaoEvento = descricaoEvento;
	}
	
	
	
}
