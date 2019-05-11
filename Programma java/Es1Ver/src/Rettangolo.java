
public class Rettangolo {

	private double base;
	private double altezza;
	//costruttore
	
	public Rettangolo(){}
	
	public Rettangolo(double base, double altezza)
	{
		this.base = base;
		this.altezza = altezza;
	}
	//getter setter
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	//to string 
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + "]";
	}

	
}
