package br.com.gestao.eventos.aplicacao;

import br.com.gestao.eventos.dao.EspacoDAO;
import br.com.gestao.eventos.dao.ParticipanteDAO;
import br.com.gestao.eventos.dao.SugestoesDAO;
import br.com.gestao.eventos.model.Espaco;
import br.com.gestao.eventos.model.Participante;
import br.com.gestao.eventos.model.Sugestoes;

public class Main {
	public static void main(String[] args) {
		Sugestoes sugestoes = new Sugestoes();
		SugestoesDAO sugestoesDAO = new SugestoesDAO();
		
		sugestoes.setEmailEnviado("fkfklflflf");
		sugestoes.setAssunto("dsfjifvjfvd");
		sugestoes.setNomeEnviado("fplrgrgbio");
		
		sugestoesDAO.save(sugestoes);
	}
}
