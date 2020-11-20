package br.com.gestao.eventos.model;

public class ReservaEvento {
	private static String nomeEvento;
	private static String horarioEvento;
	private static String dataEvento;
	private static String descricaoEvento;
	
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
