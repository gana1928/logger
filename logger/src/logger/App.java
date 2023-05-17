package logger;

import java.util.ArrayList;
import java.util.List;

public class App {
    private List<Integer> log;

    public App() {
        log = new ArrayList<>();
    }

    public void add(int num) {
        log.add(num);
    }

    public int getSum() {
        int sum = 0;
        for (int num : log) {
            sum += num;
        }
        return sum;
    }
}

