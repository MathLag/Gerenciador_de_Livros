package br.imd.gerenciadordelivros.dominio;

public class Livro {

    private Long id;
    private String Titulo;
    private String Autor;
    private String Editora;
    private boolean Emprestado;

    public Livro(Long id, String titulo, String autor, String editora, boolean emprestado) {
        this.id = id;
        Titulo = titulo;
        Autor = autor;
        Editora = editora;
        Emprestado = emprestado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public boolean isEmprestado() {
        return Emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        Emprestado = emprestado;
    }
}
