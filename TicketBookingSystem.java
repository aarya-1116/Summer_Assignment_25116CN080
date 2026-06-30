import java.util.Scanner;
public class TicketBookingSystem {
    static class Seat{
        int seatNo;
        boolean booked;
        String passengerName;
        int id;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Seat[] seats=new Seat[20];
        for(int i=0;i<20;i++){
            seats[i]=new Seat();
            seats[i].seatNo=i+1;
            seats[i].booked=false;
            seats[i].id=1000;
        }
        String[] waitingList=new String[20];
        int waitingCount=0;
        System.out.println("----Ticket Booking Sytem----");
        while(true){
             System.out.println("1.View seat map\n2.View Prices\n3.Book Ticket\n4.Generate ticket\n5.Cancel ticket\n6.Exit");
        int choice=sc.nextInt();
            switch(choice){
                case 1:for(int i=0;i<20;i++){
                    if(seats[i].booked)
                        System.out.print("[X]");
                    else
                        System.out.print("["+seats[i].seatNo+"]");
                    if((i+1)%2==0)
                        System.out.print("  ");
                    if((i+1)%4==0)
                        System.out.println();
                }
                break;
                case 2:System.out.println("Window seats=₹500/-\nAisle seat:₹450/-");
                break;
                case 3:System.out.println("Enter the seat number to book the ticket:");
                int seat=sc.nextInt();
                if(seat<1||seat>20){
                    System.out.println("Invalid seat number.");
                    break;
                }
                if(seats[seat-1].booked){
                    System.out.println("Sorry! The seat is already booked.\nDo want to be added to the waiting list?(True/False)");
                    boolean response=sc.nextBoolean();
                    if(response){
                        sc.nextLine();
                    System.out.println("Enter your name:");
                    String waitName=sc.nextLine();
                        waitingList[waitingCount++]=waitName;
                        System.out.println("Added to waiting list.Waiting number:"+waitingCount);
                    }
                }
                else{ 
                    sc.nextLine();
                    System.out.println("Enter your name:");
                    seats[seat-1].passengerName=sc.nextLine();
                seats[seat-1].booked=true;
                seats[seat-1].id++;
                System.out.println("Booking successfull!");
                }
                break;
                case 4:System.out.println("Enter the seat number to get the ticket:");
                int genseat=sc.nextInt();
                if(!seats[genseat-1].booked){ 
                    System.out.println("No ticket found.");
                }else{ 
                System.out.println("---Ticket---");
                System.out.println("Passenger Name:"+seats[genseat-1].passengerName);
                System.out.println("Ticket id:"+seats[genseat-1].id);
                System.out.println("Seat number:"+seats[genseat-1].seatNo);
                if(genseat==1||genseat%4==0||genseat==5||genseat==9||genseat==13||genseat==17){
                   System.out.println("Seat type:Window");
                   System.out.println("Fare:500");
                }
                else{
                    System.out.println("Seat type:Aisle");
                   System.out.println("Fare:450");
                }}
                break;
                case 5:System.out.println("Enter seat number:");
                int cancelseat=sc.nextInt();
                if(seats[cancelseat-1].booked){
                    seats[cancelseat-1].booked=false;
                    seats[cancelseat-1].passengerName=null;
                    System.out.println("Booking cancelled!");
                    if(waitingCount>0){
                        seats[cancelseat-1].booked=true;
                        seats[cancelseat-1].passengerName=waitingList[0];
                    }
                    for(int i=0;i<waitingCount-1;i++){
                        waitingList[i]=waitingList[i+1];
                    }
                    waitingCount--;
                }
                else{
                    System.out.println("Seat is already vacant.");
                }
                break;
                case 6:System.out.println("Thank you!");
                sc.close();
                    System.exit(0);
            }
        }
    }
}
