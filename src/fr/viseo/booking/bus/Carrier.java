package fr.viseo.booking.bus;

import java.util.List;

import fr.viseo.booking.OperatorTour;

public class Carrier extends OperatorTour{

	private List<BusTravel> paths;

	public List<BusTravel> getPaths() {
		return paths;
	}

	public void setPaths(List<BusTravel> paths) {
		this.paths = paths;
	}

	
}
