package Ejercicio1Clases;

public class Libros {
    private String titulo;
    private String autor;
    private int anioPublicacion;
    private boolean prestado;
    public Libros(String titulo, String autor, int AnioPublicacion){
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
        this.prestado = false;
    }
    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    public void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println("Prestado: " + (prestado ? "Sí" : "No"));
    }
}

