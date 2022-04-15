package br.padroes.bridge;
import java.util.Scanner;

public class JanelaDownload extends JanelaAbstrata {

    public JanelaDownload(JanelaImplementada j) {
        super(j);
    }

    @Override
    public void desenhar(){
        desenharJanela("Janela de Download");

        String caminho;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Onde o Download deve ser realizado: ");
        caminho = scanner.nextLine();
        System.out.println("Seu arquivo será salvo em :"+ caminho);
        scanner.close();

        desenharBotao("Botão Realizar Download");
        desenharBotao("Botão Pausar Download");
        desenharBotao("Botão Cancelar Download");

    }
}
