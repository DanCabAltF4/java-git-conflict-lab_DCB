package model;

public class Libro {
    private String isbn;
    private String titulo;
    private int reservasActivas;

    public Libro(String isbn, String titulo) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.reservasActivas = 0;
    }

    public void setReservasActivas(int reservasActivas) {
        this.reservasActivas = reservasActivas;
    }
    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public boolean isDisponible() {
        return reservasActivas == 0;
    }

    public void incrementarReservas() {
        reservasActivas++;
    }

    @Override
    public String toString() {
        return titulo + " (" + isbn + ") - " +
               (isDisponible() ? "Disponible" : "No disponible");
    }
}
