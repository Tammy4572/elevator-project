/*FILE:
 *PROG:
 *PURP: 
 */
package edu.tridenttech.cpt187.castro.program3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ElevatorClass myElevator = new ElevatorClass(18, 1, 99, 1);
		
		System.out.println("Number of people on board: "+ myElevator.numOnBoard);
		myElevator.loadElevator(15);
		System.out.println("Number of people on board is " + myElevator.getNumOnBoard());
		myElevator.moveElevator(5);
		
		myElevator.unloadElevator(25);

		myElevator.loadElevator(30);	//Greater than max Capacity
		myElevator.moveElevator(150);	//Invalid floor choice
		myElevator.moveElevator(2);
		System.out.println("Number of people on board is " + myElevator.getNumOnBoard());
		myElevator.unloadElevator(15);
		
		myElevator.loadElevator(5);
		myElevator.moveElevator(12);
		System.out.println("Number of people on board is " + myElevator.getNumOnBoard());
		myElevator.unloadElevator(5);
		
		myElevator.loadElevator(8);
		myElevator.moveElevator(22);
		System.out.println("Number of people on board is " + myElevator.getNumOnBoard());
		myElevator.unloadElevator(15);
		
		myElevator.loadElevator(55);
		myElevator.moveElevator(1);
		System.out.println("Number of people on board is " + myElevator.getNumOnBoard());
		myElevator.unloadElevator(5);
		
		myElevator.loadElevator(5);
		myElevator.moveElevator(42);
		System.out.println("Number of people on board is " + myElevator.getNumOnBoard());
		myElevator.unloadElevator(55);
		
	}
}//END MainClass