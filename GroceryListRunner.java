import java.util.Scanner;

public class GroceryListRunner {

	public static void main(String[] args) {

		GroceryList list = new GroceryList();
		Scanner kb = new Scanner(System.in);
		System.out.println("Hi! Welcome to Grocery List.");
		String play = "yes";
		while(play.equalsIgnoreCase("yes")) {
			System.out.println("Would you like to: ");
			System.out.println("1. Add item and quantity.");
			System.out.println("2. Remove item and its quantity (if it is on the list).");
			System.out.println("3. Change the quantity of an item.");
			System.out.println("4. Replace an item, which changes its quantity.");
			System.out.println("5. Display your list.");
			System.out.println("6. Quit.");
			System.out.println("1, 2, 3, 4, 5, or 6?");
			int response = kb.nextInt();
			kb.nextLine();
			
			if(response == 1) {
				System.out.println("What would you like to add?");
				String x = kb.nextLine();
				if(list.contains(x)) { 		
					System.out.println("This item is already on your list.");
				}
				else { 
					System.out.println("How many?");
					int y = kb.nextInt();
					list.add(x, y);
			}
			}
			
			else if(response == 2) {
				System.out.println("Which item would you like to remove?");
				String x = kb.nextLine();
				if (!list.contains(x)) {
					System.out.println("This item is not on your list.");
				}
				else {
					list.remove(x);
				}
			}
			
			else if(response == 3) {
				System.out.println("Which item quantity would you like to change?");
				String x = kb.nextLine();
				if(list.contains(x)) {
					System.out.println("What would you like to change the quantity to?");
					int y = kb.nextInt();
					kb.nextLine();
					list.changeQuantity(x, y);
				}
				else {
					System.out.println("This item is not on your list.");
				}
			}
			
			else if(response == 4) {
				System.out.println("Which item would you like to replace?");
				String x = kb.nextLine();
				if(list.contains(x)) {
					System.out.println("What would you like to replace it with?");
					String a = kb.nextLine();
					System.out.println("How many?");
					int y = kb.nextInt();
					kb.nextLine();
					list.replace(x, a, y);
				}
				else {
					System.out.println("This item is not on your list.");
				}
			}
			
			else if(response == 5) {
				System.out.println(list.toString());
			}
			
			else if(response == 6) {
				play = "no";
			}
		}
		System.out.println("Thank you for shopping!");
	}
}
