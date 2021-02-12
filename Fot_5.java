package FootBall_Leauge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fot_5 {
	public static void main(String args[]) {
		readAndWrite();
		
	}
	
	
	public static void readAndWrite() {
		List<FootBall2021> table = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader("TeamsRank.csv"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(",");
		        table.add(new FootBall2021(Integer.parseInt(values[0]),values[1],Integer.parseInt(values[2]),Integer.parseInt(values[3]),Integer.parseInt(values[4]),Integer.parseInt(values[5]),Double.parseDouble(values[6])));
		    }
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("\nSorted by ");
	    table.stream().sorted().forEach(System.out::println);

	    System.out.println();
	    System.out.println("Sorted by ");
	    table.stream()
	         .sorted((c1, c2) -> 
	            ((Double) c1.getNrr()).compareTo(c2.getNrr()))
	         .forEach(System.out::println);

	    try {
		      FileWriter writer = new FileWriter("Fot_L5.txt");
		      writer.write("Sorted \n");
		      table.stream().sorted()
		        .forEach(str -> {
		        	try {
						writer.write(str.toString() + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
		        });
		      
		      writer.write("\nSorted \n");
		      table.stream().sorted((c1, c2) -> 
	            ((Double) c1.getNrr()).compareTo(c2.getNrr()))
		        .forEach(str -> {
		        	try {
						writer.write(str.toString() + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
		        });
		      writer.close();
		      System.out.println("Created#NipunLakshitha : Fot_L5.txt and updated it.");
		    } catch (IOException e) {
		      System.out.println("Exception.");
		      e.printStackTrace();
		    }
	}

}
