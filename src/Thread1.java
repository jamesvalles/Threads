import com.sun.javafx.scene.traversal.Algorithm;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Random;
import javax.xml.bind.DatatypeConverter;

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
     String password = word.toString();
      try {
        MessageDigest md = MessageDigest.getInstance("SHA-256");

     byte[] digest = md.digest(password.getBytes(StandardCharsets.UTF_8));
     String sha256 = DatatypeConverter.printHexBinary(digest).toLowerCase();
        System.out.println("Hash: " + sha256 );
      } catch (Exception e){
        System.out.println("Error.");
      }

      count++;
      System.out.println("Timer B: "+ count);
    }


  }
}
