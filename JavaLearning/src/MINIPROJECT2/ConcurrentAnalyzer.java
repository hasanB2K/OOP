package MINIPROJECT2;

import java.util.*;
import java.util.concurrent.*;

public class ConcurrentAnalyzer {
    private ExecutorService executor;
    private ConcurrentHashMap<String, Integer> combinedResults;

    public ConcurrentAnalyzer(int poolSize) {
        executor = Executors.newFixedThreadPool(poolSize);
        combinedResults = new ConcurrentHashMap<>();
    }

    public void processLogs(List<List<String>> allFileData) throws Exception {
        long start = System.currentTimeMillis();

        List<Future<Map<String, Integer>>> futures = new ArrayList<>();

        // submit each "log file" to executor
        for (List<String> lines : allFileData) {
            futures.add(executor.submit(new FileProcessor(lines)));
        }

        // collect each thread’s result
        for (Future<Map<String, Integer>> f : futures) {
            Map<String, Integer> fileResult = f.get();
            fileResult.forEach((k, v) -> combinedResults.merge(k, v, Integer::sum));
        }

        long end = System.currentTimeMillis();

        System.out.println("\nFinal Keyword Summary: " + combinedResults);
        System.out.println("Total Execution Time: " + (end - start) + " ms");

        executor.shutdown();
    }
}
