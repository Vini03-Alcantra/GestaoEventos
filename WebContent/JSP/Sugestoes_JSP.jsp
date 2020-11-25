<%@page import="br.com.gestao.eventos.dao.SugestoesDAO"%>
<%@page import="br.com.gestao.eventos.model.Sugestoes"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<title>Sugestão cadastrada</title>
</head>
<body>
	<%
		Sugestoes sugestoes = new Sugestoes();
		SugestoesDAO sugestoesDAO = new SugestoesDAO();
		
		String nome = request.getParameter("nome");		
		String email = request.getParameter("email");
		String mensagem = request.getParameter("mensagem");		
		
		sugestoes.setNomeEnviado(nome);
		sugestoes.setEmailEnviado(email);
		sugestoes.setAssunto(mensagem);
		
		sugestoesDAO.save(sugestoes);
	%>
	
	<h1>Cadastro Realizado com sucesso</h1>
</body>
</html>