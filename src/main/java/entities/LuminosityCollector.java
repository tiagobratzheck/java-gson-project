package entities;

public class LuminosityCollector {

	private String sensor;
	private Double luminosity;
	private String date;

	public LuminosityCollector() {

	}

	public LuminosityCollector(String sensor, Double luminosity, String date) {
		this.sensor = sensor;
		this.luminosity = luminosity;
		this.date = date;
	}

	public String getSensor() {
		return sensor;
	}

	public void setSensor(String sensor) {
		this.sensor = sensor;
	}

	public Double getLuminosity() {
		return luminosity;
	}

	public void setLuminosity(Double luminosity) {
		this.luminosity = luminosity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "LuminosityCollector [ sensor = " + sensor + ", luminosity = " + luminosity + ", date = " + date + " ]";
	} 

}
