import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) {
        Curso curso = new Curso("curso Java","descrição curso Java",10);
        System.out.println(curso);

        Mentoria mentoria = new Mentoria("mentoria Java","descrição Mentoria Java",LocalDate.now());
        System.out.println(mentoria);
    }   

}
