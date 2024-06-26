import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConstrutorGraph {

    public void construtorGraph(List<Box> boxes, Graph graph) {
        for (Box box : boxes) {
            graph.addBox(box);
        }
        for (Box b1 : boxes) {
            for (Box b2 : boxes) {
                if (b1 != b2 && b1.cabe(b2)) {
                    graph.addEdge(b1, b2);
                }
            }
        }
    }

    public int encontrarMaiorAninhamento(Graph graph, List<Box> boxes) {
        Map<Box, Integer> mapa = new HashMap<>();
        int maior = 0;
        for (Box box : boxes) {
            if(maior < dfs(graph, box, mapa)){
                maior = dfs(graph, box, mapa);
            }
        }
        return maior;
    }

    private int dfs(Graph graph, Box box, Map<Box, Integer> mapa) {
        if (mapa.containsKey(box)) {
            return mapa.get(box);
        }
        int maior = 1; // Inclui a própria caixa
        for (Box next : graph.getAdjacentBoxes(box)) {
            if(maior < dfs(graph, next, mapa)+1){
                maior = dfs(graph, next, mapa)+1;
            }
        }
        mapa.put(box, maior);
        return maior;
    }
}
