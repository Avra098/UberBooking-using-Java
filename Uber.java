
import java.util.Scanner;
class Ride{
  private String pickupLocation;
  private String destination;
  private double distance;
  private int duration;
  public Ride(String pickupLocation, String destination, double distance, int duration){
    this.pickupLocation = pickupLocation;
    this.destination = destination;
    this.distance = distance;
    this.duration = duration;
  }
  public double calculateFare(){
    double baseFare = 2.0;
    double distanceFare = distance * 1.5;
    double timeFare = duration * 0.1;
    return baseFare + distanceFare + timeFare;
  }
  public void displayRideDetails(){
    System.out.println("Ride Details:");
    System.out.println("Pickup Location: " + pickupLocation);
    System.out.println("Destination: " + destination);
    System.out.println("Distance: " + distance + " miles");
    System.out.println("Duration: " + duration + " minutes");
  }
}
class Uber{
  public String name;
  public Uber(String name){
    this.name = name;
  }
  public void bookRide(Ride ride){
    System.out.println("Booking ride with " + name+ "...");
    ride.displayRideDetails();
    double fare = ride.calculateFare();
    System.out.println("Estimated Fare: $" + fare);
    System.out.println("Ride booked successfully with " + name + "!");
  }
}
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter pickup location: ");
    String pickupLocation = scanner.nextLine();
    System.out.print("Enter destination: ");
    String destination = scanner.nextLine();
    System.out.print("Enter distance (in miles): ");
    double distance = scanner.nextDouble();
    System.out.print("Enter duration (in minutes): ");
    int duration = scanner.nextInt();
    Ride ride = new Ride(pickupLocation, destination, distance, duration);
    Uber uber = new Uber("Johny Souvik Sins");
    uber.bookRide(ride);
  }
}
