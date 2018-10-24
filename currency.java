package Classes;

public class currency {
	String name;
	double rate;
	public static double convert(double number,currency c1,currency c2) {
		double base = c1.rate;
		double dest = c2.rate;
		double result =(double)(dest/base*number);
		return result; 
		
	}
	
public currency(String name,double rate) {
	this.name=name;
	this.rate = rate;
}
}
