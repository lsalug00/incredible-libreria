public class Libro
{
    private String titulo;
    private String autor;
    private Libreria libreria;
    
    public Libro(String titulo, String autor, Libreria libreria){
        this.titulo = titulo;
        this.autor = autor;
        this.libreria = libreria;
    }
}