import java.util.LinkedList;

//each node has a weight and a list of edges
public class Node {
    public int id;
    public String name;
    private boolean visited;
    LinkedList<Edge> edges;

    Node(int id, String nameOfLocation) {
        this.id = id;
        this.name = nameOfLocation;
        visited = false;
        edges = new LinkedList<>();
    }

    boolean isVisited() {
        return visited;
    }

    void visit() {
        visited = true;
    }

    void unvisit() {
        visited = false;
    }
}
