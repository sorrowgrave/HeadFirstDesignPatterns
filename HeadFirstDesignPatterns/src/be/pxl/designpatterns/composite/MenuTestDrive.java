package be.pxl.designpatterns.composite;

public class MenuTestDrive {
	
	public static void main(String args[]){
		MenuComponent pancakeHouseMenu =
				new Menu("Pancake house menu", "Breakfast");
		MenuComponent dinerMenu =
				new Menu("Diner menu", "Lunch");
		MenuComponent cafeMenu =
				new Menu("Cafe menu", "Dinner");
		MenuComponent dessertMenu =
				new Menu("Dessert menu", "Dessert of course!");
		
		MenuComponent allMenus = new Menu("All Menus", "All Menus combined");
		
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
		
		//add menu items here
		
		dinerMenu.add(new MenuItem(
				"pasta",
				"spaghetti with marinara sauce",
				true,
				3.89));
		
		dinerMenu.add(dessertMenu);
		
		dessertMenu.add(new MenuItem(
				"Apple pie",
				"Apple pie with a flakey crust, topped with vanilla icecream",
				true,
				1.59));
		
		//add more menu items here
		
		Waitress waitress = new Waitress (allMenus);
		waitress.printMenu();
		
	}

}
