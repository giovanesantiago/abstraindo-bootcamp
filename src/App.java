import br.com.gio.bootcamp.dominio.Curso;

public class App {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
        Curso curso2 = new Curso("Curso JS", "Descrição curso JS", 4);

        System.out.println(curso1);
        System.out.println(curso2);

    }
}
