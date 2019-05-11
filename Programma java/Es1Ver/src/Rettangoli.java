
public class Rettangoli {

	
	private Rettangolo rett[];
	static private int Nmax=1000;
	
	public Rettangoli()
	{
		rett = new Rettangolo[Nmax];
	
	}
	//getter setter
	public Rettangolo[] getRett() {
		return rett;
	}

	public void setRett(Rettangolo[] rett) {
		this.rett = rett;
	}

	public static int getNmax() {
		return Nmax;
	}

	public static void setNmax(int nmax) {
		Nmax = nmax;
	}
	//metodi
	
	public void AddRett(Rettangolo rt) {
		int i;
		for(i=0;i<Nmax;i++) {
			if(rett[i]==null) 
			{
				rett[i]=rt;
				break;
			}
		}
		
	}
	public void ricerca(double base) 
	{
		for(int i=0;i<Nmax;i++)
		{
			if(rett[i].getBase()==base)
			{
				rett[i].toString();
				break;
			}
		}
	}
	
	public void RimREtt(double base) 
	{
		for(int i=0;i<Nmax;i++)
		{
			if(rett[i].getBase()==base)
			{
				rett[i]=null;
				break;
			}
		}
		
	}
	//stampare lato piu lungo,non ha specificato quale 
	public	void baselungo(){
		
		for(int i=0; i<Nmax;i++)
		{
			if(rett[i].getBase()>rett[i+1].getBase())
			{
				rett[i].getBase() = rett[i+1].get
			}
		}
		
	}

}
