package com.afonsomateus.player;

public interface IReprodutorMusical {
	
	public abstract void tocar();
	public abstract void pausar();
	public abstract void selecionarMusica(String musicaSelecionada);
	
//	public void tocar() {
//		System.out.println("Tocando a música...");
//	}
//	
//	public void pausar() {
//		System.out.println("Pausando a música...");
//	}
//
//	public String getMusicaAtual() {
//		return musicaAtual;
//	}
//
//	public void setMusicaAtual(String musicaAtual) {
//		this.musicaAtual = musicaAtual;
//	}
}
