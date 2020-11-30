<%@page import="br.com.gestao.eventos.dao.ProfessorDAO"%>
<%@page import="br.com.gestao.eventos.dao.EspacoDAO"%>
<%@page import="br.com.gestao.eventos.model.Espaco"%>
<%@page import="br.com.gestao.eventos.model.Professor"%>
<%@page import="br.com.gestao.eventos.dao.ReservaEventoDAO"%>
<%@page import="br.com.gestao.eventos.model.ReservaEvento"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../CSS/StyleIndexAdmin.css">
</head>
<body>
<%
	ReservaEvento reservaEvento = new ReservaEvento();
	ReservaEventoDAO reservaEventoDAO = new ReservaEventoDAO();
	
	EspacoDAO espacoDAO = new EspacoDAO();
	ProfessorDAO professorDAO = new ProfessorDAO();
%>
    <div class="content">
        <h1>Painel Principal</h1>
        <table class="eventos">
            <thead>
                <tr>
                    <th>Local</th>
                    <th>Descrição</th>
                    <th>Professor</th>
                    <th>Horário</th>
                    <th>Data</th>
                    <th>Excluir</th>
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
                        <td><button class="remover">Excluir</button></td>
                	</tr>
                <%}%>
                
            </tbody>
        </table>
    <form action="../JSP/ReservaEvento_JSP.jsp" method="POST">
        <fieldset>
            <legend>Cadastrar Evento</legend>
            <table>
                <tr>                    
                        <td>
                            <label class="td-label" for="Nome">Nome Evento</label>                    
                            <input class = "td-input" id="Nome" type="text" name="nomeEvento" />
                        </td>                     
                </tr>
                
                <tr>           
                        <td>
                            <label class="td-label" for="data">Data</label>
                            <input class = "td-input" id="data" type="date" name="dataEvento" />                    
                        </td>                             
                </tr>
                
                <tr>                    
                    <td>
                        <label class="td-label" for="horInicial">Horário Inicial</label>                                        
                        <input class = "td-input" id="horInicial" type="time" name="horarioIniEvento"/>
                                        
                        <label class="td-label" for="horInicial">Horário Final</label>                    
                        <input class = "td-input" id="horFinal" type="time" name="horarioFinEvento"/>                    
                    </td>
                </tr>

                <tr>                        
                    <td>
                        <p><label class="td-label" for="descricao">Descrição</label></p>
                        <p><textarea name="descricaoEvento" id="descricao" cols="60" rows="5"></textarea></p>
                    </td>
                </tr>

                <tr>              
                    <td>                        
                            <label class="td-label" for="Espaco">Espaço</label>
                        
                            <select id="Espaco" class="td-select" name="espaco">                                                                
                                <%for(Espaco e: espacoDAO.readEspaco()){%>
                                	<option value="<%=e.getNome_espaco()%>"><%=e.getNome_espaco()%></option>
                                <%}%>	
                                
                                
                            </select>                                            
                    </td>      
                </tr>

                <tr>
                    <td>
                        <label class="td-label" for="Professor">Professor</label>
                    
                        <select id="Professor" class="td-select" name="professor">
                            <%for(Professor p: professorDAO.read()){%>
                            	<option value="<%=p.getNomeProfessor()%>"><%=p.getNomeProfessor()%></option>
                            <%}%>
                        </select>                    
                    </td>
                </tr>                
            </table>
            <input type="submit" class="btnCadastrarEvent" value="Cadastrar Evento"/>
        </fieldset>        
    </form>
    </div>
</body>
</html>