package ejgrafos;

public class EjGrafos {

    public static void main(String[] args) {

        Graph<String, Integer> grafo = new AdjacencyMapGraph<>(false);

        Vertex<String> v1 = grafo.insertVertex("1");
        Vertex<String> v2 = grafo.insertVertex("2");
        Vertex<String> v3 = grafo.insertVertex("3");
        Vertex<String> v4 = grafo.insertVertex("4");
        Vertex<String> v5 = grafo.insertVertex("5");
        Vertex<String> v6 = grafo.insertVertex("6");
        Vertex<String> v7 = grafo.insertVertex("7");

        //Completar
        Edge<Integer> a1 = grafo.insertEdge(v7, v7, Integer.SIZE);
        Edge<Integer> a2 = grafo.insertEdge(v7, v7, Integer.SIZE);
        Edge<Integer> a3 = grafo.insertEdge(v7, v7, Integer.SIZE);
        Edge<Integer> a4 = grafo.insertEdge(v7, v7, Integer.SIZE);
        Edge<Integer> a5 = grafo.insertEdge(v7, v7, Integer.SIZE);
        Edge<Integer> a6 = grafo.insertEdge(v7, v7, Integer.SIZE);
        Edge<Integer> a7 = grafo.insertEdge(v7, v7, Integer.SIZE);
        Edge<Integer> a8 = grafo.insertEdge(v7, v7, Integer.SIZE);
        Edge<Integer> a9 = grafo.insertEdge(v7, v7, Integer.SIZE);
        Edge<Integer> a10 = grafo.insertEdge(v7, v7, Integer.SIZE);
        Edge<Integer> a11 = grafo.insertEdge(v7, v7, Integer.SIZE);
        Edge<Integer> a12 = grafo.insertEdge(v7, v7, Integer.SIZE);

        
        //Num vertices g.vertices
        //NumEdges g.edges()
        //outgoingedges arcos que salen de
        //incoming edges arcos que llegan a
        //opposite el otro lado del vertice
        //end vertices nos devuelve los nodos conectados por el arco
    }

}
