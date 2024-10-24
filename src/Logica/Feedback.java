package Logica;

import java.io.Serializable;

public class Feedback implements Serializable{
	private String nombreActividad;
    private String comentario;
    private int rating;

    public void agregarComentario(String comentario, int rating) {
        this.comentario = comentario;
        this.rating = rating;
    }

    public void mostrarFeedback() {
        System.out.println("El feedback para " + nombreActividad + "es: " + comentario + ", Rating: " + rating);
    }
}


