<%@page import="br.com.gestao.eventos.dao.ParticipanteDAO"%>
<%@page import="br.com.gestao.eventos.model.Participante"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Cadastro Realizado</title>
</head>
<body>
	<%
		Participante participante = new Participante();
		ParticipanteDAO participanteDAO = new ParticipanteDAO();
		
		
		String nomeParticipante = request.getParameter("nome_cad");
		int matriculaParticipante = Integer.parseInt(request.getParameter("matricula_cad"));
		String senhaParticipante = request.getParameter("senha_cad");
		String emailParticipante = request.getParameter("email_cad");
		
		participante.setNomeParticipante(nomeParticipante);
		participante.setMatriculaParticipante(matriculaParticipante);
		participante.setSenhaParticipante(senhaParticipante);
		participante.setEmailParticipante(emailParticipante);
		
		participanteDAO.save(participante);
		
		
	%>
	
	<h1>Seu Cadastro foi realizado</h1>
</body>
</html>