<%@page import="java.util.List"%>
<%@page import="br.com.gestao.eventos.model.Espaco"%>
<%@page import="br.com.gestao.eventos.dao.EspacoDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Painel de Eventos</title>
</head>
<body>
<%
	EspacoDAO espacoDAO = new EspacoDAO();
	List<Espaco> espaco; 

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
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>1</td>
                    <td>1</td>
                    <td>1</td>
                    <td>1</td>
                    <td>1</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                    <td>2</td>
                </tr>
                <tr>
                    <td>3</td>
                    <td>3</td>
                    <td>3</td>
                    <td>3</td>
                    <td>3</td>
                </tr>
                <tr>
                    <td>4</td>
                    <td>4</td>
                    <td>4</td>
                    <td>4</td>
                    <td>4</td>
                </tr>
                <tr>
                    <td>5</td>
                    <td>5</td>
                    <td>5</td>
                    <td>5</td>
                    <td>5</td>
                </tr>
            </tbody>
        </table>
    <form action="../JSP/ReservaEvento_JSP.jsp" method="POST">
        <fieldset>
            <legend>Cadastrar Evento</legend>
            <table cellspacing="10">
                <tr>                    
                        <td>
                            <label class="td-label" for="Nome">Nome Evento</label>                    
                            <input class = "td-input" id="Nome" type="text" />
                        </td>                     
                </tr>
                
                <tr>           
                        <td>
                            <label class="td-label" for="data">Data</label>
                            <input class = "td-input" id="data" type="date" />                    
                        </td>                             
                </tr>
                
                <tr>                    
                    <td>
                        <label class="td-label" for="horInicial">HorÃ¡rio Inicial</label>                                        
                        <input class = "td-input" id="horInicial" type="time" />
                                        
                        <label class="td-label" for="horInicial">HorÃ¡rio Final</label>                    
                        <input class = "td-input" id="horFinal" type="time" />                    
                    </td>
                </tr>

                <tr>                        
                    <td>
                        <p><label class="td-label" for="descricao">DescriÃ§Ã£o</label></p>
                        <p><textarea name="Descricao" id="descricao" cols="70" rows="5"></textarea></p>
                    </td>
                </tr>

                <tr>              
                    <td>                        
                            <label class="td-label" for="Espaco">EspaÃ§o</label>
                        
                            <select id="Espaco" class="td-select">
                                <option value="#">Quadra Carneiro da Cunha</option>                                
                                <%for(Espaco e: espacoDAO.readEspaco()){%>
                                	<option value="#<%=e.getNome_espaco()%>"><%=e.getNome_espaco()%></option>
                                <%}%>	
                                
                                
                            </select>                                            
                    </td>      
                </tr>

                <tr>
                    <td>
                        <label class="td-label" for="Professor">Professor</label>
                    
                        <select id="Professor" class="td-select">
                            <option value="#">Tiago Sombra</option>
                            <option value="#">Kléber Carrha</option>
                            <option value="#">Pryscilla Sousa</option>
                            <option value="#">João Leonardo</option>
                            <option value="#">Júlio Alcântara Távares</option>
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




