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
	public static currency Identify(int index) {
		currency c;
		if(index==0)
		{   
			c=new currency("Rupees",73.67);
		}
		else if(index==1) {
			c= new currency("CAD",1.31);
		}
		else if(index==2) {
			c= new currency("AUS",1.41);
		}
		else if(index==3) {
			c= new currency("Euro",0.87);
		}
		else {
			c= new currency("Kuwaiti Dinar",0.30);
		}
		return c;
		
	}
	

public currency(String name,double rate) {
	this.name=name;
	this.rate = rate;
}
}
