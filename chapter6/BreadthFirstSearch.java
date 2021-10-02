package chapter6;

import java.util.*;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("John", List.of("Clare", "Bob", "Alice"));
        graph.put("Bob", List.of("Anudj", "Peggi"));
        graph.put("Clare", List.of("Tom", "Johnny"));
        graph.put("Alice", List.of("Peggi"));
        graph.put("Anudj", Collections.emptyList());
        graph.put("Tom", Collections.emptyList());
        graph.put("Johnny", Collections.emptyList());
        graph.put("Peggi", Collections.emptyList());

        System.out.println(BFS(graph, "John", "Dmitry"));
        System.out.println(BFS(graph, "John", "Alice"));
        System.out.println(BFS(graph, "Tom", "Clare"));
    }

    // подходит для ориентированного графа без петель
    public static boolean BFS(Map<String, List<String>> map,String first, String x) {
        Deque<String> deque = new LinkedList<>();
        deque.push(first);
        while (!deque.isEmpty()) {
            String name = deque.pollFirst();
            if (name.equals(x)) {
                return true;
            }
            map.get(name).forEach(deque::addLast);
        }
        return false;
    }
}

//class Node {
//    String name;
//    List<Node> vertexList;
//
//    public Node(String name, List<Node> vertexList) {
//        this.name = name;
//        this.vertexList = vertexList;
//    }
//}
