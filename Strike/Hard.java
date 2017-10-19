import java.util.ArrayList;
import java.util.Random;

public class Hard {

private ArrayList<String> words2  = new ArrayList<String>();	

private String swape;
private String profile;


	public void set_profile2(String user){
		
		profile = user;
		
		words2.add("abnegation");
		words2.add("adumbrate");
		words2.add("aggrandize");
		words2.add("anachronistic");
		words2.add("antediluvian");
		words2.add("apocryphal");
		words2.add("blandishment");
		words2.add("camaraderie");
		words2.add("circumlocution");
		words2.add("circumscribe");
		words2.add("commensurate");
		words2.add("conflagration");
		words2.add("demagogue");
		words2.add("diaphanous");
		words2.add("egregious");
		words2.add("embezzlement");
		words2.add("evanescent");
		words2.add("forbearance");
		words2.add("grandiloquent");
		words2.add("gratuitous");
		words2.add("heterogenous");
		words2.add("idiosyncratic");
		words2.add("impecunious");
		words2.add("incontrovertible");
		words2.add("legerdemain");
		words2.add("mendacious");
		words2.add("obstreperous");
		
	}
	
	public String get_profile2(){
		return profile;
	}
	
	
public String get_words2(){
		
		Random ran = new Random();
		int counter = ran.nextInt(26) + 0;
	
		for(int i = 0; i<1; i++){
		swape = words2.get(counter);
		}
		return swape;
		
	}
	

	
	
}
