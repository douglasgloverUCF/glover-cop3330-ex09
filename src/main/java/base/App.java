/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Douglas Glover
 */
package base;
import java.util.Scanner;
/*
Sometimes you have to round up to the next number rather than follow standard rounding rules.

Calculate gallons of paint needed to paint the ceiling of a room. Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.

Example Output

You will need to purchase 2 gallons of paint to cover 360 square feet.

Remember, you can’t buy a partial gallon of paint. You must
round up to the next whole gallon.

Constraints

Use a constant to hold the conversion rate.
Ensure that you round up to the next whole number.

Challenges

Revise the program to ensure that inputs are entered as numeric values. Don’t allow the user to proceed if the value entered is not numeric.
Implement support for a round room.
Implement support for an L-shaped room.
Implement a mobile version of this app so it can be used at the hardware store.
 */
public class App {
    final int coverage = 350;
    Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        App myApp = new App();
        int length = myApp.getLength();
        int width = myApp.getWidth();
        myApp.findGallons(length, width);
    }
    int getLength()
    {
        System.out.print("What is the length? ");
        return in.nextInt();
    }
    int getWidth()
    {
        System.out.print("What is the width? ");
        return in.nextInt();
    }
    void findGallons(int length, int width)
    {
        int area = length * width;
        int remainder = area % coverage;
        int gallons = (area - remainder) / coverage;
        if (remainder != 0) gallons++;
        System.out.print("You will need to purchase " + gallons + " gallons of paint to cover " + area + " square feet.");
    }
}
