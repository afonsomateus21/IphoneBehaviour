package com.afonsomateus.telefone;

public class Telefone {
	private String numeroTelefone;

	public String getNumeroTelefone() {
		return numeroTelefone;
	}

	public void setNumeroTelefone(String numeroTelefone) {
		this.numeroTelefone = numeroTelefone;
	}
	
	public void ligar(String numeroDestino) {
		System.out.println("Ligando para o número " + numeroDestino);
	}
	
	public void atender(String numeroRemetente) {
		System.out.println("Recebendo chamada do número " + numeroRemetente);
	}
	
	public void iniciarCorreioDeVoz(String numeroDestino) {
		System.out.println("Deixando mensagem na caixa postal do número " + numeroDestino);
	}
}
