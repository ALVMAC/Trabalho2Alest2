import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private Map<Box, List<Box>> graph;
    private int total;

    public Graph() {
        graph = new HashMap<>();
        total = 0;
    }

    public void addBox(Box box) {
        graph.putIfAbsent(box, new ArrayList<>());
    }

    public List<Box> getAdjacentBoxes(Box box) {
        return graph.getOrDefault(box, new ArrayList<>());
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public void addEdge(Box box1, Box box2) {
        graph.get(box1).add(box2);
    }

    @Override
    public String toString() {
        return "Graph [graph=" + graph + "]";
    }

}
