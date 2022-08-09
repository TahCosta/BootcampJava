import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setCargaHoraria(10);
        curso.setDescricao("descrição curso Java");
        curso.setTitulo("curso Java");
        System.out.println(curso);

        Curso curso2 = new Curso();
        curso2.setCargaHoraria(7);
        curso2.setDescricao("descrição curso SpringBoot");
        curso2.setTitulo("curso SpringBoot");
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setDescricao("descrição mentoria Java");
        mentoria.setTitulo("mentoria Java");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Bootcamp Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devTamara = new Dev();
        devTamara.setNome("Tamara");
        devTamara.inscreverBootcamp(bootcamp);
        devTamara.progredir();
        System.out.println("\nTamara Conteudos Inscritos: "+devTamara.getConteudosInscritos());
        System.out.println("\nTamara Conteudos Concluídos: "+devTamara.getConteudosConcluidos());
        System.out.println("\nTamara XP: "+devTamara.calcularTotalXp());
        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println(devCamila);
        System.out.println("\nCamila Conteudos Inscritos: "+devCamila.getConteudosInscritos());
        System.out.println("\nCamila Conteudos Concluídos: "+devCamila.getConteudosConcluidos());
        System.out.println("\nCamila XP: "+devCamila.calcularTotalXp());

    }   

}
