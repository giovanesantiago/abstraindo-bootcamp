import br.com.gio.bootcamp.dominio.*;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Curso Java", "Descrição curso Java", 8);
        Curso curso2 = new Curso("Curso JS", "Descrição curso JS", 4);

        /*System.out.println(curso1);
        System.out.println(curso2);*/

        Mentoria mentoria = new Mentoria("Mentoria Java", "Descrição de mentoria Java", LocalDate.now());
        /*System.out.println(mentoria);*/

        Conteudo conteudoCurso = new Curso();
        Conteudo conteudoMentoria = new Mentoria();

        // Criando um bootcamp
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        // Criando Dev
        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp); // add bootcamp
        System.out.println("Conteudos inscritos Camila : " + devCamila.getConteudosInscritos());
        devCamila.progredir(); // Progredindo
        System.out.println("---------- Depois de progredir : -----------");
        System.out.println("Conteudos inscritos Camila : " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Camila : " + devCamila.getConteudosConcluidos());
        System.out.println(" XP Camila : " + devCamila.calcularTotalXp()); // Calculando xp total

        System.out.println("------------------------------------");
        // Criando Dev
        Dev devGiovane = new Dev("Giovane");
        devGiovane.inscreverBootcamp(bootcamp); // add bootcamp
        System.out.println("Conteudos inscritos Giovane : " + devGiovane.getConteudosInscritos());
        devGiovane.progredir(); // Progredindo
        devGiovane.progredir(); // Progredindo
        System.out.println("---------- Depois de progredir : -----------");
        System.out.println("Conteudos inscritos Giovane : " + devGiovane.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Giovane : " + devGiovane.getConteudosConcluidos());
        System.out.println(" XP Giovane : " + devGiovane.calcularTotalXp()); // Calculando xp total






    }
}
