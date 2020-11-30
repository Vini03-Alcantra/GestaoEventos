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
		System.out.println("Tipo de Conta " +emailLogin);
		String senhaLogin = request.getParameter("senha_login");
		System.out.println("Tipo de Conta " +senhaLogin);
		int tipoConta = 0;
		try{
			tipoConta = Integer.parseInt(request.getParameter("tipoConta"));
			System.out.println("Tipo de Conta " +tipoConta);
		} catch(Exception e){
			e.printStackTrace();
		}
		
		
		
		if(loginParticipanteDAO.checkLogin(emailLogin, senhaLogin, tipoConta)){
			if(tipoConta == 1){
				String url = "../Views/IndexAdmin.jsp";
				response.sendRedirect(url);
			} else if(tipoConta == 2){
				String url = "../Views/Index.jsp";
				response.sendRedirect(url);
			} else if(tipoConta == 3){
				String url = "../Views/IndexUser.jsp";
				response.sendRedirect(url);
			} else{
				String url = "../Views/Sucesso.html";
			}
		} else{
			String urlErro = "../Views/tenteNovamente.html";
			response.sendRedirect(urlErro);
		}
	
	%>
</body>
</html>