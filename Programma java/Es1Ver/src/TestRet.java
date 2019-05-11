
public class TestRet {

	public static void main(String[] args) {
		
		Rettangoli r = new Rettangoli();
		
		Rettangolo r1 = new Rettangolo(5,8);
		Rettangolo r2 = new Rettangolo(34,5);
		Rettangolo r3 = new Rettangolo(55,22);
	
		r.AddRett(r1);
		r.AddRett(r2);
		r.AddRett(r3);
		
		r.ricerca(34);
		
		
		r.RimREtt(55);
		

	}

}
