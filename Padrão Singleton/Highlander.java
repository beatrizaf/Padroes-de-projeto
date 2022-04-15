package br.padroes.singleton;

public class Highlander {

    private static int contInstancias = 0;
    private static Highlander instancia;

    private Highlander(){}

    public static Highlander obterInstancia(){
        contInstancias++;
        if (instancia == null){
            instancia = new Highlander();
        }
        return instancia;
    }

    public static int getContInstancias() {
        return contInstancias;
    }

    public int pegaInstancias() {
        return contInstancias;
    }
}
