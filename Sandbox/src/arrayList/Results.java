package arrayList;

import java.util.ArrayList;

public class Results {

    ArrayList<Double> results;

    public Results() {
        results = new ArrayList<Double>();
    }

    public void addResult(double newResult) {
        results.add(newResult);
    }

    public String getAllResults() {
        String allResults = "";
        for (double result : results) {
            allResults += result + "\n";
        }
        return allResults;
    }

    // 1. Fastest (lowest value)
    public double getFastest() {
        double fastest = results.get(0);
        for (double r : results) {
            if (r < fastest) {
                fastest = r;
            }
        }
        return fastest;
    }

    // 2. Slowest (highest value)
    public double getSlowest() {
        double slowest = results.get(0);
        for (double r : results) {
            if (r > slowest) {
                slowest = r;
            }
        }
        return slowest;
    }

    // 3. Average (mean)
    public double getAverage() {
        double total = 0;
        for (double r : results) {
            total += r;
        }
        return total / results.size();
    }

    // 4. Add an array of new results
    public void addResults(double[] newResults) {
        for (double value : newResults) {
            results.add(value);
        }
    }

    // 5. Return a new list of results below a certain threshold
    public ArrayList<Double> getBelow(double threshold) {
        ArrayList<Double> below = new ArrayList<>();
        for (double r : results) {
            if (r < threshold) {
                below.add(r);
            }
        }
        return below;
    }
}
