package Entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	double barbecuePrice = 7.00;
	double beerPrice = 5.00;
	double softDrinkPrice = 3.00;
	
	public double cover() {
		if (this.feeding() > 30.00) {
			return 0.00;
		}
		else return 4.00;
	}
	
	public double feeding() {
		return ((this.beer * beerPrice)+ (this.barbecue * barbecuePrice) + (this.softDrink * softDrinkPrice) );
		}
	
	public double ticket() {
		if (this.gender == 'M') {
			return 10.0;
		}
		else {
			return 8.00;
		}
	
	}
	
	public double total() {
		double total = feeding() + cover() + ticket();
		return total;
		
	}
	
}
