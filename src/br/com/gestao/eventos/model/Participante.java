package br.com.gestao.eventos.model;

public class Participante {
		
	private  int idParticipante;	
	private  String nomeParticipante;
	private  int matriculaParticipante;
	private  String emailParticipante; 
	private  String senhaParticipante;
	
	public String getEmailParticipante() {
		return emailParticipante;
	}
	public void setEmailParticipante(String emailParticipante) {
		this.emailParticipante = emailParticipante;
	}
	public  int getIdParticipante() {
		 return idParticipante;
	}
	public  void setIdParticipante(int idParticipante) {
		this.idParticipante = idParticipante;
	}
	
	public  String getNomeParticipante() {
		return nomeParticipante;
	}
	public  void setNomeParticipante(String nomeParticipante) {
		this.nomeParticipante = nomeParticipante;
	}
	public  int getMatriculaParticipante() {
		return matriculaParticipante;
	}
	public  void setMatriculaParticipante(int matriculaParticipante) {
		this.matriculaParticipante = matriculaParticipante;
	}
	public String getSenhaParticipante() {
		return senhaParticipante;
	}
	public void setSenhaParticipante(String senhaParticipante) {
		this.senhaParticipante = senhaParticipante;
	}


	
	
	
}
