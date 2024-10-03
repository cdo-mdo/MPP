package lab03.assignment_3_3;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private LandlordInfo owner;
	private List<Apartment> apartments;
	private double maintenanceCode;
	private double profit;
	
	Building(LandlordInfo owner, double maintCost) {
		this.maintenanceCode = maintCost;
		this.owner = owner;
		apartments = new ArrayList<>();
	}
	
	Building(double maintCost) {
		this.maintenanceCode = maintCost;
		apartments = new ArrayList<>();
	}
	
	public void addApartment(Apartment appartment) {
		apartments.add(appartment);
	}
	
	public double calculateProfit() {
		double totalRevenue = 0;
		for (Apartment apartment: apartments) {
			totalRevenue += apartment.getRent();
		}
		profit = totalRevenue - maintenanceCode;
		return profit;
	}
}
