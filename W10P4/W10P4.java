import java.io.File;
import java.util.*;

public class W10P4 {
     public static void main(String[] args) {
          try {
               File text = new File("Salary.txt");
               Scanner input = new Scanner(text);
               Double totalAssistant = 0.0,totalAssociate = 0.0,totalFull = 0.0,totalAll = 0.0;
               Integer countAssistant = 0,countAssociate = 0,countFull = 0;
               while(input.hasNext()) {
                    String[] data = (input.nextLine()).split(" ");
                    Double salary = Double.parseDouble(data[3]);
                    if (data[2].equals("assistant")) {
                         totalAssistant += salary;
                         countAssistant++;
                    } else if (data[2].equals("associate")) {
                         totalAssociate += salary;
                         countAssociate++;
                    } else if (data[2].equals("full")) {
                         totalFull += salary;
                         countFull++;
                    }
               }
               input.close();
               totalAll = totalAssistant + totalAssociate + totalFull;
               System.out.printf("Total salary for assistant professor is %.2f \n",totalAssistant);
               System.out.printf("Total salary for associate professor is %.2f \n",totalAssociate);
               System.out.printf("Total salary for full professor is %.2f \n",totalFull);
               System.out.printf("Total salary for all professor is %.2f \n",totalAll);
               System.out.printf("Average salary for assistant professor is %.2f \n",totalAssistant/countAssistant);
               System.out.printf("Average salary for associate professor is %.2f \n",totalAssociate/countAssociate);
               System.out.printf("Average salary for full professor is %.2f \n",totalFull/countFull);
               System.out.printf("Average salary for all professors is %.2f \n",totalAll/(countAssistant + countAssociate + countFull));
          } catch (Exception e) {
               e.printStackTrace();
          }
     }
}
