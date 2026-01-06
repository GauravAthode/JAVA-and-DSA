package composition;

public class House 
{
	Room obj1;
	Room obj2;
	Room obj3;
	Room obj4;
	public House()
	{
		obj1= new Room("Room number 1");
		obj2= new Room("Room number 2");
		obj3= new Room("Room number 3");
		obj4= new Room("Room number 4");
		
	}
	void ShowRoomdetails()
	{
		obj1.Showdetails();
		obj2.Showdetails();
		obj3.Showdetails();
		obj4.Showdetails();
	}
	
	

}
