import java.util.Scanner;
public class FootballMain {

	public static void main(String[] args) {
		// Call our methods
		QBrating();
		System.out.println();
		CwentzRating();
		

	}
	
	public static void QBrating(){ 
		
		// QB rating takes in 5 numerical stats from console then calculates the QB's score
		//returns nothing
		System.out.println("Welcome to the QB calculator");
		System.out.println("Please enter the number of Touchdowns"); //ask user for input
		Scanner q1 =new Scanner(System.in); //create scanner
		double TD = q1.nextDouble(); //convert to double from scanner type
	
		
		System.out.println("Please enter total passing Yards");//ask user for input
		Scanner q2 =new Scanner(System.in);//create scanner
		double YD = q2.nextDouble();//convert to double from scanner type
		
		
		System.out.println("Please enter number of interceptions");//ask user for input
		Scanner q3 = new Scanner(System.in);//create scanner
		double INT = q3.nextDouble();//convert to double from scanner type
	
		
		System.out.println("Please enter the number of completions");//ask user for input
		Scanner q4 = new Scanner(System.in);//create scanner
		double COMP = q4.nextDouble();//convert to double from scanner type
		
		
		System.out.println("Please enter the number of passes attempted");//ask user for input
		Scanner q5 = new Scanner(System.in);//create scanner
		double PA = q5.nextDouble();//convert to double from scanner type
		
		//using the calculation from wikipedia we assign each variable its value
		double a = ((COMP/PA)-.3)*5; 
		if (a>2.375){ //check if the value is >2.375 
			a=2.375;	//if so, set it to 2.375
		}
		else if (a<0){ 
			a=0; //if the value is negative set it to 0
		}
		
		double b =((YD/PA)-3)*.25;
		if (b>2.375){//check if the value is >2.375 
			b=2.375;	//if so, set it to 2.375
		}
		else if (b<0){
			b=0; //if the value is negative set it to 0
		}
		
		double c =(TD/PA)*20;
		if (c>2.375){//check if the value is >2.375 
			c=2.375;	//if so, set it to 2.375
		}
		else if (c<0){
			c=0; //if the value is negative set it to 0
		}
		
		double d= 2.375 -((INT/PA)*25);
		if (d>2.375){//check if the value is >2.375 
			d=2.375;	//if so, set it to 2.375
		}
		else if (d<0){
			d=0; //if the value is negative set it to 0
		}
		
		//calculate the score
		double score = ((a+b+c+d)/6)*100;
		
		//Close our scanners
		q1.close();
		q2.close();
		q3.close();
		q4.close();
		q5.close();
		//print out the results 
		System.out.printf("The QB score is: %.2f",score);
	}
	public static void CwentzRating(){ // this is the calculation from above but with Carson Wentz's stats added instead of input
		//assigned his stats to the proper variables
		double TD = 16;
		double YD = 3782;
		double PA= 607;
		double COMP= 379;
		double INT= 14;
		//copy paste code from above
		double a = ((COMP/PA)-.3)*5;
		if (a>2.375){
			a=2.375;	
		}
		else if (a<0){
			a=0;
		}
		
		double b =((YD/PA)-3)*.25;
		if (b>2.375){
			b=2.375;	
		}
		else if (b<0){
			b=0;
		}
		
		double c =(TD/PA)*20;
		if (c>2.375){
			c=2.375;	
		}
		else if (c<0){
			c=0;
		}
		
		double d= 2.375 -((INT/PA)*25);
		if (d>2.375){
			d=2.375;	
		}
		else if (d<0){
			d=0;
		}
		
		double score = ((a+b+c+d)/6)*100;
		
		System.out.printf("The Carlson Wentz's QB score is: %.2f",score);
	
	}

}
