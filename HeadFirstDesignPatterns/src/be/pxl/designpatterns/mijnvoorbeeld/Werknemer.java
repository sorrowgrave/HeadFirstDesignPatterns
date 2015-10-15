package be.pxl.designpatterns.mijnvoorbeeld;

public class Werknemer implements Werkgever {

	private String naam;
	private int blijdschap;
	
	public Werknemer(String naam, int blijdschap)
	{
		this.naam = naam;
		this.blijdschap = blijdschap;
	}
	
	public void ShowHappiness()
	{
		System.out.println(naam + " heeft een blijdschap niveau van: " + blijdschap);
	}
	
}
