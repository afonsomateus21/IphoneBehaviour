package com.afonsomateus.iphone;

import com.afonsomateus.navegador.INavegador;
import com.afonsomateus.player.IReprodutorMusical;
import com.afonsomateus.telefone.Telefone;

public class Iphone extends Telefone implements INavegador, IReprodutorMusical {
	private String numero;
	
	public Iphone(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public void tocar() {
		System.out.println("Tocando música...");
	}

	@Override
	public void pausar() {
		System.out.println("Pausando a reprodução da música...");
	}

	@Override
	public void selecionarMusica(String musicaSelecionada) {
		System.out.println("Reproduzindo a música " + musicaSelecionada);
	}

	@Override
	public void exibirPagina(String url) {
		System.out.println("Você está na página " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página...");
	}
}
