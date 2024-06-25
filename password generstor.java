import java.util.Random;

public class paswordgenerator {

 public static String password_using_name(String Name) {

  // Get the first 4 letters of the name and capitalize the first letter
  String initials = Name.substring(0, 1).toUpperCase() + Name.substring(1, Math.min(Name.length(), 4));

  // Generate 4 random numbers
  Random random = new Random();
  int randomNumber = 1000 + random.nextInt(9000);

  // Concatenate initials and random numbers
  String generatedString = initials + randomNumber;

  System.out.println(generatedString); // Output example: Joha3456

  return generatedString;
 }

 public static void main(String[] args) {
  password_using_name("johana");
 }
}