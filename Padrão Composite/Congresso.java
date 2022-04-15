package br.edu.ifpb.composite;
import java.util.ArrayList;
import java.util.List;

public class Congresso {
    private String nome;
    private int totalAssentos;
    private List<Participante> participantes = new ArrayList<>();

    public Congresso(String nome, int totalAssentos) {
        this.nome = nome;
        this.totalAssentos = totalAssentos;
        participantes = new ArrayList<>();
    }

    public String getNome() { return nome; }

    public int getTotalAssentos() { return totalAssentos; }

    public int getTotalParticipantes() {
        int totalParticipantes = 0;

        for (Participante participante : participantes) {
            if (participante instanceof Individuo) { totalParticipantes++; }
            else if (participante instanceof Instituicao instituicao) { totalParticipantes += instituicao.getMembros().size(); }
        }
        return totalParticipantes;
    }

    public void adicionarParticipante(Participante participante) {

        if (participante instanceof Individuo) {

            if (totalAssentos > participantes.size()) { participantes.add(participante); }
            else { throw new UnsupportedOperationException("Não possui assentos livres!"); }

        } else if (participante instanceof Instituicao x) {

            if (totalAssentos > participantes.size() + x.getMembros().size()) { participantes.add(participante); }
            else { throw new UnsupportedOperationException("Não possui quantidade de assentos livres!");            }
        }
    }

    public void imprimeParticipantes() {
        for (Participante participante : participantes) {
            if (participante instanceof Individuo) { System.out.println(participante + " - Instituição: Sem Filiação"); }
            else if (participante instanceof Instituicao instituicao) { instituicao.imprimeMembros(); }
        }
    }

    @Override
    public String toString() {
        return this.nome + " - Assentos: " + this.totalAssentos
                + " - Participantes: " + getTotalParticipantes();
    }

    public static void main(String[] args) {
        Congresso congresso = new Congresso("Congresso Estadual", 10);
        Participante lorena = new Individuo("Lorena Lopes", 2);
        congresso.adicionarParticipante(lorena);

        Participante leandro = new Individuo("Leandro", 3);
        Participante partidoTrabalhadores = new Instituicao("PDT");
        partidoTrabalhadores.adicionar(leandro);

        congresso.adicionarParticipante(partidoTrabalhadores);
        System.out.println(congresso);
        congresso.imprimeParticipantes();
    }
}
