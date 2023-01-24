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
    
    public String getAutor() {
        return autor;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public Libreria getLibreria() {
        return libreria;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setLibreria(Libreria libreria){
        this.libreria = libreria;
    }
}