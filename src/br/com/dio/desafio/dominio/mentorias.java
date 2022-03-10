package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class mentorias extends conteudo{
    private LocalDate data;

    public mentorias() {
        
    }
   
    public LocalDate getData(){
        return this.data;
    }

    public void setData(LocalDate data){
        this.data = data;
    }
    
    @Override
    public String toString(){
        return "\nTítulo da Mentoria      :'" + this.getTitulo() + 
           "\', \nDescrição da Mentoria   :'" + this.getDescricao() + 
           "\', \nData da Mentoria        :'" + this.getData() + 
           "\'  \n ******* ------------- *******";
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20d;
    }
}
