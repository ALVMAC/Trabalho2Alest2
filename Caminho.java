import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Caminho {

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

    public int encontrarMaior(Graph graph, List<Box> boxes) {
        long inicio = System.nanoTime();
        Map<Box, Integer> mapa = new HashMap<>();
        int maior = 0;
        for (Box box : boxes) {
            if(maior < dfs(graph, box, mapa)){
                maior = dfs(graph, box, mapa);
            }
        }
        long fim = System.nanoTime(); // Captura o tempo de fim
        System.out.println("Tempo para encontrar o maior número de caixas: " + (fim - inicio) + " ns");

        return maior;
    }

    private int dfs(Graph graph, Box box, Map<Box, Integer> mapa) {
        if (mapa.containsKey(box)) {
            return mapa.get(box);
        }
        int maior = 1; //tem que ter a propria caixa na brincadeira
        for (Box next : graph.getAdj(box)) {
            if(maior < dfs(graph, next, mapa)+1){
                maior = dfs(graph, next, mapa)+1;
            }
        }
        mapa.put(box, maior);
        return maior;
    }
}
