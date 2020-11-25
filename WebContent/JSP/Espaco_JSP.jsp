<%@page import="br.com.gestao.eventos.dao.EspacoDAO"%>
<%@page import="br.com.gestao.eventos.model.Espaco"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		Espaco espaco = new Espaco();
		EspacoDAO espacoDAO = new EspacoDAO();
	
		String nomeEspaco = request.getParameter("");
		int limiteParticipantes = Integer.parseInt(request.getParameter(""));
		String descricao = request.getParameter("");
		
		espaco.setNome_espaco(nomeEspaco);
		espaco.setLimite_participantes(limiteParticipantes);
		espaco.setDescricao(descricao);
		
		espacoDAO.save(espaco);
		
	%>
</body>
</html>