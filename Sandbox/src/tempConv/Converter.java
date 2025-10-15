package tempConv;

public class Converter {
	
	//Temperature Converter
	public double celsiusToFahrenheit(double celcius) {
		double fahrenheit  = (celcius * 9.0 / 5.0) + 32;
		return fahrenheit;
	}
	
	//Currency converter
	public double gbpToNaira(double gbp) {
		double naira = (gbp * 1963.25);
		return naira;
		
	}
	
	//lbs to kg
	public double kgToLbs (double kg) {
		double lbs = (kg * 2.20462);
		return lbs;
		
	}
	

}
