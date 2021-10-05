package chapter7;

import java.util.*;

public class DijkstrasAlgorithm {
    static Map<String, Map<String, Integer>> graph = fillGraph();
    static Map<String, Integer> costs = getCosts();
    static Map<String, String> parents = getParents();
    static Set<String> checkedVertex = new HashSet<>();

    public static void main(String[] args) {

        System.out.println(parents);
        System.out.println(costs);
        System.out.println(graph);

        System.out.println("----------");
        algorithm();

        System.out.println(parents);
        System.out.println(costs);
        System.out.println(graph);
    }

    public static void algorithm() {
        String node = findLowestCostNode(costs);
        int cost = -1;

        while (node != null) {

            cost = costs.get(node);
            Map<String, Integer> neighbors = graph.get(node);

            for (String str: neighbors.keySet()) {
                int new_cost = cost + neighbors.get(str);
                if (costs.get(str) > new_cost) {
                    costs.put(str, new_cost);
                    parents.put(str, node);
                }
            }
            checkedVertex.add(node);
            node = findLowestCostNode(costs);
            System.out.println(node);
        }
    }

    public static String findLowestCostNode(Map<String, Integer> costs) {
        String res = "";
        int min = Integer.MAX_VALUE;
        for(Map.Entry<String, Integer> entry: costs.entrySet()) {
            if (entry.getValue() < min && !checkedVertex.contains(entry.getKey())) {
                min = entry.getValue();
                res = entry.getKey();
            }
        }

        return res;
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
