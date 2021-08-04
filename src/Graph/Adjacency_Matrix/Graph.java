package Graph.Adjacency_Matrix;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;


public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int[][] adjacencyMatrix;
    
    Graph(ArrayList<GraphNode> nodeList){
        this.nodeList = nodeList;
        adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    void addUndirectedEdge(int i,int j){
        adjacencyMatrix[i][j] = 1;
        adjacencyMatrix[j][i] = 1;
    }

    ArrayList<GraphNode> getNeighbours(GraphNode node){
        ArrayList<GraphNode> neighbours = new ArrayList<GraphNode>();
        int index = node.index;
        for(int i = 0; i < adjacencyMatrix.length; i++){
            if(adjacencyMatrix[index][i]==1){
                neighbours.add(nodeList.get(i));
            }
        }
        return neighbours;
    }

    void bfsVisit(GraphNode node){
        LinkedList<GraphNode> queue = new LinkedList<GraphNode>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print(currentNode.name+" ");
            ArrayList<GraphNode> neighbours = getNeighbours(currentNode);
            for(GraphNode neighbour : neighbours){
                if(!neighbour.isVisited){
                    queue.add(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    void BFS(){
        for(GraphNode node : nodeList){
            if(!node.isVisited){
                bfsVisit(node);
            }
        }
    }

    void dfsVisit(GraphNode node){
        Stack<GraphNode> stack = new Stack<GraphNode>();
        stack.push(node);
        while(!stack.isEmpty()){
            GraphNode currentNode = stack.pop();
            currentNode.isVisited = true;
            System.out.print(currentNode.name+" ");
            ArrayList<GraphNode> neighbours = getNeighbours(currentNode);
            for(GraphNode neighbour : neighbours){
                if(!neighbour.isVisited){
                    stack.push(neighbour);
                    neighbour.isVisited = true;
                }
            }
        }
    }

    void DFS(){
        for(GraphNode node : nodeList){
            if(!node.isVisited){
                dfsVisit(node);
            }
        }
    }

    String display() {
        StringBuilder s = new StringBuilder();
        s.append("   ");
        for(int i=0;i<nodeList.size();i++){
            s.append(nodeList.get(i).name+" ");
        }
        s.append("\n");
        for(int i=0;i<nodeList.size();i++){
            s.append(nodeList.get(i).name+": ");
            for(int j:adjacencyMatrix[i]){
                s.append((j)+" ");
            }
            s.append("\n");
        }
        return s.toString();
    }

    void addDirectedEdge(int i, int j){
        adjacencyMatrix[i][j] = 1;
    }

    void topologicalVisit(GraphNode node,Stack<GraphNode> stack){
        ArrayList<GraphNode> neighbours = getNeighbours(node);
        for (GraphNode neighbour : neighbours) {
            if (!neighbour.isVisited) {
              topologicalVisit(neighbour, stack);
            }
          }
          node.isVisited = true;
          stack.push(node);
    }

    void topologicalSort(){
       Stack<GraphNode> stack = new Stack<>();
       for(GraphNode node : nodeList){
           if(!node.isVisited){
               topologicalVisit(node, stack);
           }
       }
       while(!stack.isEmpty()){
           System.out.print(stack.pop().name+" ");
       }
    }

    void printPath(GraphNode node){
        if(node.parent != null){
            printPath(node.parent);
        }
        System.out.print(node.name+" ");
    }

    void BFSForSSSPP(GraphNode node){
        LinkedList<GraphNode> queue = new LinkedList<>();
        queue.add(node);
        while(!queue.isEmpty()){
            GraphNode currentNode = queue.remove(0);
            currentNode.isVisited = true;
            System.out.print("Printing path for "+currentNode.name+": ");
            printPath(currentNode);
            System.out.println();
            ArrayList<GraphNode> neighbours = getNeighbours(currentNode);
            for(GraphNode neighbour : neighbours){
                if(!neighbour.isVisited){
                    neighbour.isVisited = true;
                    neighbour.parent = currentNode;
                    queue.add(neighbour);
                }
            }
        }
    }
}
