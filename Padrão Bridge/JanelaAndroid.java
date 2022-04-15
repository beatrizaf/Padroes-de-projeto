package br.padroes.bridge;

public class JanelaAndroid implements  JanelaImplementada{

    @Override
    public void desenharJanela(String titulo){
        System.out.println(titulo + " - Janela Android");
    }

    @Override
    public void desenharBotao(String titulo){
        System.out.println(titulo + " - Botao Android");
    }
}
