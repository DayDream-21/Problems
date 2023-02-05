package com.slavamashkov.problems.tinkoff.tinkoff_19_12_2022;

import java.util.*;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(n + " " + m);
        scanner.nextLine();
        int[][] flights = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] a = scanner.nextLine().split(" ");
            flights[i][0] = Integer.parseInt(a[0]);
            flights[i][1] = Integer.parseInt(a[1]);
            flights[i][2] = Integer.parseInt(a[2]);
        }

        System.out.println(Arrays.deepToString(flights));
        
        findShortestPath(n, m, flights);
    }

    public static void findShortestPath(int n, int m, int[][] flights) {
        // Create an adjacency list representation of the graph
        ArrayList<int[]>[] graph = new ArrayList[n+1];
        for (int i = 1; i <= n; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] flight : flights) {
            int u = flight[0];
            int v = flight[1];
            int t = flight[2];
            graph[u].add(new int[] {v, t});
        }

        // Initialize the queue for the reverse BFS with city n as the starting point
        Deque<int[]> queue = new ArrayDeque<>();
        queue.add(new int[] {n, 0});
        // Initialize a list to store the schedule of airports
        int[] schedule = new int[n+1];
        java.util.Arrays.fill(schedule, -1);
        // Initialize a list to store the distances from city n
        int[] distances = new int[n+1];
        java.util.Arrays.fill(distances, -1);
        // Set the distance of city n to 0
        distances[n] = 0;

        // Perform the reverse BFS
        while (!queue.isEmpty()) {
            int[] curr = queue.poll();
            int u = curr[0];
            int t = curr[1];
            // Check the parity of the current day
            int parity;
            if (t % 2 == 0) {
                // If the current day is even, consider only even flights
                parity = 0;
            } else {
                // If the current day is odd, consider only odd flights
                parity = 1;
            }

            // Iterate through the outgoing flights from city u
            for (int[] flight : graph[u]) {
                int v = flight[0];
                int p = flight[1];
                // Check if the flight has the matching parity
                if (p == parity) {
                    // If the flight has the matching parity, update the distance and schedule
                    if (distances[v] == -1 || distances[v] > distances[u] + 1) {
                        distances[v] = distances[u] + 1;
                        schedule[v] = parity;
                        queue.add(new int[] {v, t+1});
                    }
                }
            }
        }

        // Check if city 1 is reachable
        if (distances[1] == -1) {
            System.out.println(-1);
        } else {
            System.out.println(distances[1]);
            for (int i = 1; i < n; i++) {
                System.out.print(schedule[i] + " ");
            }
            System.out.println(schedule[n]);
        }
    }
}
