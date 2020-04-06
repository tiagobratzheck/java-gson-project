package entities;

import java.util.Date;

public class TemperatureCollector {

	private String sensor;
	private Double temperature;
	private String date;

	public TemperatureCollector() {

	}

	public TemperatureCollector(String sensor, Double temperature, String date) {
		this.sensor = sensor;
		this.temperature = temperature;
		this.date = date;
	}

	public String getSensor() {
		return sensor;
	}

	public void setSensor(String sensor) {
		this.sensor = sensor;
	}

	public Double getTemperature() {
		return temperature;
	}

	public void setTemperature(Double temperature) {
		this.temperature = temperature;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "TemperatureCollector [ sensor = " + sensor + ", temperature = " + temperature + ", date = " + date + " ]";
	}

}
