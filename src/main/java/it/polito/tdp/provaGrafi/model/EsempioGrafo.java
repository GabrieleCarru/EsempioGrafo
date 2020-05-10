package it.polito.tdp.provaGrafi.model;

import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

public class EsempioGrafo {
	
	public void run() {
		Graph<Integer, DefaultEdge> graph = new SimpleGraph<>(DefaultEdge.class);
		
		for(int i=0; i<=6; i++) {
			graph.addVertex(i);
		}
		
		System.out.println("Grafo con vertici ma senza archi: ");
		System.out.println(graph);
		// ([0, 1, 2, 3, 4, 5, 6], [])
		// Il primo elemento (le prime parentesi quadre) sono i vertici, mentre la seconda gli elementi 
		// che in questo momento non sono presenti (vuoto).
		
		graph.addEdge(1, 2);
		graph.addEdge(2, 5);
		graph.addEdge(1, 5);
		graph.addEdge(3, 6);
		
		System.out.println("Grafo con vertici e archi: ");
		System.out.println(graph);
		// Ora sono presenti anche gli archi
		//([0, 1, 2, 3, 4, 5, 6], [{1,2}, {2,5}, {1,5}, {3,6}])
	}

	public static void main(String[] args) {
		EsempioGrafo eg = new EsempioGrafo();
		eg.run();
	}
}
