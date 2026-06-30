//--This is Movie Ticket Booking System---
import java.util.Scanner;
public class MiniProject{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     int[] movieId = new int[100];
     String[] movieName = new String[100];
     String[] movieTime = new String[100];
     int[] totalSeats = new int[100];
     int[] bookedSeats = new int[100];
     double[] ticketPrice = new double[100];
     int count=0;
     System.out.println("----Movie Ticket System----");
     while (true) {
            System.out.println("1. Add Movie");
            System.out.println("2. Display Movies");
            System.out.println("3. Search Movie");
            System.out.println("4. Book Tickets");
            System.out.println("5. Cancel Tickets");
            System.out.println("6. Update Movie");
            System.out.println("7. Delete Movie");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {

                case 1:
                    count=addMovie(sc,movieId, movieName, movieTime,
                     totalSeats, bookedSeats, ticketPrice, count);
                    break;

                case 2:
                    displayMovies(movieId, movieName, movieTime,
                     totalSeats, bookedSeats, ticketPrice, count);
                    break;

                case 3:
                    searchMovie(sc,movieId, movieName, movieTime,
                     totalSeats, bookedSeats, ticketPrice, count);
                    break;

                case 4:
                    bookTicket(sc,movieId, movieName, movieTime,
                     totalSeats, bookedSeats, ticketPrice, count);
                    break;

                case 5:
                    cancelTicket(sc,movieId, movieName, movieTime,
                     totalSeats, bookedSeats, ticketPrice, count);
                    break;

                case 6:
                    updateMovie(sc,movieId, movieName, movieTime,
                     totalSeats, bookedSeats, ticketPrice, count);
                    break;

                case 7:
                    count=deleteMovie(sc,movieId, movieName, movieTime,
                     totalSeats, bookedSeats, ticketPrice, count);
                    break;

                case 8:
                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid Choice!");
            }
     }
    }
     public static int addMovie(Scanner sc,int[] movieId ,String[] movieName,String[] movieTime,
                    int[] totalSeats,int[] bookedSeats,double[] ticketPrice,int count) {
        System.out.println("Enter the id of the movie:");
        movieId[count]=sc.nextInt();
        sc.nextLine();
         System.out.println("Enter the name of the movie:");
         movieName[count]=sc.nextLine();
         System.out.println("Enter the time of the movie:");
         movieTime[count]=sc.nextLine();
         System.out.println("Enter the total seats:");
         totalSeats[count]=sc.nextInt();
         System.out.println("Enter the price of this ticket:");
         ticketPrice[count]=sc.nextDouble();bookedSeats[count] = 0;
count++;

return count;
    }
    public static void displayMovies(int[] movieId,
                                 String[] movieName,
                                 String[] movieTime,
                                 int[] totalSeats,
                                 int[] bookedSeats,
                                 double[] ticketPrice,
                                 int count) {

    if (count == 0) {
        System.out.println("No movies available.");
        return;
    }

    System.out.println("------------------------------------------------------------------------------------------");
    System.out.printf("%-8s%-20s%-15s%-10s%-10s%-12s%-10s%n",
            "ID", "Movie Name", "Time", "Total", "Booked", "Available", "Price");
    System.out.println("------------------------------------------------------------------------------------------");

    for (int i = 0; i < count; i++) {
        int availableSeats = totalSeats[i] - bookedSeats[i];

        System.out.printf("%-8d%-20s%-15s%-10d%-10d%-12d%-10.2f%n",
                movieId[i],
                movieName[i],
                movieTime[i],
                totalSeats[i],
                bookedSeats[i],
                availableSeats,
                ticketPrice[i]);
    }

    System.out.println("------------------------------------------------------------------------------------------");
}
public static void searchMovie(Scanner sc,
                               int[] movieId,
                               String[] movieName,
                               String[] movieTime,
                               int[] totalSeats,
                               int[] bookedSeats,
                               double[] ticketPrice,
                               int count) {

    if (count == 0) {
        System.out.println("No movies available.");
        return;
    }

    System.out.print("Enter Movie ID to search: ");
    int id = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < count; i++) {

        if (movieId[i] == id) {

            int availableSeats = totalSeats[i] - bookedSeats[i];

            System.out.println("\nMovie Found");
            System.out.println("Movie ID        : " + movieId[i]);
            System.out.println("Movie Name      : " + movieName[i]);
            System.out.println("Show Time       : " + movieTime[i]);
            System.out.println("Total Seats     : " + totalSeats[i]);
            System.out.println("Booked Seats    : " + bookedSeats[i]);
            System.out.println("Available Seats : " + availableSeats);
            System.out.println("Ticket Price    : " + ticketPrice[i]);

            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Movie not found.");
    }
}
public static void bookTicket(Scanner sc,
                              int[] movieId,
                              String[] movieName,
                              String[] movieTime,
                              int[] totalSeats,
                              int[] bookedSeats,
                              double[] ticketPrice,
                              int count) {

    if (count == 0) {
        System.out.println("No movies available.");
        return;
    }

    System.out.print("Enter Movie ID: ");
    int id = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < count; i++) {

        if (movieId[i] == id) {

            found = true;

            int availableSeats = totalSeats[i] - bookedSeats[i];

            System.out.println("Movie Name : " + movieName[i]);
            System.out.println("Available Seats : " + availableSeats);

            System.out.print("Enter number of tickets: ");
            int tickets = sc.nextInt();

            if (tickets <= availableSeats) {

                bookedSeats[i] += tickets;

                double bill = tickets * ticketPrice[i];

                System.out.println("\nBooking Successful!");
                System.out.println("Tickets Booked : " + tickets);
                System.out.println("Total Bill : ₹" + bill);
                System.out.println("Remaining Seats : " + (totalSeats[i] - bookedSeats[i]));

            } else {
                System.out.println("Sorry! Only " + availableSeats + " seats are available.");
            }

            break;
        }
    }

    if (!found) {
        System.out.println("Movie not found.");
    }
}
public static void cancelTicket(Scanner sc,
                                int[] movieId,
                                String[] movieName,
                                String[] movieTime,
                                int[] totalSeats,
                                int[] bookedSeats,
                                double[] ticketPrice,
                                int count) {

    if (count == 0) {
        System.out.println("No movies available.");
        return;
    }

    System.out.print("Enter Movie ID: ");
    int id = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < count; i++) {

        if (movieId[i] == id) {

            found = true;

            System.out.println("Movie Name : " + movieName[i]);
            System.out.println("Booked Tickets : " + bookedSeats[i]);

            System.out.print("Enter number of tickets to cancel: ");
            int tickets = sc.nextInt();

            if (tickets <= bookedSeats[i]) {

                bookedSeats[i] -= tickets;

                System.out.println("\nCancellation Successful!");
                System.out.println("Remaining Booked Tickets : " + bookedSeats[i]);
                System.out.println("Available Seats : " + (totalSeats[i] - bookedSeats[i]));

            } else {
                System.out.println("Invalid! You have only " + bookedSeats[i] + " booked ticket(s).");
            }

            break;
        }
    }

    if (!found) {
        System.out.println("Movie not found.");
    }
}
public static void updateMovie(Scanner sc,
                               int[] movieId,
                               String[] movieName,
                               String[] movieTime,
                               int[] totalSeats,
                               int[] bookedSeats,
                               double[] ticketPrice,
                               int count) {

    if (count == 0) {
        System.out.println("No movies available.");
        return;
    }

    System.out.print("Enter Movie ID to update: ");
    int id = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < count; i++) {

        if (movieId[i] == id) {

            found = true;

            System.out.println("\n1. Update Movie Name");
            System.out.println("2. Update Show Time");
            System.out.println("3. Update Total Seats");
            System.out.println("4. Update Ticket Price");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Enter new Movie Name: ");
                    movieName[i] = sc.nextLine();
                    System.out.println("Movie Name Updated Successfully.");
                    break;

                case 2:
                    System.out.print("Enter new Show Time: ");
                    movieTime[i] = sc.nextLine();
                    System.out.println("Show Time Updated Successfully.");
                    break;

                case 3:
                    System.out.print("Enter new Total Seats: ");
                    int seats = sc.nextInt();

                    if (seats >= bookedSeats[i]) {
                        totalSeats[i] = seats;
                        System.out.println("Total Seats Updated Successfully.");
                    } else {
                        System.out.println("Total seats cannot be less than booked seats.");
                    }
                    break;

                case 4:
                    System.out.print("Enter new Ticket Price: ");
                    ticketPrice[i] = sc.nextDouble();
                    System.out.println("Ticket Price Updated Successfully.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

            break;
        }
    }

    if (!found) {
        System.out.println("Movie not found.");
    }
}
public static int deleteMovie(Scanner sc,
                              int[] movieId,
                              String[] movieName,
                              String[] movieTime,
                              int[] totalSeats,
                              int[] bookedSeats,
                              double[] ticketPrice,
                              int count) {

    if (count == 0) {
        System.out.println("No movies available.");
        return count;
    }

    System.out.print("Enter Movie ID to delete: ");
    int id = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < count; i++) {

        if (movieId[i] == id) {

            found = true;

            for (int j = i; j < count - 1; j++) {

                movieId[j] = movieId[j + 1];
                movieName[j] = movieName[j + 1];
                movieTime[j] = movieTime[j + 1];
                totalSeats[j] = totalSeats[j + 1];
                bookedSeats[j] = bookedSeats[j + 1];
                ticketPrice[j] = ticketPrice[j + 1];

            }

            count--;

            System.out.println("Movie deleted successfully.");
            break;
        }
    }

    if (!found) {
        System.out.println("Movie not found.");
    }

    return count;
}
}
