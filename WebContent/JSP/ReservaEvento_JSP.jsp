<%@page import="br.com.gestao.eventos.dao.ReservaEventoDAO"%>
<%@page import="br.com.gestao.eventos.model.ReservaEvento"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>O evento foi cadastrado</title>
</head>
<body>
	<%
		ReservaEvento reservaEvento = new ReservaEvento();
		ReservaEventoDAO reservaEventoDAO = new ReservaEventoDAO();
		
		String nomeEvento = request.getParameter("nomeEvento");
		String horarioEvento = request.getParameter("horarioEvento");
		String dataEvento = request.getParameter("horarioEvento");
		String descricaoEvento = request.getParameter("descricaoEvento");
		int idEspaco = Integer.parseInt(request.getParameter("idEspaco"));
		int idProfessor = Integer.parseInt(request.getParameter("idProfessor"));
		
		reservaEvento.setNomeEvento(nomeEvento);
		reservaEvento.setHorarioEvento(horarioEvento);
		reservaEvento.setDataEvento(dataEvento);
		reservaEvento.setDescricaoEvento(descricaoEvento);
		reservaEvento.setIdEspaco(idEspaco);
		reservaEvento.setIdProfessor(idProfessor);
		
		reservaEventoDAO.save(reservaEvento);
		
	%>
</body>
</html>