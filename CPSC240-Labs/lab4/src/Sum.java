import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Sum {
    public static void main(String [] args) {
        // open the file

        int words=0;

        try {
            FileReader reader = new FileReader("data.txt");

        // make a scanner from it
        Scanner in = new Scanner(reader);

        // read all the numbers
        int sum = 0;
        while (in.hasNext()) {
            String temp = in.nextLine();
            try {
                sum += Integer.valueOf(temp);
            }
            catch(NumberFormatException f){
                words++;
            }
        }

        // print the sum
        System.out.println("Sum is " + sum + ".");
        System.out.println("There were "+ words + " non-numbers in the file.");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("The file was not found.");
            System.exit(0);
        }
    }
}
