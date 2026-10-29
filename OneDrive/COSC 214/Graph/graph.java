public class graph {
    private int vertices;
    private int [][] adjacent_mat;
    
    graph(int vertices){
        this.vertices = vertices;
        this.adjacent_mat = new int[vertices][vertices];
    }

    public void add_edges(int from, int to){
        this.adjacent_mat[from][to] = 1;
        this.adjacent_mat[to][from] = 1;
    }

    public void display_matrix(){
        for( int i=0; i<adjacent_mat.length ; i++){
            for(int j=0; j< adjacent_mat[i].length ;j++){
                System.out.print(adjacent_mat[i][j] + " ");
            }
           System.out.println();
        }
    }
   
    // Implement the functionality to check the connectedness
    public void connectedness(int from, int to) {
        boolean[] visited = new boolean[vertices];

        if (isConnected(from, to, visited)) {
            System.out.println(from + " and " + to + " are connected.");
        } else {
            System.out.println(from + " and " + to + " are not connected.");
        }
    }

    private boolean isConnected(int from, int to, boolean[] visited) {
        if (from == to) {
            return true;
        }

        visited[from] = true;

        for (int i = 0; i < vertices; i++) {
            if (adjacent_mat[from][i] == 1 && !visited[i]) {
                if (isConnected(i, to, visited)) {
                    return true;
                }
            }
        }

        return false;
    }

    // Implement the functionality to list the adjacent nodes of a given node
    public void adjacent_nodes(int vertex) {
        System.out.print("Adjacent nodes of " + vertex + ": ");

        for (int i = 0; i < vertices; i++) {
            if (adjacent_mat[vertex][i] == 1) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
    }
}

