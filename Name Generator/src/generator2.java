import java.io.IOException;
import java.util.*;

public class generator2 {
	  public static void main(String[] args) throws IOException {
		  
		  String[] prefix1 = {"Am", "Banth", "Carth", "Dur", "Flor", "Gant", "Haj", "Ham", "Il", "Jad", "Kand", "Kant", "Lan", "Mat", "Nast", "Or", "Pand", "Parth", "Roj", "Sark", "Sol", "Sor", "Tal", "Tar", "Tark", "Tav", "Thor", "Thur", "Thuv", "Ul", "Um", "Val", "Vor", "Xax", "Yerst", "Zand"};
		  String[] suffix1 = {"a", "ab", "ad", "ah", "ai", "aj", "ak", "al", "am", "an", "ang", "ar", "ark", "as", "at", "ed", "ek", "el", "i", "ia", "ion", "is", "o", "ok", "olian", "on", "or", "oris", "os", "u", "ul", "um", "un", "ur", "uren", "us"};
		  List<String> prefix = Arrays.asList(prefix1);
		  List<String> suffix = Arrays.asList(suffix1);
		  Random randomizer = new Random();
		  List<String> list = new ArrayList<String>();
		  
	        @SuppressWarnings("resource")
			Scanner reader = new Scanner(System.in);
	        System.out.println("How many names: ");
	        int n = reader.nextInt();
	        
	        int count =0;
	        for(count =0; count <= n; count++)
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