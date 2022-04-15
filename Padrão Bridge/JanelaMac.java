package br.padroes.bridge;

public class JanelaMac implements  JanelaImplementada {

    @Override
    public void desenharJanela(String titulo){
        System.out.println(titulo + " - Janela Mac");
    }

    @Override
    public void desenharBotao(String titulo){
        System.out.println(titulo + " - Botao Mac");
    }
}
