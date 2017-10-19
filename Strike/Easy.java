import java.util.ArrayList;
import java.util.Random;


public class Easy {
	
	
	private ArrayList<String> words1 = new ArrayList<String>();
	
	private String swape;
	private String profile;
	
	public void set_profile1(String user){

		profile =user;
		
		words1.add("arrogate");
		words1.add("admonish");
		words1.add("adverse");
		words1.add("arbitrary");
		words1.add("bombastic");
		words1.add("calumny");
		words1.add("cavort");
		words1.add("complement");
		words1.add("derivative");
		words1.add("discomfit");
		words1.add("disparate");
		words1.add("emulate");
		words1.add("execrable");
		words1.add("fractious");
		words1.add("flagrant");
		words1.add("insidious");
		words1.add("maverick");
		words1.add("munificent");
		words1.add("noxious");
		words1.add("paradigm");
		words1.add("platitude");
		words1.add("requisition");
		words1.add("reprobate");
		words1.add("sobriety");
		words1.add("tangential");
		words1.add("vitriolic");
		
	}
	
	public String get_profile1(){
		return profile;
	}
	
		
	public String get_words1(){
		
		Random ran = new Random();
		int counter = ran.nextInt(25) + 0;
		
		for(int i = 0; i<1; i++){
		swape = words1.get(counter);
		}
		
		return swape;
		
	}
	
	
	
	
	
	
	
	
	

}
