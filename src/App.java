import java.time.LocalDate;

import br.com.dio.desafio.dominio.bootCamp;
import br.com.dio.desafio.dominio.cursos;
import br.com.dio.desafio.dominio.dev;
import br.com.dio.desafio.dominio.mentorias;

public class App {
    public static void main(String[] args) throws Exception {
        cursos curso1 = new cursos();
        curso1.setTitulo("Java");
        curso1.setDescricao("descricao curso Java");
        curso1.setCargaHoraria(8);
///        System.out.println(curso1);
        cursos curso2 = new cursos();
        curso2.setTitulo("Js");
        curso2.setDescricao("descricao curso Js");
        curso2.setCargaHoraria(4);
///        System.out.println(curso2);
        mentorias mentoria1 = new mentorias();
        mentoria1.setTitulo("mentoria de Java");
        mentoria1.setDescricao("descricao mentoria Java");
        mentoria1.setData(LocalDate.now());
///        System.out.println(mentoria1);
        bootCamp bootcamp1 = new bootCamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso2);
        bootcamp1.getConteudos().add(mentoria1);
        System.out.println(bootcamp1);
        dev devFT = new dev();
        devFT.setNome("Fulano de Tal");
        devFT.inscreverBootCamp(bootcamp1);
///        System.out.println("A relação de conteúdos inscritos por  : " + devFT.getNome() + " é " + devFT.getConteudoInscritos() + ".");
///        System.out.println("A relação de conteúdos concluidos por : " + devFT.getNome() + " é " + devFT.getConteudoConcluidos() + ".");
///        System.out.println("A quantidade atual de XP da           : " + devFT.getNome() + " é " + devFT.calculartotalXP() + ".");
        System.out.println("*********");
        devFT.progredir();
///        System.out.println("A quantidade atual de XP da           : " + devFT.getNome() + " é " + devFT.calculartotalXP() + ".");
        devFT.progredir();
///        System.out.println("A quantidade atual de XP da           : " + devFT.getNome() + " é " + devFT.calculartotalXP() + ".");
        devFT.progredir();
///        System.out.println("A quantidade atual de XP da           : " + devFT.getNome() + " é " + devFT.calculartotalXP() + ".");
///        devFT.progredir();
        System.out.println("A quantidade atual de XP da           : " + devFT.getNome() + " é " + devFT.calculartotalXP() + ".");
        System.out.println("A relação de conteúdos inscritos por  : " + devFT.getNome() + " é " + devFT.getConteudoInscritos() + ".");
        System.out.println("A relação de conteúdos concluidos por : " + devFT.getNome() + " é " + devFT.getConteudoConcluidos() + ".");
        
        System.out.println("********* ------ *********");
        
        dev devBT = new dev();
        devBT.setNome("Beltrano de Tal");
        devBT.inscreverBootCamp(bootcamp1);
///        System.out.println("A relação de conteúdos inscritos por  : " + devBT.getNome() + " é " + devBT.getConteudoInscritos() + ".");
///        System.out.println("A relação de conteúdos concluídos por : " + devBT.getNome() + " é " + devBT.getConteudoConcluidos() + ".");
///        System.out.println("A quantidade atual de XP da           : " + devBT.getNome() + " é " + devBT.calculartotalXP() + ".");
        System.out.println("*********");
        devBT.progredir();
        System.out.println("A quantidade atual de XP da           : " + devBT.getNome() + " é " + devBT.calculartotalXP() + ".");
        System.out.println("A relação de conteúdos inscritos por  : " + devBT.getNome() + " é " + devBT.getConteudoInscritos() + ".");
        System.out.println("A relação de conteúdos concluidos por : " + devBT.getNome() + " é " + devBT.getConteudoConcluidos() + ".");
        System.out.println(bootcamp1);
    }
}