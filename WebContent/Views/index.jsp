<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title> GestÃ£o de eventos </title>
<meta charset='utf-8' />
<link rel="stylesheet" type="text/css" href="../CSS/style.css" />
</head>
<body>
    
<!--MENU-->
<h1>GestÃ£o de eventos</h1>

<nav class="nav">
	<ul>
		<li><a href="#">Home</a>
    <li><a href="#">Fale conosco</a>
		<li class="drop"><a href="#">Eventos</a>
			<ul class="dropdown">
				<li><a href="#online">Online</a></li>
				<li><a href="presencial">Presencial</a></li>
			</ul>
		</li>
		
		
	</ul>
</nav>

<script >
$(".drop")
  .mouseover(function() {
  $(".dropdown").show(300);
});
$(".drop")
  .mouseleave(function() {
  $(".dropdown").hide(300);     
});

</script>


<div class="container" >
    <a class="links" id="paracadastro"></a>
    <a class="links" id="paralogin"></a>
    
    <div class="content">      
      <!--LOGIN-->
      <div id="login">
        <form method="post" action=""> 
          <h1>Login</h1> 
          <p> 
            <label for="email_login">Seu e-mail</label>
            <input id="email_login" name="email_login" required="required" type="text" placeholder=""/>
          </p>
          
          <p> 
            <label for="senha_login">Sua senha</label>
            <input id="senha_login" name="senha_login" required="required" type="password" placeholder="" /> 
          </p>


          <p> 
            
<label for="senha_login">Tipo de conta</label> <select name="subject" id="subject">
    <option value="" selected="selected">Administrador</option>
    <option value="" selected="selected">Participante</option>
    <option value="" selected="selected">Organizador</option>
  </select>
  <br><br> 
          </p>
          


          <p> 
            <input type="checkbox" name="manterlogado" id="manterlogado" value="" /> 
            <label for="manterlogado">Manter-me logado</label>
          </p>
          


          <p> 
            <input type="submit" value="Logar" /> 
          </p>
          
          <p class="link">
            Ainda nÃ£o tem conta?
            <a href="#paracadastro">Cadastre-se</a>
          </p>
        </form>
      </div>


<!-- FormulÃ¡rio de Login -->
  <form action="validacao.php" method="post">
  <fieldset>
  <legend>Dados de Login</legend>
      <label for="txUsuario">UsuÃ¡rio</label>
      <input type="text" name="usuario" id="txUsuario" maxlength="25" />
      <label for="txSenha">Senha</label>
      <input type="password" name="senha" id="txSenha" />

      <input type="submit" value="Entrar" />
  </fieldset>
  </form>


  













      <!--FORMULÃRIO DE CADASTRO-->
      <div id="cadastro">
        <form method="post" action=""> 
          <h1>Cadastro</h1> 

          
          <p> 
            <label for="nome_cad">Nome completo</label>
            <input id="nome_cad" name="nome_cad" required="required" type="text" placeholder="" />
          </p>
          
          <p> 
            <label for="email_cad">e-mail</label>
            <input id="email_cad" name="email_cad" required="required" type="email" placeholder=""/> 
          </p>
          
          <p> 
            <label for="senha_cad">Sua senha</label>
            <input id="senha_cad" name="senha_cad" required="required" type="password" placeholder=""/>
          </p>
          
          <p> 
            <input type="submit" value="Cadastrar"/> 
          </p>
          
          <p class="link">  
            JÃ¡ tem conta?
            <a href="#paralogin"> Ir para Login </a>
          </p>
        </form>
      </div>
    </div>
  </div> 

</body>
</html>