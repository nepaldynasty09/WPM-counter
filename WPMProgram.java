import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class WPMProgram{
    static String[] words={"envelope","cantelope","the","hello","microphone"
                    ,"elephant","biscuit","banner","hammer"};
    public static void main(String[] args) throws InterruptedException{
        System.out.println("3");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("2");
        TimeUnit.SECONDS.sleep(1);

        System.out.println("1");
        TimeUnit.SECONDS.sleep(1);

        Random rand = new Random();
        for(int i=0; i<10;i++)
            System.out.print(words[rand.nextInt(9)]+" ");

        System.out.println();

        double start = LocalTime.now().toNanoOfDay();
        Scanner scan=new Scanner(System.in);
        String typedWords=scan.nextLine();

        System.out.println(typedWords);
        
        double end= LocalTime.now().toNanoOfDay();
        double elapsedTime=end-start;
        double seconds = elapsedTime/1000000000.0;
        System.out.println(elapsedTime);
        int numchars = typedWords.length();
        
        int wpm=(int)((double)(numchars/5)/seconds*60);
        System.out.println("Your wpm is"+wpm+"!");
    }
}