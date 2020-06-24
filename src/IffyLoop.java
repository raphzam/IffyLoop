import com.sun.org.apache.xpath.internal.objects.XBoolean;

import java.util.Scanner;

public class IffyLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        LOOPY
        String fiveWords = "";
        System.out.println("Enter five words");

        for (int i = 0; i < 5; i++) {
            fiveWords += input.nextLine() + " ";
        }
        System.out.println(fiveWords);



//        IFFY
        boolean redEyes;

        System.out.println("Are your eyes red?");
        String userAnswer = input.nextLine();

        if (userAnswer.equalsIgnoreCase("y")|| userAnswer.equalsIgnoreCase("yes")){
            redEyes = true;
        } else {
            redEyes = false;
        }

        if (redEyes){
            System.out.println("Get some sleep!");
        } else {
            System.out.println("You look great!");
        }


        //        IFFYLOOP

        do {
            System.out.println("Do you want to try again?");
            userAnswer = input.nextLine();
        } while (!userAnswer.equalsIgnoreCase("n"));

    }
}
