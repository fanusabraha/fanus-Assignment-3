import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) throws Exception {
        customerservice visitor = new customerservice();
        Scanner scanner= new Scanner(System.in);
        BufferedReader reader=null;
        int numberofTries=0;
        boolean userFound= true;
        String[] saver= new String[3];
        User[] userdata = new User[4];
        while(numberofTries<5 && (userFound))
        {
            if (numberofTries>=1)       {System.out.println("Opps Input was invalid please try again");}
            System.out.println("Enter your Email");
            saver[0] = scanner.next();
            System.out.println("Enter your password");
            saver[1] = scanner.next();

            try
            {   reader = new BufferedReader(new FileReader("data.txt"));
                String line = "";
                int i = 0;

                while ((line = reader.readLine()) != null && (userFound))

                {   String[] data = new String[3];
                    data = line.split(",");
                    userdata[i++] = new User(data[0], data[1], data[2]);

                    for (i = 0; i < userdata.length - 1; i++)

                    {   if (saver[0].equalsIgnoreCase(data[0]) && saver[1].equalsIgnoreCase(data[1])) {
                        System.out.println("Welcome  ");
                        userFound = false;
                        break; }
                    }
                }
                numberofTries++;
                if(numberofTries==5)    {System.out.println("Too many failed attempts, you are now locked out");}
            }
            finally {reader.close();}
        }
    }
}




