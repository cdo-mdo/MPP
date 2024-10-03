package lab03.assignment_3_3;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
	private List<Building> buildings;
	
	public LandlordInfo() {
		buildings = new ArrayList<>();
	}
	
	public void addBuilding(Building building) {
		buildings.add(building);
	}
	
	public double calcProfits() {
		double totalProfit = 0;
		for (Building building: buildings) {
			totalProfit += building.calculateProfit();
		}
		return totalProfit;
	}
}
