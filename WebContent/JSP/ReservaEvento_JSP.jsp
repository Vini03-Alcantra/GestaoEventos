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
		System.out.println(nomeEvento);
		String horarioIniEvento = request.getParameter("horarioIniEvento");
		System.out.println(horarioIniEvento);
		String horarioFinEvento = request.getParameter("horarioFinEvento");
		System.out.println(horarioFinEvento);
		String dataEvento = request.getParameter("dataEvento");
		System.out.println(dataEvento);
		String descricaoEvento = request.getParameter("descricaoEvento");
		System.out.println(descricaoEvento);
		String nomeEspaco = request.getParameter("espaco");
		System.out.println(nomeEspaco);
		String nomeProfessor = request.getParameter("professor");
		System.out.println(nomeProfessor);
		int idEspaco = selectForeignKey.ForeignKeyEspaco(nomeEspaco);
		System.out.println(idEspaco);
		int idProfessor = selectForeignKey.ForeingKeyProfessor(nomeProfessor);
		System.out.println(idProfessor);
		
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