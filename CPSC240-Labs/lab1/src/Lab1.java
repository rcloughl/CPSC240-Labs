import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args){

        System.out.println("What is your favorite beverage?");
        Scanner scnrD= new Scanner(System.in);
        String drink = scnrD.nextLine();

        System.out.println("How many bottles of " + drink + " do you want to start with?" );
        Scanner scnrB= new Scanner(System.in);
        int bottles = scnrB.nextInt();

        //System.out.println("I want " + bottles + " bottles of " + drink);

        for(int x=bottles; x>=0; x--) {

            if (x==0){
                System.out.println(phrase(x, drink, bottles) + " on the wall, " + phrase(x, drink, bottles) + ".");
                System.out.println("Go to the store and buy some more, " + phrase(x - 1, drink, bottles) + " on the wall. \n");
            }
            else
                if(x>0) {
                    System.out.println(phrase(x, drink, bottles) + " on the wall, " + phrase(x, drink, bottles) + ".");
                    System.out.println("Take one down and pass it around, " + phrase(x - 1, drink, bottles) + " on the wall. \n");
                }
        }
    }
    public static String phrase(int bottles, String drink, int start) {
        if (bottles==-1) {
            bottles = start;
        }

        if (bottles==1)
        {
            String sentence = bottles + " bottle of " + drink;
            return sentence;
        }

        String sentence = bottles + " bottles of " + drink;
        return sentence;
    }

}
