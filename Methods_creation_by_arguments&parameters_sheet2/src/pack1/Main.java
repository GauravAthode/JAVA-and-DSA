package pack1;

public class Main 
{
	
	public int calculateTotalCricketBalls(int a ,int b) 
	{	
	    System.out.println("Q7");
		return a*b;
	}
    public int calculateCupcakesPerBox(int totalCup, int b) 
    {	
	    System.out.println("Q8");
	    return totalCup/b;
    }
    public  int calculateTotalWorkers (int totalPostOffices,int workers)
    {
	    System.out.println("Q9");
	    return totalPostOffices*workers;
	   
    }
    public int  calculateTotalPizzaSlices (int familyMembers,int  eachMemberEats) 
    {
	    System.out.println("Q10");
	    return familyMembers*eachMemberEats;
    }
	public int calculateRequiredAeroplanes (int passengersPerAeroplane, int totalPassengers) 
	{
		System.out.println("Q11");
		return   totalPassengers / passengersPerAeroplane;
	}
	public int calculateNumberOfForests(int  treesInOneForest, int  totalNumberOfTrees ) 
    {
		
		System.out.println("Q12");
		return totalNumberOfTrees /treesInOneForest;
	}
	public int calculateTotalNotebooks (int numberOfStudents,int notebooksEachStudent) 
	{
    	System.out.println("Q13");
		return numberOfStudents * notebooksEachStudent;
	}
	public int  calculateBooksPerShelf (int totalBooks,int numberShelves  ) 
	{
		System.out.println("Q14");
		return totalBooks / numberShelves;
	}
	public float calculateTotalMinutes(float totalHours, float  minutesPerHour)
	{
		System.out.println("Q15");
		return totalHours * minutesPerHour;
	}
	public float  calculateTotalKilometers (float  numberOfTrips, float distancePerTrip ) 
	{
		System.out.println("Q16");
		return numberOfTrips * distancePerTrip;
	}
	public float  calculateTotalCost(float numberOfItems, float costPerItem) 
	{
		System.out.println("Q17");
	 	return numberOfItems * costPerItem;
	}
 	public   int calculateTotalChocolates(int numberOfBoxes ,int chocolatEseachBox) 
 	{
 		System.out.println("Q18");
		return numberOfBoxes * chocolatEseachBox;
	}
 	public static int calculateTotalScore(int numberOfGames,int scorePerGame  ) 
	{
 		System.out.println("Q19");
 		return numberOfGames * scorePerGame;
	}
	public static boolean  isNumberOdd (int number) 
	{
		System.out.println("Q20");
		return number % 2 !=0;
 	}
 	public static boolean  isNumberEven (int number1) 
	{
 		System.out.println("Q21");
 		return number1 % 2 ==0;
	}
 	public static boolean compare(int number1 ,int number2) 
	{
		System.out.println("Q22");
		return number1< number2;			
	}
	public static  boolean compare1(int number3,int number4) 
	{
		System.out.println("Q23");
		return number3 ==number4;
	}
	public static boolean compare2(int number5, int number6) 
	{
		System.out.println("Q24");
		return number5 >=number6;
	}
	public boolean compare3(int number7,int number8) 
    {
		System.out.println("Q25");
		return number7>number8;
	}
	public static int calculateDistance(int speed,int time)
	{
		System.out.println("Q26");
		return speed * time;	
	}
	public int  calculateTime(int distance, int speed1) 
	{
		System.out.println("Q27");
		return distance / speed1;	
	}
	public static int  calculateSpeed(int distance1,int time2 ) 
	{
		System.out.println("Q28");
		return distance1 / time2;
	}
	public static int calculateTravelTime(int distance3,int speed4 )
	{
		System.out.println("Q29");
		return distance3 / speed4;
		
	}
	public static int  calculateAverageSpeed(int  totalDistance,int totalTime) 
	{
		System.out.println("Q30");
		return totalDistance / totalTime;
	}
	public int calculateRelativeSpeed(int speed5,int speed6 ) 
	{
		System.out.println("Q31");
		return speed5-speed6;
		 
	}
	public static  int calculateTotalTravelTime(int distance4, int speed7,int distance5,int speed8) 
	{
		System.out.println("Q32");
		return (distance4/speed7)+(distance5/speed8);
	}
	public int calculateFuelEfficiency (int distance6,int fuel ) 
	{
		System.out.println("Q33");
		return distance6 /fuel;
	}
	public  static int   calculateAcceleration(int initialSpeed,int finalSpeed,int  time1 ) 
	{
		System.out.println("Q34");
		return (finalSpeed-initialSpeed)/time1;
	}
	public  int  calculateTripCost (int distance7,int costPerKilometer) 
	{
		System.out.println("Q35");
		return distance7 * costPerKilometer;
	}
	public static float calculateSimpleInterest(float amount , int rate, int year) 
	{
		System.out.println("Q36");
		return  (amount *rate * year)/100;
	}
	public static float calculateSimpleInterest2(float amount1 , int rate2, int year2) 
	{
		System.out.println("Q37");
		return  (amount1 *rate2 * year2)/100;
	}
	public static float calculateSimpleInterest3(float amount2 , int rate3,int year3) 
	{
		System.out.println("Q38");
		return  (amount2 *rate3 * year3)/100;
	}
	public static float calculateSimpleInterest4(float amount3 , int rate4,int year4) 
	{
		System.out.println("Q39");
		return  (amount3 *rate4 * year4)/100;
	}
	public static float calculateSimpleInterest5(float amount4 , int rate5,int year5) 
	{
		System.out.println("Q40");
		return  (amount4 *rate5 * year5)/100;
    } 
	public static void main(String[] args) 
	{
		
		Main obj = new Main();
		
		
		int totalCricketball = obj.calculateTotalCricketBalls(7,4);
		System.out.println("The total number of cricket balls:"+totalCricketball);
		
		System.out.println();
		int totalCup =27;
		int eachcupcakes = obj.calculateCupcakesPerBox(totalCup, 3);
		System.out.println("Total number of cup:"+ totalCup);
		System.out.println("The number of each box is :"+ eachcupcakes);
		  
		  
		System.out.println();
		int totalPostOffices=4;
		int workers = 10;
		int totalWorkersinPost = obj.calculateTotalWorkers(totalPostOffices, workers);
		System.out.println("The total post :"+totalPostOffices);
		System.out.println("The number of workers in each post office"+workers);
		System.out.println("The total number of workers in all post offices:"+ totalWorkersinPost);
		
		System.out.println();
		int familyMembers=5;
		int eachMemberEats=4;
		int totalPizzaSlices=obj.calculateTotalPizzaSlices(familyMembers, eachMemberEats);
		System.out.println("The total number of pizza slices needed for the family :"+totalPizzaSlices);
		
		
		int passengersPerAeroplane =60;
		int totalPassengers= 180;
		int taotalAccommodate= obj.calculateRequiredAeroplanes(passengersPerAeroplane, totalPassengers);
		System.out.println("The number of aeroplanes required to accommodate all passengers : "+taotalAccommodate);
		
		System.out.println();
		int treesInOneForest= 6;
		int totalNumberOfTrees =42;
		
		int totalForests= obj.calculateNumberOfForests(treesInOneForest, totalNumberOfTrees);
		System.out.println("The number of forests needed to have the " +totalNumberOfTrees+" of trees:"+totalForests);
		
		System.out.println();
		int numberOfStudents=18;
		int notebooksEachStudent=5;
		int totalsBooks= obj.calculateTotalNotebooks(numberOfStudents, notebooksEachStudent);
		System.out.println("The total number of notebooks:"+totalsBooks);
		
		System.out.println();
		int totalBooks = 100;
		int numberShelves = 5;
		int booksPerShelf = obj.calculateBooksPerShelf(totalBooks, numberShelves);
		System.out.println("The number of books that can be placed on each shelf equally :"+ booksPerShelf);
		
		System.out.println();
		float  totalHours= 3;
		float minutesPerHour=60;
		float totalMinutes = obj.calculateTotalMinutes(totalHours, minutesPerHour);
		System.out.println("The total number of minutes:"+totalMinutes);
		
		System.out.println();
		float numberOfTrips = 10;
		float distancePerTrip = 15;
		float totalDistances = obj.calculateTotalKilometers(numberOfTrips, distancePerTrip);
		System.out.println("The total distancen traveled :"+totalDistances);
		
		System.out.println();
		float numberOfItems=20;
		float costPerItem = 50.5f;
		float totalCost= obj.calculateTotalCost(numberOfItems, costPerItem);
		System.out.println("Te total cost of items :"+totalCost);
		
		System.out.println();
		int numberOfBoxes =4;
		int chocolatEseachBox= 30;
		int totalChocolats=obj.calculateTotalChocolates(numberOfBoxes, chocolatEseachBox);
		System.out.println("The total number of chocolates :"+totalChocolats);
		
		System.out.println();
		int numberOfGames =5;
		int scorePerGame=40;
		int totalScore= calculateTotalScore(numberOfGames, scorePerGame);
		System.out.println("The total score :"+totalScore);
		
		System.out.println();
		int number=7;
		boolean reslutn= isNumberOdd(number);
		System.out.println("is the number is :"+number+" "+"odd? " +reslutn);
		
		System.out.println();
		int number1_ =14;
		boolean reslute = isNumberEven(number);
		System.out.println("is the number is :" +number1_ + " "+"even? " +reslute);
		
		int number1=25;
		int number2=30;
		boolean reslut= compare(number1, number2);
		System.out.println("Is"+" "+number1+" "+"Is less than "+number2+"?"+" "+reslut);
		
		System.out.println();
		int number3=90;
		int number4=90;
		boolean ans= compare1(number3, number4);
		System.out.println("Is"+" "+number3+" "+"Is equal "+number4+" "+"?"+" "+ans);
		
		System.out.println();
		int number5 =89;
		int number6=98;
		boolean ans1=compare2(number5, number6);
		System.out.println("Is"+" "+number5+" "+"Is grater tha and equal"+" "+number6+"? "+" "+ans1);
		
		System.out.println();
		
		int number7=32;
		int number8= 15;
		boolean ans2=obj.compare3(number7, number8);
		System.out.println("Is"+" "+number7+" "+"Is greaten than  "+" "+number8+"?"+" "+ans2);
		
		System.out.println();
		int speed=60;
		int time= 4;
		int ans3= calculateDistance(speed, time);
		System.out.println("The Distancecs:"+ans3);
		
		
		System.out.println();
		int distance =90;
		int speed1=60;
		int ans4= obj.calculateTime(distance, speed1);
		System.out.println("The time(in minutes) :"+ans4+" "+"Minute");
		
		System.out.println();
		int distance1=125;
		int time2=5;
		int ans5= calculateSpeed(distance1, time2);
		System.out.println("The speed is:"+ans5);
		
		System.out.println();
		int distance3=300;
		int speed4=100;
		int ans6=calculateTravelTime(distance3, speed4);
		System.out.println("The travel time is:"+ans6);
		
		System.out.println();
		int  totalDistance = 450;
		int totalTime = 9;
		int ans7 = calculateAverageSpeed(totalDistance, totalTime) ;
		System.out.println("The average speed is:"+ans7);
		
		System.out.println();
		int speed5=80;
		int speed6=60;
		int ans8= obj.calculateRelativeSpeed(speed5, speed6);
		System.out.println("The relative speed: "+ans8);
		
		System.out.println();
		int distance4=150;
		int speed7=50;
		int distance5=200;
		int speed8= 100;
		int ans9= calculateTotalTravelTime(distance4, speed7, distance5, speed8);
		System.out.println("The total travel is:"+ans9);
		
		System.out.println();
		int distance6=600;
		int fuel =40;
		int ans10= obj.calculateFuelEfficiency(distance6, fuel);
		System.out.println("The total fuel is : "+ ans10);
		
		System.out.println();
		int  initialSpeed =0;
		int finalSpeed = 60;
		int time1 = 10;
		int ans11= calculateAcceleration(initialSpeed, finalSpeed, time1);
		System.out.println("The acceleration is :"+ans11);
		
		System.out.println();
		int distance7 =250;
		int costPerKilometer=50;
		int ans12= obj.calculateTripCost(distance7, costPerKilometer);
		System.out.println("The total trip cost is : "+ans12);
		
		System.out.println();
		float amount =1500;
		int rate = 4;
		int year =2;
		float ans13= calculateSimpleInterest(amount, rate, year);
		System.out.println("The simple interst is : "+ans13);
		
		System.out.println();
		float amount1 =2000;
		int rate2 = 6;
		int year2 =3;
		float ans14= calculateSimpleInterest2(amount1, rate2, year2);
		System.out.println("The simple interst is : "+ans14);
		
		System.out.println();
		float amount2 =800;
		int rate3 = 7;
		int year3 =3;
		float ans15= calculateSimpleInterest3(amount2, rate3, year3);
		System.out.println("The simple interst is : "+ans15);
		
		
		System.out.println();
		float amount3 =3000;
		int rate4 = 5;
		int year4 =6;
		float ans16= calculateSimpleInterest4(amount3, rate4, year4);
		System.out.println("The simple interst is : "+ans16);
		
		
		System.out.println();
		float amount4 =1500;
		int rate5 = 8;
		int year6 =7;
		float ans17= calculateSimpleInterest5(amount4, rate5, year6);
		System.out.println("The simple interst is : "+ans17);
	}

}
