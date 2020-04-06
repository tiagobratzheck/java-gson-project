package entities;

import java.util.ArrayList;
import java.util.List;

public class Crop {

	private String description;
	private String variety;
	private String greenHouse;
	private String growthStage;
	private List<TemperatureCollector> temperatureCollector = new ArrayList<>();
	private List<LuminosityCollector> luminosityCollector = new ArrayList<>();;

	public Crop() {

	}

	public Crop(String description, String variety, String greenHouse, String growthStage) {
		this.description = description;
		this.variety = variety;
		this.greenHouse = greenHouse;
		this.growthStage = growthStage;

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVariety() {
		return variety;
	}

	public void setVariety(String variety) {
		this.variety = variety;
	}

	public String getGreenHouse() {
		return greenHouse;
	}

	public void setGreenHouse(String greenHouse) {
		this.greenHouse = greenHouse;
	}

	public String getGrowthStage() {
		return growthStage;
	}

	public void setGrowthStage(String growthStage) {
		this.growthStage = growthStage;
	}

	public List<TemperatureCollector> getTemperatureCollectors() {
		return temperatureCollector;
	}
		
	public void addTemperatureCollector(TemperatureCollector tc) {
		temperatureCollector.add(tc);
	};	
	
	public List<LuminosityCollector> getLuminosityCollectors() {
		return luminosityCollector;
	}
		
	public void addLuminosityCollector(LuminosityCollector lc) {
		luminosityCollector.add(lc);
	}

	@Override
	public String toString() {
		return "Crop [ description = " + description + ", variety = " + variety + ", greenHouse = " + greenHouse
				+ ", growthStage = " + growthStage + ", temperatureCollector = " + temperatureCollector
				+ ", luminosityCollector = " + luminosityCollector + " ]";
	};	

	
}
