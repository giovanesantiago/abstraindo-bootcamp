import br.com.gio.bootcamp.dominio.Curso;
import br.com.gio.bootcamp.dominio.Mentoria;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
        Curso curso2 = new Curso("Curso JS", "Descrição curso JS", 4);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição de mentoria Java", LocalDate.now());
        System.out.println(mentoria);

    }
}
