package chapter7;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DijkstrasAlgorithm {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> graph = fillGraph();
        Map<String, Integer> costs = getCosts();
        Map<String, String> parents = getParents();

        System.out.println(parents);
        System.out.println(costs);
        System.out.println(graph);
    }

    public void algorithm() {
        
    }

    public static Map<String, String> getParents() {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("A", "Start");
        map.put("B", "Start");
        map.put("Final", null);

        return map;
    }

    public static Map<String, Integer> getCosts() {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 6);
        map.put("B", 2);
        map.put("Final", Integer.MAX_VALUE);

        return map;
    }

    public static Map<String, Map<String, Integer>> fillGraph() {
        Map<String, Map<String, Integer>> graph = new LinkedHashMap<>();

        HashMap<String, Integer> startIn = new HashMap<>();
        startIn.put("A", 6);
        startIn.put("B", 2);
        graph.put("Start", startIn);

        HashMap<String, Integer> a = new HashMap<>();
        a.put("Final", 1);
        graph.put("A", a);

        HashMap<String, Integer> b = new HashMap<>();
        b.put("A", 3);
        b.put("Final", 5);
        graph.put("B", b);

        graph.put("Final", Collections.emptyMap());

        return graph;
    }
}
