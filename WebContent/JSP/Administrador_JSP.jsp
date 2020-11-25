<%@page import="br.com.gestao.eventos.dao.AdministradorDAO"%>
<%@page import="br.com.gestao.eventos.model.Administrador"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Administrador administrador = new Administrador();
		AdministradorDAO administradorDAO = new AdministradorDAO();
		
		String nomeAdministrador = request.getParameter("");
		String emailAdministrador = request.getParameter("");
		String senhaAdministrador = request.getParameter("");
		String loginAdministrador = request.getParameter("");
		int registroAdministrador = Integer.parseInt(request.getParameter(""));
		
		administrador.setNomeAdministrador(nomeAdministrador);
		administrador.setEmailAdministrador(emailAdministrador);
		administrador.setSenhaAdministrador(senhaAdministrador);
		administrador.setLoginAdministrador(loginAdministrador);
		administrador.setRegistroAdministrador(registroAdministrador);
		
		administradorDAO.save(administrador);
	%>
</body>
</html>