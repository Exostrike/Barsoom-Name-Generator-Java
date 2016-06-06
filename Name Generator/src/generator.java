import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class generator {
	  public static void main(String[] args) throws IOException {
		  
		  List<String> prefix = Files.readAllLines(Paths.get("C:\\Users\\Oliver\\workspace\\Name Generator\\src\\barsoom prefix.txt"));
		  List<String> suffix = Files.readAllLines(Paths.get("C:\\Users\\Oliver\\workspace\\Name Generator\\src\\barsoom suffix.txt"));
		  Random randomizer = new Random();
		  List<String> list = new ArrayList<String>();
		  
	        @SuppressWarnings("resource")
			Scanner reader = new Scanner(System.in);
	        System.out.println("How many names: ");
	        int n = reader.nextInt();
	        
	        int count =0;
	        for(count =0; count <= n-1; count++)
	        {	        		   
		    String prefix2 = prefix.get(randomizer.nextInt(prefix.size()));
		    String suffix2 = suffix.get(randomizer.nextInt(suffix.size()));		    		      
	        Random ran = new Random();
	        int C = ran.nextInt(5);
	        
	        if( C == 0 ){
	        	list.add(prefix2 + " ");
	         }else if( C>0 && C<3 ){
	        	 list.add(prefix2 + suffix2+ " ");
	         }else if( C>2 && C<6 ){
	        	 list.add(prefix2 + " " + prefix2 + suffix2+ " ");
	         	}
	        }
	        
	        System.out.print(list);
	  	}
	}