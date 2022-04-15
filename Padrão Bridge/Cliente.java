package br.padroes.bridge;

public class Cliente {
    public static void main(String[] args) {

        JanelaAbstrata janela = new JanelaDialogo(new JanelaLinux());
        janela.desenhar();
        janela = new JanelaAviso(new JanelaLinux());
        janela.desenhar();
        janela = new JanelaDownload(new JanelaLinux());
        janela.desenhar();

        janela = new JanelaDialogo(new JanelaWindows());
        janela.desenhar();
        janela = new JanelaAviso(new JanelaWindows());
        janela.desenhar();
        janela = new JanelaDownload(new JanelaWindows());
        janela.desenhar();

        janela = new JanelaDialogo(new JanelaAndroid());
        janela.desenhar();
        janela = new JanelaAviso(new JanelaAndroid());
        janela.desenhar();
        janela = new JanelaDownload(new JanelaAndroid());
        janela.desenhar();

        janela = new JanelaDialogo(new JanelaMac());
        janela.desenhar();
        janela = new JanelaAviso(new JanelaMac());
        janela.desenhar();
        janela = new JanelaDownload(new JanelaMac());
        janela.desenhar();
    }
}
