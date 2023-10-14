package com.afonsomateus.iphone;

public class Main {

	public static void main(String[] args) {
		Iphone iphone = new Iphone("(85) 98197-7456");
		
		iphone.selecionarMusica("The Smiths - Heaven Knows I'm Miserable Now");
		iphone.pausar();
		iphone.tocar();
		
		iphone.adicionarNovaAba();
		iphone.exibirPagina("https://www.globoesporte.globo.br/");
		iphone.atualizarPagina();
		
		iphone.ligar("(85) 987842324");
		iphone.iniciarCorreioDeVoz("(85) 987842324");
		iphone.atender("(85) 987842324");
	}

}
