package arrayList;

public class ArrayListStarter {

	public static void main(String[] args) {
		
		Results r = new Results();
		r.addResult(12.36);
		r.addResult(13.41);
		r.addResult(11.98);
		
		double[] moreResults = {12.95, 14.64, 11.88};
		r.addResults(moreResults);
		
		System.out.println("All Results\n-----------\n" + r.getAllResults());
		
		
		
		System.out.println("Fastest time: " + r.getFastest());
		System.out.println("Slowest time: " + r.getSlowest());
		System.out.println("Average time: " + r.getAverage());
		
		System.out.println();
		
		 // Test getBelow
        System.out.println("Results below 12.0:");
        System.out.println(r.getBelow(12.0));
	}

}
