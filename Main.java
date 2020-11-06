import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Create an array of 15 int values
    int[] seatNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
    Scanner scan = new Scanner(System.in);
    // Create an array of 15 elements
    String[] names = new String[15];
    // Use a For loop to loop through the String array
    for (int i = 0; i < names.length; i++) {
      System.out.println("Enter you name");
      names[i] = scan.next();
      //For every name that is entered a new name will print out all the way up to 15
    }
    int i = 0;
    while (i < names.length) {
      System.out.println(names[i] + "Sits in seat #"+ seatNumbers [i]);
      //Each student (name) will be assigned a seat number
      
    }

  }
}