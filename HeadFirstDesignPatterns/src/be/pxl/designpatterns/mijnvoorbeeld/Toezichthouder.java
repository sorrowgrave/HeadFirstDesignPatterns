package be.pxl.designpatterns.mijnvoorbeeld;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Toezichthouder implements Werkgever {
	
	private String naam;
	private int blijdschap;
	
	private List<Werkgever> ondergeschikte = new ArrayList<Werkgever>();
	
	public Toezichthouder(String naam, int blijdschap)
	{
		this.naam = naam;
		this.blijdschap = blijdschap;
	}
	
	public void ShowHappiness()
	{
		for(Iterator<Werkgever> i = ondergeschikte.iterator(); i.hasNext(); ) {
		     i.ShowHappiness();
		}
	}
	
	public void AddOndergeschikte(Werkgever werkgever)
	{	
		ondergeschikte.add(werkgever);
	}
	

}
