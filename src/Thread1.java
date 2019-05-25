import com.sun.javafx.scene.traversal.Algorithm;
import java.util.Random;

public class Thread1 extends Thread {

  public void run() {
    int count = 0;


   for (int i = 0; i <=5; i++) {


     String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

     Random random = new Random();
     StringBuilder word = new StringBuilder();
     for (int c = 0; c < 50; c++) {
       word.append((alphabet.charAt(random.nextInt(alphabet.length()))));
     }


      try {
        sleep(1000);
      } catch(Exception e){

      }
     System.out.println("Hash: " + word.hashCode());
      count++;
      System.out.println("Timer B: "+ count);
    }


  }
}
