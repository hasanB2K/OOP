package MINIPROJECT2;

import java.util.*;

public class MonitorApp {
    public static void main(String[] args) throws Exception {
        // Simulated log file data
        List<List<String>> logData = new ArrayList<>();

        logData.add(Arrays.asList("error: server crashed", "warning: high memory", "process failed"));
        logData.add(Arrays.asList("error: connection lost", "task failed", "warning: low battery"));
        logData.add(Arrays.asList("no issue detected", "error: timeout", "system running fine"));

        ConcurrentAnalyzer analyzer = new ConcurrentAnalyzer(3);  // 3 threads
        analyzer.processLogs(logData);
    }
}
