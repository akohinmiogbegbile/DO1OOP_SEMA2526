package arrayList;

// allows all ArrayList methods to be used within this class
import java.util.ArrayList;

public class Results {
	
	// declaration of an ArrayList to store double values
	ArrayList<Double> results;
	
	// constructor, in which the ArrayList is constructed
	public Results() {
		results = new ArrayList<Double>();
	}
	
	// when a double value is passed to this method, it is added to the ArrayLisy
	public void addResult(double newResult) {
		results.add(newResult);
	}
	
	// returns a string consisting of all results in order of entry
	public String getAllResults() {
		String allResults = "";
		for (double result : results) {
			// adds a line break to the string, so results are on one line each
			allResults += result + "\n";
		}
		return allResults;
	}
	
	public double getFastest() {
		// delete the line below and complete this method
		return 0.0;
	}
	
	public double getSlowest() {
		// delete the line below and complete this method
		return 0.0;
	}
	
	public double getAverage() {
		// delete the line below and complete this method
		return 0.0;
	}
	
	public void addResults(double[] newResults) {
		// complete this method		
	}
		
	public ArrayList<Double> getBelow(double threshhold) {
		// delete the line below and complete this method
		return null;
	}

}
