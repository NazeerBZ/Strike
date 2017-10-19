						


import java.util.ArrayList;
import java.util.Scanner;


public class Rule {
public static void main(String args[]){
	
	String rules = "Instructions\n" ;
	String strike = "<<<<<STRIKE>>>>>";
	String y_n = "Want to Play (y/n)";
	int mode;
	String User;
	String type_user;
	String h_type_user;
	String match,match2;
	char type_pc;
	char h_type_pc;
	String backto;
	
	
	System.out.printf("%40s\n\n",strike);
	
	System.out.printf("\n%40s",rules);
	
	System.out.println("\n    In this game you are competing to a computer, you and comupter will get a \n    random word you have to type that word faster then comupter and after "
			+ "\n    typing you will see your score in Seconds. you can also see your \n    Score Board and you can change your game mode after when you \n"
			+ "    done with playing in any mode.");
	System.out.println("(1) After GO! start typing");
	System.out.println("(2) if you type wrong word then it will count as lose\n");
	System.out.printf("%42s",y_n);
	
	Scanner input = new Scanner (System.in);
	String check  = input.next();
	char  yes = check.charAt(0);
	
	//game starts....
	
	if(yes == 'y'){
	System.out.println("\nEnter Your name");
	User=input.next();
	
	
	//objects of classes
		Easy obj2 = new Easy();
		Hard obj3 = new Hard();
		ScoreBoard obj4 = new ScoreBoard();
	
	
	do{
	
	System.out.println("\nSelect Mode: \n (1) EASY \n (2) HARD");
	
	//input which mode
	mode=input.nextInt();

	
	//Easy Mode Area....
	if(mode == 1){
		
		String play;
		
	 do{
		 
		
		obj2.set_profile1(User);
		System.out.println("\t\t\t"+obj2.get_profile1()+" VS "+"Computer\n");
		
		
		//.....1 2 3 GO!
		 for(int c=1; c<=3; c++){
		 try{
			 Thread.sleep(1000);
			 System.out.print(c+" ");
			 
		 }
		 catch(InterruptedException e){
			 e.printStackTrace();
		 }
		 }
		 
		 try{
			 Thread.sleep(1000);
			 System.out.print(" GO!");
		 }
		 catch(InterruptedException e){
			 e.printStackTrace();
		 }
		 
		  match  =  obj2.get_words1();
		 System.out.printf("%25s\n\n",match);
		 
		 	 
		//user start typing...
		 
		 double starttime1 = 0;
		 double endtime1 = 0;
		 double total1 = 0;
		 
		 System.out.print("You: ");
		 
		 starttime1 = System.currentTimeMillis(); 
		 type_user = input.next();
		 
		 endtime1 = System.currentTimeMillis() - starttime1;
		 total1=  endtime1/1000; 
			
		 
		 
			
		//pc start typing...
			double total2 = 0;
			double endtime2 = 0;
			double starttime2 = 0;
			
		 System.out.print("Bot: ");
		 starttime2 = System.currentTimeMillis();
		 
		for(int m=0; m<match.length(); m++) {
		try {
									
			Thread.sleep(500);
			type_pc = match.charAt(m);
			
			System.out.print(type_pc);
			
			endtime2 = System.currentTimeMillis() - starttime2;
			total2 =  endtime2/1000; 
			
		} catch (InterruptedException e) {
			e.printStackTrace();
			
		}	
		
		}
		
		//telling score of a round.....
		
		
		String[] say = {"your","Score","is"};
		String blank=" ";
		System.out.printf("\n%21s",blank);
		
		for(int t=0; t<say.length; t++){
			
			
			try{
				
				Thread.sleep(1000);
				System.out.printf(say[t]+" ");
				
			} catch(InterruptedException e){
				
				e.printStackTrace();
			}	
		}
		
		
		System.out.printf(": %ssec",total1);
		
		
		String[] say2 = {" Bot","Score","is"};
		String blank2=" ";
		System.out.printf("\n%21s",blank2);
		
		for(int t=0; t<say2.length; t++){
			
			
			try{
				
				Thread.sleep(1000);
				System.out.printf(say2[t]+" ");
				
			} catch(InterruptedException e){
				
				e.printStackTrace();
			}	
		}
		
		System.out.printf(": %ssec",total2);
		
		
		
		
		
		

	//sending score.....		
		
		 	obj4.set_us_scr(total1);
		 	obj4.set_bt_scr(total2);
		 	
	//Win or Lose......
		 	
		if(!type_user.equals(match)){
			System.out.println("\n\n\t\t      Wrong Spelling You Lose !!");
		
		}
		else
			if(type_user.equals(match)){
				
		if(total1<total2){
			System.out.println("\n\n\t\t\t   You Win !!");
		}
		else
			 if(total1>total2){
				 System.out.println("\n\n\t\t\t   You Lose !!");
				
			 }
			}
		
		
		System.out.println("\nNext(n) / Exit(e)");
		
			play = input.next();
	
	
	 }while(play.equals("n"));	
	
	 //Score Board
	 
	 String board;
	 
	 System.out.println("Checkout The Score Board (y/n)");
	 
	 board = input.next();

	 ArrayList<Double> copy1 = new ArrayList<Double>();
	 ArrayList<Double> copy2 = new ArrayList<Double>();
	 
	 copy1 = obj4.get_us_scr();
	 copy2 = obj4.get_bs_scr();
	 
	if(board.equals("y")){
	
		
		System.out.println("\t\t\tScore Board");
		System.out.println("\t\t User\t\t     Bot");
		
		for(int i=0; i<copy1.size(); i++){
			
			System.out.printf("%22s",copy1.get(i));
			System.out.printf("%20s \n",copy2.get(i));
		}
		 
		
		
	 }
	 	
	}
	
	
	//Hard Mode Area....
	
	
		if(mode == 2){
			
			String h_play;
			
			do{
		
		obj3.set_profile2(User);
		System.out.println("\t\t\t"+obj3.get_profile2()+" VS "+"Computer\n");
		
		
			//.....1 2 3 GO!
		for(int c=1; c<=3; c++){
			 try{
				 Thread.sleep(1000);
				 System.out.print(c+" ");
				 
			 }
			 catch(InterruptedException e){
				 e.printStackTrace();
			 }
		}
		
		try{
			 Thread.sleep(1000);
			 System.out.print(" GO!");
		 }
		 catch(InterruptedException e){
			 e.printStackTrace();
		 }
		
		
		match2  =  obj3.get_words2();
		 System.out.printf("%25s\n\n",match2);
		
		//user start typing...
		 
		 double h_starttime1 = 0;
		 double h_endtime1 = 0;
		 double h_total1 = 0;
		 
		 System.out.print("You: ");
		 
		 h_starttime1 = System.currentTimeMillis(); 
		 h_type_user = input.next();
		 
		 h_endtime1 = System.currentTimeMillis() - h_starttime1;
		 h_total1=  h_endtime1/1000; 
		
		//pc start typing...
		
		 	double h_total2 = 0;
			double h_endtime2 = 0;
			double h_starttime2 = 0;
			
			System.out.print("Bot: ");
			h_starttime2 = System.currentTimeMillis();
			
			for(int m=0; m<match2.length(); m++) {
				try {
											
					Thread.sleep(500);
					h_type_pc = match2.charAt(m);
					
					System.out.print(h_type_pc);
					
					h_endtime2 = System.currentTimeMillis() - h_starttime2;
					h_total2 =  h_endtime2/1000; 
					
				} catch (InterruptedException e) {
					e.printStackTrace();
					
				}	
				
				}
		
			//telling score of a round.....
			
			String[] h_say = {"your","Score","is"};
			String h_blank=" ";
			System.out.printf("\n%21s",h_blank);
		
			for(int t=0; t<h_say.length; t++){
				
				try{
					
					Thread.sleep(1000);
					System.out.printf(h_say[t]+" ");
					
				} catch(InterruptedException e){
					
					e.printStackTrace();
				}	
			}
		
			System.out.printf(": %ssec",h_total1);
			
		
			String[] h_say2 = {" Bot","Score","is"};
			String h_blank2=" ";
			System.out.printf("\n%21s",h_blank2);
			
			for(int t=0; t<h_say2.length; t++){
				
				
				try{
					
					Thread.sleep(1000);
					System.out.printf(h_say2[t]+" ");
					
				} catch(InterruptedException e){
					
					e.printStackTrace();
				}	
			}
			System.out.printf(": %ssec",h_total2);
			
		//sending score.....	
			
			obj4.h_set_us_scr(h_total1);
		 	obj4.h_set_bt_scr(h_total2);
		 
		//Win or Lose...... 
		 	
		 	if(!h_type_user.equals(match2)){
				System.out.println("\n\n\t\t      Wrong Spelling You Lose !!");
			
			}
			else
				if(h_type_user.equals(match2)){
					
			if(h_total1<h_total2){
				System.out.println("\n\n\t\t\t   You Win !!");
			}
			else
				 if(h_total1>h_total2){
					 System.out.println("\n\n\t\t\t   You Lose !!");
					
				 }
				}
		 	
		 	
		 	System.out.println("\nNext(n) / Exit(e)");
			
			h_play = input.next();
	
		}while(h_play.equals("n"));	
			
		//Score Board......	
			
			String h_board;	
			
			System.out.println("Checkout The Score Board (y/n)");
			
			h_board = input.next();
			
			ArrayList<Double> h_copy1 = new ArrayList<Double>();
			ArrayList<Double> h_copy2 = new ArrayList<Double>();
			
			h_copy1 = obj4.h_get_us_scr();
			h_copy2 = obj4.h_get_bs_scr();
			
			
			if(h_board.equals("y")){
				
			System.out.println("\t\t\tScore Board");
			System.out.println("\t\t User\t\t     Bot");
			
			for(int i=0; i<h_copy1.size(); i++){
				
				System.out.printf("%22s",h_copy1.get(i));
				System.out.printf("%20s \n",h_copy2.get(i));
			}

			}
			
		}
		
		
		System.out.println("\nMode(m) or Quit(q)");
	    backto = input.next();
		
		}while(backto.equals("m"));
	
	
	}	
	
}
}
