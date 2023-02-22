import java.util.ArrayList;
import java.util.*;
public class Main {

    public static void main(String [] args){
        ArrayList<Family> family = new ArrayList(1000000);
        int boys = 0;
        int girls = 0;
        for (int i =0; i<1000000; i++) {
            family.add(new Family());
        }
        for (Family f : family){
                f.haveChildren();
                boys += f.getBoys();
                girls += f.getGirls();
        }
        double total = boys+girls;
        double percentBoys=boys;
        percentBoys /= total/100;
        double percentGirls=girls;
        percentGirls /= total/100;

        System.out.print("Boys: " + boys + " ");
        System.out.format("%.2f", percentBoys);
        System.out.println("%");
        System.out.print("Girls: "+ girls + " ");
        System.out.format("%.2f", percentGirls);
        System.out.println("%");
    }
}
