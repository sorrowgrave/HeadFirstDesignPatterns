package be.pxl.designpatterns.composite;

public class MenuItem extends MenuComponent{
	//Extend MenuComponent interface

	String name;
	String description;
	boolean vegetarian;
	double price;
	
	//We voorzien een constructor voor MenuItem met enkele properties
		
	
	public MenuItem(String name, 
					String description,
					boolean vegetarian,
					double price)
	{
		this.name = name;
		this.description = description;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	
	
	//getter en setters
	
	public String getName()
	{
		return name;
	}
	
	public String getDescription()
	{
		return description;
	}
	public double getPrice()
	{
		return price;
	}
	public boolean isVegetarian()
	{
		return vegetarian;
	}
	
	//Hier printen we alle values van de object properties
	
	public void print()
	{
		System.out.println(" " + getName());
		
		if(isVegetarian()){
			System.out.println("(v)");
		}
		
		System.out.println(", " + getPrice());
		System.out.println("		-- " + getDescription());
	}
	
}
