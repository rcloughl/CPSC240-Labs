import java.util.Random;
public class Family {
    //guess is that it will be 50/50

    private int boys;

    private int girls;

    public static Random random = new Random();

    int randkids = random.nextInt(2);

    public Family() {
        int boys = 0;
        int girls = 0;
    }
    public void haveChildren(){
        while (randkids==0) {
            boys++;
            randkids=random.nextInt(2);
        }
            girls++;
    }
    public int getBoys(){
        return boys;
    }
    public int getGirls(){
        return girls;
    }
}