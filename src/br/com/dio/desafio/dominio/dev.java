package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class dev {
    private String nome;
    private Set<conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<conteudo> conteudosConcluidos = new LinkedHashSet<>();

    @Override
    public String toString(){
        return "\nnome                    :'" + this.getNome() + 
           "\'";
    }

    public void inscreverBootCamp(bootCamp bootCamp) {
        bootCamp.getDevsInscritos().add(this);
        this.conteudosInscritos.addAll(bootCamp.getConteudos());
    }

    public void progredir() {
        Optional<conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else{
            System.err.println("Você não está inscrito em nenhum conteúdo. \nVerifique nossa lista de BootCamps.");
        }
    }

    public double calculartotalXP() {

        return this.conteudosConcluidos
                .stream()
                .mapToDouble(conteudo -> conteudo.calcularXP())
                .sum();
/*
        return this.conteudosConcluidos
                .stream()
                .mapToDouble(conteudo::calcularXP)
                .sum();
*/
    }
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<conteudo> getConteudoInscritos(){
        return this.conteudosInscritos;
    }

    public void setConteudoInscritos(Set<conteudo> conteudosInscritos) {
        this.conteudosInscritos = conteudosInscritos;
    }

    public Set<conteudo> getConteudoConcluidos(){
        return this.conteudosConcluidos;
    }

    public void setConteudoConcluidos(Set<conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        dev dev = (dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudosInscritos, dev.conteudosInscritos) && Objects.equals(conteudosConcluidos, dev.conteudosConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscritos, conteudosConcluidos);
    }
}
