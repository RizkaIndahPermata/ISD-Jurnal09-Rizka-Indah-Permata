import java.util.*;
public class AdjacencyList {
    private Map<Character , ArrayList<Character>> graph = new HashMap<>();
    public void add(char start , char dst){
        if (!graph.containsKey(start)){
            graph.put(start, new ArrayList<>());
        }
        if (!graph.containsKey(dst)){
            graph.put(dst, new ArrayList<>());
        }
        graph.get(start).add(dst);
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();

        for (Character vertexs : graph.keySet()){
            result.append("Vertex ").append(vertexs).append("-->");

            for (Character vertexd : graph.get(vertexs)){
                result.append(vertexd).append(" ");
            }
            result.append("\n");
        }
        
        return result.toString();
    }
    
}
