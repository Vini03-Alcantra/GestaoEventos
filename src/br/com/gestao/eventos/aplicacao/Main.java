package br.com.gestao.eventos.aplicacao;

import br.com.gestao.eventos.dao.EspacoDAO;
import br.com.gestao.eventos.dao.ParticipanteDAO;
import br.com.gestao.eventos.model.Espaco;
import br.com.gestao.eventos.model.Participante;

public class Main {
	public static void main(String[] args) {
		EspacoDAO espacoDAO = new EspacoDAO();
		
		Espaco espaco = new Espaco();
		espaco.setNome_espaco("Audit�rio 1");
		espaco.setLimite_participantes(2000);
		espaco.setDescricao("Local amplo com refrigera��o, com data show e caixas de som devidamente instalados");
		
		espacoDAO.save(espaco);
		
		Participante participante = new Participante();
		ParticipanteDAO participanteDAO = new ParticipanteDAO();
		
		participante.setEmailParticipante("f�f�fe");
		participante.setMatriculaParticipante(1234545);
		participante.setNomeParticipante("Brun�o");
		participante.setSenhaParticipante("18348483");
		participanteDAO.save(participante);
	}
}
