package br.com.dio.desafio.dominio;

public class cursos extends conteudo{
    private int cargaHoraria;
    
    public cursos() {
    }
    
    public int getCargaHoraria(){
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }
    
    @Override
    public String toString(){
        return "\nTítulo do Curso         :'" + getTitulo() + 
           "\', \nDescrição do Curso      :'" + getDescricao() + 
           "\', \nCarga Horária do Curso  :'" + getCargaHoraria() +
           "\'  \n ******* ------------- *******";
    }
    
    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }
}

