
public class Restaurant {
	
	String[] items = {"Beer", "Soft Drinks", "Red wine", "Scotch", "Whisky"};
	double[] price = {2.00, 0.50, 3.0, 8.0, 5.0};
	 int a = items.length;
	
	public void displayItemsWithPrice() {
		
		for(int i=0, j=0; i < a ; i++, j++) {
			System.out.println(items[i]+": $"+price[j]);
			
		}
		
	}
	

	public static void main(String[] args) {

		Restaurant rst = new Restaurant();
		rst.displayItemsWithPrice();
	}

}
