package be.pxl.designpatterns.mijnvoorbeeld;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Werknemer a = new Werknemer("Werknemer Bjorn", 5);
		Toezichthouder b = new Toezichthouder("Toezichthouder Kenny", 1337);
		Toezichthouder c = new Toezichthouder("Toezichthouder Kris", 69);
		Toezichthouder d = new Toezichthouder("Toezichthouder Niels", 9000);
		Werknemer e = new Werknemer("Werknemer Jimmy", 5);
		
		//relaties toevoegen
		b.AddOndergeschikte(a);
		c.AddOndergeschikte(b);
		c.AddOndergeschikte(d);
		d.AddOndergeschikte(e);
		
		//Kris toont zijn blijdschap en vraagt iedereen hetzelfde te doen
		
		if(c instanceof Werkgever)
		{
			((Werkgever)c).ShowHappiness();
		}
		
		
		
	}

}
