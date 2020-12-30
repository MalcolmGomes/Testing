import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Main {

    public static void main(String args[]) {
        try {
            File myObj = new File("sample.txt");
            Scanner myReader = new Scanner(myObj);
            int[] numbers = new int[20];            
            int counter = 0;
            while (myReader.hasNextLine()) {
              String data = myReader.nextLine();
              int num = Integer.parseInt(data); 
              numbers[counter] = num;
              counter++;
            }
            myReader.close();
          } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }
    }

}