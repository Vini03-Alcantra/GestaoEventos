<!-- <%@page import="br.com.gestao.eventos.dao.ReservaEventoDAO"%>
<%@page import="br.com.gestao.eventos.model.ReservaEvento"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Painel Principal Usuário</title>
<link rel="stylesheet" href="../CSS/StyleIndexUser.css">
</head>
<body>
<!-- <%
	ReservaEventoDAO reservaEventoDAO = new ReservaEventoDAO();
%> -->
<div class="content">
	<h1>Eventos Previstos</h1>
	<table class="eventos">
        <thead>
            <tr>
                <th>Local</th>
                <th>Descrição</th>
                <th>Professor</th>
                <th>Horário</th>
                <th>Data</th>
            </tr>
        </thead>
        <tbody>
            <%for(ReservaEvento re: reservaEventoDAO.read()){%>
                <tr>
                    <td><%=re.getNomeEspaco() %></td>
                    <td><textarea><%=re.getDescricaoEvento() %></textarea></td>
                    <td><%=re.getNomeProfessor() %></td>
                    <td><%=re.getHorarioEvento() %></td>
                    <td><%=re.getDataEvento() %></td>
                </tr>
            <%}%>
            
        </tbody>
    </table>
</div>       
</body>
</html>