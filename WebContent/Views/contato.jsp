<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>


<link rel="stylesheet" type="text/css" href="../CSS/style.css" />
<form name="formulario" action="http://scripts.redehost.com.br/formmail.aspx" method="post">
<input type=hidden name="destino" value="EmailQueVaiReceberAsMensagens">
<input type=hidden name="enviado" value="http://www.seudominio.xxx.yy/enviado.htm">

<label for="senha_login">Motivo do contato</label> <select name="subject" id="subject">
    <option value="" selected="selected">Selecione</option>
    <option value="" selected="selected">InformaÃ§Ã£o</option>
    <option value="" selected="selected">SugestÃ£o</option>
    <option value="" selected="selected">Elogio</option>
  </select>
  <br><br>
<p><b>Nome:</b><br>
<input type=text name="nome" size="45"></p><br>
<p><b>Email:</b><br>
<input type=text name="email" size="45"></p><br>
<p><b>Assunto:</b><br>
<textarea name="Mensagem" rows="10" cols="60" wrap="virtual"></textarea></p><br>
<p><input type="submit" value="Enviar Email"> <input type="reset" value="Limpar FormulÃ¡rio"></p>
</form>