package Logica;

import java.util.ArrayList;
import java.io.Serializable;

public class Estudiante implements Serializable {

	private ArrayList<LearningPath> listaLearningPathCompletados;
	private ArrayList<LearningPath> listaLearningPathInscritos;
	
	public Estudiante() {
		this.listaLearningPathCompletados = new ArrayList<>();
		this.listaLearningPathInscritos = new ArrayList<>();
	}
		
	public void addLPCompletados(LearningPath learningPath) {
		listaLearningPathCompletados.add(learningPath);
		}
	
	public void addActividadCreada(LearningPath learningPath) {
		listaLearningPathInscritos.add(learningPath);
		}
	
	public void inscribirLP(LearningPath learningPath) {
		listaLearningPathInscritos.add(learningPath);
	}
	
	 public void completarLearningPath(LearningPath learningPath) {
	        listaLearningPathCompletados.add(learningPath);
	        listaLearningPathInscritos.remove(learningPath);
	    }
	
	
}
