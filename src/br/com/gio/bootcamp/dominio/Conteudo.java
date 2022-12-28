package br.com.gio.bootcamp.dominio;

// abstract = não consegui instancia o conteudo
public abstract class Conteudo {

    // Protected = So as classes filhas vão ter acesso / static = para dar acesso a outras classes fora Coteudo
    protected static final double XP_PADRAO = 10d;
    private String titulo;
    private String descricao;

    // ‘abstract’ = para obrigar a classe filha ter uma lógica desse metodo
    public abstract double calcularXp();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
