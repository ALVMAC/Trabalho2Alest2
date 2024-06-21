import java.util.List;

public class ConstrutorGraph {

    public Graph contrutorGrafo(List<Box> boxes) {
        int total = 0;
        Graph graph = new Graph();
        for (Box box : boxes) {
            graph.addBox(box);
        }
        for (int i = 0; i < boxes.size(); i++) {
            int aux = 0;
            for (int j = 0; j < boxes.size(); j++) {
                if (i != j && boxes.get(i).cabe(boxes.get(j))) {
                    graph.addEdge(boxes.get(i), boxes.get(j));
                    // System.out.print(boxes.get(i) + " ");
                    // System.out.println(boxes.get(j));
                    aux++;
                }
            }
            if (aux > total) {
                total = aux;
                graph.setTotal(total);
                // System.out.println(aux);
            }
        }

        return graph;
    }
}
