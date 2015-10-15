package be.pxl.designpatterns.composite;

import java.util.ArrayList;

public class Menu extends MenuComponent{
	//Ook menu maakt deel uit van MenuComponent
	
	ArrayList menuComponents = new ArrayList();
	//Menu kan oneindig veel children hebben van het type
	//MenuComponent, we gebruiken hier voor een interne ArrayList

	String name;
	String description;
	
	//Constructor van Menu, we geven elk menu een naam en een description
	public Menu(String name, String description)
	{
		this.name = name;
		this.description = description;
	}
		

}
