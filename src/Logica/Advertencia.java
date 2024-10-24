package Logica;

import java.io.Serializable;

public class Advertencia implements Serializable {
	private String preRequisitos;

    public void agregarAdvertencia(String prerequisito) {
        this.preRequisitos = prerequisito;
    }

    public void mostrarAdvertencia() {
        System.out.println("Advertencia: " + preRequisitos);
    }
}


