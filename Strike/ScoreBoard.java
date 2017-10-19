import java.util.ArrayList;



public class ScoreBoard {
	
	private ArrayList<Double> u_s = new ArrayList<Double>();
	private ArrayList<Double> b_s = new ArrayList<Double>();
	private ArrayList<Double> h_u_s = new ArrayList<Double>();
	private ArrayList<Double> h_b_s = new ArrayList<Double>();
	private double score1;
	private double score2;
	private double h_score1;
	private double h_score2;
	private ArrayList<Double> duplicate1 = new ArrayList<Double>();
	private ArrayList<Double> duplicate2 = new ArrayList<Double>();
	private ArrayList<Double> h_duplicate1 = new ArrayList<Double>();
	private ArrayList<Double> h_duplicate2 = new ArrayList<Double>();
	
		
	///USER_e....
	
	public void set_us_scr(double aside){
		
		score1 = aside;
		
		u_s.add(score1);
		
	}
	
	public ArrayList<Double> get_us_scr(){
		
		   duplicate1 = u_s;
	
	return duplicate1;
}


	//BOT_e.....
	
	public void set_bt_scr(double bside){
		
		score2 = bside;
		
		b_s.add(score2);
		
	}
	
	
	public ArrayList<Double> get_bs_scr(){
		
		   duplicate2 = b_s;
	
	return duplicate2;
}	
	
	
	///USER_h....
	
		public void h_set_us_scr(double aside){
			
			h_score1 = aside;
			
			h_u_s.add(h_score1);
			
		}
		
	public ArrayList<Double> h_get_us_scr(){
			
			   h_duplicate1 = h_u_s;
		
		return h_duplicate1;
	}
	
	//BOT_h.....
	
		public void h_set_bt_scr(double bside){
			
			h_score2 = bside;
			
			h_b_s.add(h_score2);
			
		}
	
	public ArrayList<Double> h_get_bs_scr(){
			
			   h_duplicate2 = h_b_s;
		
		return h_duplicate2;
	}	
		
	
	
}
