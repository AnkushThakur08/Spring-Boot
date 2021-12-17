import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class PrimeNo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Ankush Thakur\\Desktop\\one.txt");

        try {
            FileWriter fOutput = new FileWriter(
                "C:\\Users\\Ankush Thakur\\Desktop\\two.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String val = sc.nextLine();
                int myNewVal = Integer.parseInt(val);
                System.out.println(myNewVal);

                boolean Num = false;
                for (int i = 2; i <= myNewVal / 2; ++i) {
                    // condition for nonprime number
                    if (myNewVal % i == 0) {
                        Num = true;
                        break;
                    }
                }

                if (!Num) {
                    System.out.println(myNewVal + " is a prime number.");
                    String result = String.valueOf(myNewVal);
                    fOutput.write(result + " is a prime number." + '\n');
                } else
                    System.out.println(myNewVal + " is not a prime number.");
            }
            sc.close();
            fOutput.close();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}