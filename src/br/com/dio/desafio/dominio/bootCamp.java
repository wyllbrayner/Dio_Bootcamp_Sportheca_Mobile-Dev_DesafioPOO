package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class bootCamp {
    private String nome;
    private String descricao;
    private final LocalDate DATAINICIAL = LocalDate.now();
    private final LocalDate DATAFINAL = DATAINICIAL.plusDays(45);
    private Set<dev> devsInscritos = new HashSet<>();
    private Set<conteudo> conteudos = new LinkedHashSet<>();
    
    @Override
    public String toString(){
        return   "Título BootCamp         :'" + getNome() + 
           "\', \nDescrição               :'" + getDescricao() + 
           "\', \nData de Início          :'" + getDataInicial() + 
           "\', \nData de Encerramento    :'" + getDataFinal() +
           "\', \nDevs Inscritos          :'" + getDevsInscritos() +
           "\', \nConteúdo neste BootCamp :'" + getConteudos() +
           "\' ";
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return this.DATAFINAL;
    }

    public LocalDate getDataFinal() {
        return this.DATAFINAL;
    }

    public Set<dev> getDevsInscritos() {
        return devsInscritos;
    }

    public void setDevsInscritos(Set<dev> devsInscritos) {
        this.devsInscritos = devsInscritos;
    }

    public Set<conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        bootCamp bootcamp = (bootCamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(descricao, bootcamp.descricao) && Objects.equals(DATAINICIAL, bootcamp.DATAINICIAL) && Objects.equals(DATAFINAL, bootcamp.DATAFINAL) && Objects.equals(devsInscritos, bootcamp.devsInscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, DATAINICIAL, DATAFINAL, devsInscritos, conteudos);
    }
}
