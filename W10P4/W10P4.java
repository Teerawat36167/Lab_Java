import java.io.File;
import java.util.*;
import java.io.*;

public class W10P4 {
     public static void main(String[] args) {

          ArrayList<Double> assistant = new ArrayList<>();
		ArrayList<Double> associate = new ArrayList<>();
		ArrayList<Double> full = new ArrayList<>();

          try {
               File text = new File("Salary.txt");
               Scanner input = new Scanner(text);
               while(input.hasNext()) {
                    String[] data = (input.nextLine()).split(" ");
                    Double salary = Double.parseDouble(data[3]);
                    if (data[2].equals("assistant")) {
                         assistant.add(salary);
                    } else if (data[2].equals("associate")) {
                         associate.add(salary);
                    } else if (data[2].equals("full")) {
                         full.add(salary);
                    }
               }
          } catch (Exception e) {
               e.printStackTrace();
          }
     }
}
