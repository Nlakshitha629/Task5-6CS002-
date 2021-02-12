package FootBall_Leauge;
//using foreach() method to print the table
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Fot_1 {
	public static void main(String args[]) {
		readAndWrite();
	}
	
	
	public static void readAndWrite() {
		
		// file reading
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
		
		table.forEach(x -> System.out.println(x));
		
		// file writing
		try {
		      FileWriter writer = new FileWriter("Fot_L1.txt");
		      table.forEach(x -> {
				try {
					writer.write(x + "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
		      writer.close();
		      System.out.println("Created#NipunLakshitha : Fot_L1.txt and updated it.");
		    } catch (IOException e) {
		      System.out.println("Exception.");
		      e.printStackTrace();
		    }
		
		
	}

}
