package dataManager;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import entities.Crop;
import entities.LuminosityCollector;
import entities.TemperatureCollector;

public class Middleware {

	public static void serialize() {
		Crop crop = instantiateClass();
		Gson json = new GsonBuilder().setPrettyPrinting().create();

		// Java objects to File
		try (FileWriter writer = new FileWriter("c:\\greenhouse\\cropData\\data.json")) {
			json.toJson(crop, writer);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String file = json.toJson(crop);
		System.out.println(file);

	}

	public static void deserialize() {
		Gson json = new Gson();
		Reader reader;

		// Json file to Java object
		try {
			reader = Files.newBufferedReader(Paths.get("c:\\greenhouse\\cropData\\dataToRead.json"));
			Crop cropdata = json.fromJson(reader, Crop.class);
			printingData(cropdata);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	private static Crop instantiateClass() {
		Crop crop = new Crop();
		LuminosityCollector lc = new LuminosityCollector();
		TemperatureCollector tc = new TemperatureCollector();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now = new Date();
		String date = sdf.format(now);

		crop.setDescription("Tomatoe");
		crop.setVariety("Veeroma");
		crop.setGreenHouse("AB-32");
		crop.setGrowthStage("germination");

		lc.setDate(date);
		lc.setLuminosity(23.5);
		lc.setSensor("LS-2");
		crop.addLuminosityCollector(lc);

		tc.setDate(date);
		tc.setSensor("TS-4");
		tc.setTemperature(25.7);
		crop.addTemperatureCollector(tc);

		return crop;
	}

	private static void printingData(Crop cropdata) {
		System.out.println("Description: " + cropdata.getDescription() + ",\n" 
						 + "Greenhouse number: " + cropdata.getGreenHouse() + ",\n" 
				         + "Growth stage: " + cropdata.getGrowthStage() + ",\n" 
	                     + "Variety: "	+ cropdata.getVariety() + ",\n"
	                     );

		for (LuminosityCollector lc : cropdata.getLuminosityCollectors()) {
			System.out.println("Date: " + lc.getDate() + ", \n" 
		                     + "Luminosity: " + lc.getLuminosity() + ", \n"
					         + "luminosity sensor number: " + lc.getSensor() 
					         );
		}
		for (TemperatureCollector tc : cropdata.getTemperatureCollectors()) {
			System.out.println("Temperature: " + tc.getTemperature() + ", \n" 
		                     + "temperature sensor number: " + tc.getSensor() 
		                     );
		}

	}

}
