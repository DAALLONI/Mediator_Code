package mediator;

import colleague.Estudiante;
import model.Libro;

public interface Mediator {

    void solicitarLibro(Estudiante estudiante, Libro libro);

    void devolverLibro(Estudiante estudiante, Libro libro);
}
