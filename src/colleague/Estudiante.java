package colleague;

import mediator.Mediator;
import model.Libro;

public class Estudiante {

    private String nombre;
    private Mediator mediator;

    public Estudiante(String nombre, Mediator mediator) {
        this.nombre = nombre;
        this.mediator = mediator;
    }

    public String getNombre() {
        return nombre;
    }

    public void solicitarLibro(Libro libro) {
        System.out.println(nombre + " solicita el libro \"" + libro.getTitulo() + "\".");
        mediator.solicitarPrestamo(this, libro);
    }

    public void devolverLibro(Libro libro) {
        System.out.println(nombre + " devuelve el libro \"" + libro.getTitulo() + "\".");
        mediator.devolverLibro(this, libro);
    }
}
