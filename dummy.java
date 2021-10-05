import java.util.Scanner;

class Ticket
{
	 int availableTickets=60;

	void bookTicket(int bookingCount)
	{
	if(bookingCount<=availableTickets)
	{
		availableTickets=availableTickets-bookingCount;
		System.out.println(bookingCount+"Tickets have been booked");
		System.out.println("Available Tickets ARE="+availableTickets);
	}
	else
	{
		System.out.println("SORRY TICKETS ARE NOT AVAILABLE");
	}
	}
	void cancelTicket(int cancelCount)
	{
		availableTickets=availableTickets+cancelCount;
		System.out.println(cancelCount+"Tickets have been cancelled");
		System.out.println("Available Tickets are="+availableTickets);
	}
	void showAvailableTickets()
	{
		System.out.println("Available Tickets are"+availableTickets);
	}
}
class dummy
{
	public static void main(String[] args)
	{
		Scanner sc1=new Scanner(System.in);
		Ticket t1=new Ticket();

		System.out.println("Select mode of Operation");
		System.out.println("1.Book Ticket");
		System.out.println("2.Cancel Tickets");
		System.out.println("3.view Tickets");
		int choice=sc1.nextInt();

		if(choice==1)
		{
			System.out.println("Enter no of tickets to be booked");

			int count1=sc1.nextInt();
			t1.bookTicket(count1);
		}
		else if(choice==2)
		{
			System.out.println("Enter no.of tickets to be cancelled");

			int count2=sc1.nextInt();
			t1.cancelTicket(count2);
		}
		else if(choice==3)
		{
			System.out.println("Total avilable Tickets="+availableTickets);
		}
		
	}
}