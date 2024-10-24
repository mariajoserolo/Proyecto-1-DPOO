package Logica;

import java.util.ArrayList;
import java.io.Serializable;

public class Profesor implements Serializable {

	private ArrayList<LearningPath> listaLearningPath;
	private ArrayList<Actividad> listaActividadesCreadas;
	
	public Profesor() {
		this.listaLearningPath = new ArrayList<>();
		this.listaActividadesCreadas = new ArrayList<>();
	}
		
	public void addLP(LearningPath learningPath) {
		listaLearningPath.add(learningPath);
		}
	
	public void addActividadCreada(Actividad actividad) {
		listaActividadesCreadas.add(actividad);
		}
	
	
	
}
