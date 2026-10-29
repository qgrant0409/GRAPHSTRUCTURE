public class Graphpractice{
    public static void main(String[] args) {
        // Create a class called graph

        graph g = new graph(5);

        g.add_edges(0, 1);
        g.add_edges(0, 3);
        g.add_edges(1, 4);
        g.add_edges(0, 2);
        g.add_edges(2, 3); 

        g.display_matrix();

        g.connectedness(1, 3);
        g.connectedness(1, 4);
        g.adjacent_nodes(0);
    }
}