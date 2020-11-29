<%@page import="br.com.gestao.eventos.dao.SelectForeignKey"%>
<%@page import="br.com.gestao.eventos.dao.ReservaEventoDAO"%>
<%@page import="br.com.gestao.eventos.model.ReservaEvento"%>
<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>O evento foi cadastrado</title>
</head>
<body>
	<%
		ReservaEvento reservaEvento = new ReservaEvento();
		ReservaEventoDAO reservaEventoDAO = new ReservaEventoDAO();
		SelectForeignKey selectForeignKey = new SelectForeignKey();
		
		String nomeEvento = request.getParameter("nomeEvento");
		String horarioIniEvento = request.getParameter("horarioIniEvento");
		String horarioFinEvento = request.getParameter("horarioFinEvento");
		String dataEvento = request.getParameter("dataEvento");
		String descricaoEvento = request.getParameter("descricaoEvento");
		String nomeEspaco = request.getParameter("espaco");
		String nomeProfessor = request.getParameter("professor");
		int idEspaco = selectForeignKey.ForeignKeyEspaco(nomeEspaco); 
		int idProfessor = selectForeignKey.ForeingKeyProfessor(nomeProfessor);
		
		reservaEvento.setNomeEvento(nomeEvento);
		reservaEvento.setHorarioEvento(horarioIniEvento+ "-" +horarioFinEvento);
		reservaEvento.setDataEvento(dataEvento);
		reservaEvento.setDescricaoEvento(descricaoEvento);
		reservaEvento.setIdEspaco(idEspaco);
		reservaEvento.setIdProfessor(idProfessor);
		
		reservaEventoDAO.save(reservaEvento);
		
	%>
</body>
</html>