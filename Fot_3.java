package FootBall_Leauge;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Fot_3 {

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
		
		

		OptionalInt min = table.stream().mapToInt(FootBall2021::getPoints).min();
	    if (min.isPresent()) {
	      System.out.printf("\nLowest number of points is %d\n", min.getAsInt());
	    } else {
	      System.out.println("min failed");
	    }
	    	
		    
    	try {
		      FileWriter writer = new FileWriter("Fot_1.txt");
		      writer.write("Lowest number of points is " + min.getAsInt() + "\n");
		      writer.close();
		      System.out.println("Created#NipunLakshitha : crik3.txt and updated it.");
		    } catch (IOException e) {
		      System.out.println("Exception.");
		      e.printStackTrace();
		    }
	}
	
}
