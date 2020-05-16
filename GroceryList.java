import java.util.ArrayList;

public class GroceryList {

	private ArrayList<String> list;
	private ArrayList<Integer> quantity;
	
	public GroceryList() {
		list = new ArrayList<String>();
		quantity = new ArrayList<Integer>();
	}
	
	public void add(String x, int y) {
		list.add(x);
		quantity.add(y);
	}
	
	public boolean contains(String x) {
		if(list.size() > 0 && list.contains(x)) {
			return true;
		}
		return false;
	}
	
	public boolean contains(int x) {
		if(contains(x)) {
			return true;
		}
		return false;
	}
	
	public void remove(String x) {
		int spot = list.indexOf(x);
		list.remove(x);
		quantity.remove(x);
	}
	
	public void changeQuantity(String x, int y) {
		int spot = list.indexOf(x);
		quantity.set(spot, y);
	}
	
	public void replace(String x, String a, int y) {
		int spot = list.indexOf(x);
		list.set(spot, a);
		quantity.set(spot, y);
	}
	
	public String toString() {
		String result = "";
		for(int i = 0; i < list.size(); i++) {
			result+= "Item: " + list.get(i) + " Quantity: " + quantity.get(i) + "\n";
		}
		return result;
	}
	
	
	
}
