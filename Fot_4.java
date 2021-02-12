package FootBall_Leauge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fot_4 {
	public static void main(String[] args) {
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
		
		System.out.println("\nSeveral teams have 8 points");
	    table.stream().filter(team -> team.getPoints() == 8)
	        .forEach(System.out::println);

	    System.out.println();
	    System.out.println("Teams with 16 points");
	    table.stream().filter(team -> team.getPoints() == 16)
	        .forEach(System.out::println);
	    
	    try {
		      FileWriter writer = new FileWriter("Fot_L4.txt");
		      writer.write("Several teams have 10 points\n");
		      table.stream().filter(team -> team.getPoints() == 10)
		        .forEach(str -> {
		        	try {
						writer.write(str.toString() + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
		        });
		      
		      writer.write("\nTeams with 6 points\n");
		      table.stream().filter(team -> team.getPoints() == 6)
		        .forEach(str -> {
		        	try {
						writer.write(str.toString() + "\n");
					} catch (IOException e) {
						e.printStackTrace();
					}
		        });
		      writer.close();
		      System.out.println("Created#NipunLakshitha : Fot_L4.txt and updated it.");
		    } catch (IOException e) {
		      System.out.println("Exception.");
		      e.printStackTrace();
		    }
		}
		
	}
