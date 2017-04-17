package jets;

import java.util.Scanner;

public class JetDriver {
	public static void main(String[] args) {
		JetDriver.testObject();
	}
	
	static void testObject() {
		
		Scanner kb = new Scanner(System.in);

		System.out.println("==PLEASE SELECTION A MENU OPTION==");
		System.out.println("==================================");
		System.out.println("1) LIST FLEET ");
		System.out.println("2) VIEW FASTEST JET ");
		System.out.println("3) VIEW JET WITH THE LONGEST RANGE");
		System.out.println("4) ADD A JET TO FLEET ");
		System.out.println("5) QUIT THE PROGRAM ");
		System.out.println("==================================");
		System.out.println("==========INPUT A NUMBER==========");
		int menuSelection = kb.nextInt();
		
		//switch that calls a method for each one;
	

	    switch (menuSelection) {
	    		case 1:
	    			if (menuSelection == 1) {
	    				System.out.println("1 CALLED");
	    			}
	    			break;
	    		case 2:
	    			if (menuSelection == 2) {
	    		  //call VIEW FASTEST JET
	    				System.out.println("2 CALLED");
	    			}
	    			break;
	    	case 3:
	    			if (menuSelection == 3) {
	    		  //call view jet with longest range
	    				System.out.println("3 CALLED");
	    			}
	    			break;
	    	case 4:
	    			if (menuSelection == 4) {
	    				System.out.println("4 CALLED");
	    				//call ad a jet to fleet
	    			}
	    			break;
	    	case 5:
	    			if (menuSelection == 5) {
	    				//call quit the program
	    				System.out.println("5 CALLED");
	    			}
	    			break;
	    	case 6:
	    			if (menuSelection != 1 || menuSelection != 2 || menuSelection != 3 || menuSelection != 4 || menuSelection != 5  ) {
						System.out.println("That is not a valid menu entry");
						System.out.println("Please enter a number 1 through 5 ");
						JetDriver.testObject();
					break;
	    			}
	    	}  			
	}
		
		
//		int menu[][][] =  //declaration and instantiation
//		{	{ {1, 2, 3}, {4, 5, 6}, {7, 8, 9} },
//			{ {10, 11, 12}, {13, 14, 15}, {16, 17, 18} },
//			{ {19, 20, 21}, {22, 23, 24}, {25, 26, 27} } };
//			
//		MachCalc something = new MachCalc();
		
	
		

		
//		int jetNumbers[]= new int[args.length]; //declaration and instantiation
//		
			
//			System.out.println(jetNumbers[0]);
			
//			could just use a very long array and control for null
//			use one for strings and then one for ints
//			i need to clare it first
			
//		for ( int i = 0 ; i < hangar.length; i++){
//			hangar[i] = new Jet("argument")
//		}
		
//		int addToArray = Integer.parseInt(args[i]);
//		hangar[i] = addToArray;
////			just add an if null modifier and store a bunch of nulls
		
//			System.out.println(jetNumbers[0]);
//			System.out.println(jetNumbers[1]);
//			System.out.println(jetNumbers[2]);
//			System.out.println(jetNumbers[3]);
//			System.out.println(jetNumbers[4]);
//			System.out.println(jetNumbers[5]);
		
//			to array length then add with array assignment plus array length t
//			interaate to array.length then
//			add new array vairable to the 
//			array.length +1 (or ++)
//			(might have to save arraylength+1 as a var)
//			
			
			//initialization
//			menu[1] = 20;
//			menu[2] = 30;
//			menu[3] = 40;
//			menu[4] = 50;
	
		
//		to add one it interates array length + 1
		
		
//		for ( i = 0; jets.equals(obj)
			
		
	
}

