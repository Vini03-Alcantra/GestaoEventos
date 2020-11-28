<%@page import="br.com.gestao.eventos.dao.LoginParticipanteDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Participante</title>
</head>
<body>
	<%
		LoginParticipanteDAO loginParticipanteDAO = new LoginParticipanteDAO();
	
		String emailLogin = request.getParameter("email_login");
		String senhaLogin = request.getParameter("senha_login");
		
		if(loginParticipanteDAO.checkLogin(emailLogin, senhaLogin)){
			String urlIndex = "../Views/Index.html";
			response.sendRedirect(urlIndex);
		} else{
			String urlErro = "../Views/tenteNovamente.html";
			response.sendRedirect(urlErro);
		}
	
	%>
</body>
</html>