package MINIPROJECT2;

import java.util.*;
import java.util.concurrent.Callable;

public class FileProcessor implements Callable<Map<String, Integer>> {
    private List<String> fileLines;

    public FileProcessor(List<String> fileLines) {
        this.fileLines = fileLines;
    }

    @Override
    public Map<String, Integer> call() {
        Map<String, Integer> result = new HashMap<>();

        for (String line : fileLines) {
            line = line.toLowerCase();
            if (line.contains("error"))
                result.merge("error", 1, Integer::sum);
            if (line.contains("warning"))
                result.merge("warning", 1, Integer::sum);
            if (line.contains("failed"))
                result.merge("failed", 1, Integer::sum);
        }

        System.out.println(Thread.currentThread().getName() + " finished analyzing file");
        return result;
    }
}