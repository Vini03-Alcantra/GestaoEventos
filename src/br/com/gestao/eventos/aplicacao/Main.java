package br.com.gestao.eventos.aplicacao;

import br.com.gestao.eventos.dao.EspacoDAO;
import br.com.gestao.eventos.model.Espaco;

public class Main {
	public static void main(String[] args) {
		EspacoDAO espacoDAO = new EspacoDAO();
		
		Espaco espaco = new Espaco();
		espaco.setNome_espaco("Auditório 1");
		espaco.setLimite_participantes(2000);
		espaco.setDescricao("Local amplo com refrigeração, com data show e caixas de som devidamente instalados");
		
		espacoDAO.save(espaco);
	}
}
