import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class WordCount {

    static HashMap<String, Integer> wordCount = new HashMap<>();

    public static void counter(File file, int num) throws FileNotFoundException {
        Scanner text = new Scanner(file);
        ArrayList<String> mostUsed = new ArrayList<>(num);
        int tempCount = 0;
        while (text.hasNext()) {
            int count = 0;
            String key = text.next();
            wordCount.putIfAbsent(key, count);
            count = (wordCount.get(key));
            count++;
            wordCount.put(key, count);
        }


        int temp=0;
        for (int i=0; i<num; i++) {

            ArrayList<String> keyList = new ArrayList<>();
            for (String word : wordCount.keySet()) {
                keyList.add(word);
            }
            String max = keyList.get(0);
            for (String word : keyList) {
                if (wordCount.get(max) < wordCount.get(word)) {
                    max = word;
                }
            }
            temp++;
            System.out.println("#"+temp+": "+ max+" ("+ wordCount.get(max)+" uses)");
            wordCount.remove(max);
        }

        System.out.println(wordCount);

}


    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Name the file you want to search:");
        String location =  input.nextLine();
        File file = new File("src/"+location+".txt");
        System.out.println("How many words would you like to view:");
        int numberOfWords = Integer.parseInt(input.nextLine());
        counter(file,numberOfWords);

    }
}

