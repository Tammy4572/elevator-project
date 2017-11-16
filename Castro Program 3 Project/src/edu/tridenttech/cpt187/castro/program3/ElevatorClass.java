package edu.tridenttech.cpt187.castro.program3;

public class ElevatorClass {
	int numOnBoard;
	int maxCapacity;
	int currentFloor;
	int destFloor;
	int maxFloor;
	int minFloor;
	int passNumber;
	int loading;
	int unloading;
	int requestedFloor;
	
	/**
	* Constructor
	*/
	public ElevatorClass(int maxRiders,int curntFloor, int highestFloor, int lowestFloor)
	{
		maxCapacity = maxRiders;
		minFloor = lowestFloor;
		maxFloor = highestFloor;
		currentFloor = curntFloor;
		numOnBoard = 0;
		destFloor = currentFloor;
	}//END Elevator constructor
	
	public int getNumOnBoard()
	{
		return numOnBoard;
	}//END getNumOnBoard

	public int getMaxCapacity()
	{
		return maxCapacity;
	}//END getMaxCapacity
	
	public int getCurrentFloor()
	{
		return currentFloor;
	}//END getCurrentFloor
	
	public int getDestFloor()
	{
		return destFloor;
	}//END getDestFloor
	
	public int getMaxFloor()
	{
		return maxFloor;
	}//END getMaxFloor
	
	public int getMinFloor()
	{	
		return minFloor;
	}//END getMinFloor
	public void loadElevator(int loading)
	{
		if(numOnBoard + loading <= maxCapacity)
		{
			numOnBoard += loading;
			System.out.println(loading + " people loading.");
		}
		else
		{
			numOnBoard = maxCapacity;
			System.out.println(numOnBoard + " people loading.");
		}
	}
	public void  unloadElevator(int numUnload)
	{
		if((numUnload >= maxCapacity)||(numUnload > numOnBoard))
		{
			numUnload = numOnBoard;
		}
			System.out.println(numUnload + " people departing elevator.");
			numOnBoard -= numUnload;
	}
	public void moveElevator(int requestedFloor)
	{
		if((requestedFloor < this.maxFloor) &&(requestedFloor != currentFloor)&&(requestedFloor != 0))
		{
			destFloor = requestedFloor;
			if(destFloor == currentFloor)
				{
					//do nothing
			}//END if
			else if(destFloor > currentFloor)
			{
				System.out.println("Going up from floor " + currentFloor);
				while(currentFloor < (destFloor -1))
				{
					currentFloor++;
					System.out.println("Passing floor " + currentFloor);
				}
				currentFloor++;
				System.out.println("Made it to floor "+ currentFloor);
			}//END else if
			else
			{
				System.out.println("Going down from floor " + currentFloor);
				while(currentFloor > (destFloor +1))
				{
					currentFloor--;
					System.out.println("Passing floor " + currentFloor);
				}
				currentFloor--;
				System.out.println("Made it to floor " + currentFloor);
			}
		}//END if
		else
		{
			System.out.println("Invalid floor choice.");
		}
	}//END moveElevator
}
