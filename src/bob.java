import java.util.Scanner;

public class bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hey, my name's Bob... My mom said you wanted to talk to me, or something... Whatever...");
        String response = "";
        while(!response.equalsIgnoreCase("QUIT")) {
            System.out.println("What do you want?");
            response = sc.nextLine();
            if (response.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else if (response.endsWith("?")) {
                System.out.println("Sure.");
            } else if (response.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (response.equalsIgnoreCase("quit")){
                System.out.println("Finally...");
            } else {
                System.out.println("Whatever.");
            }
        }
        System.out.println("I'm out of here...");
    }
}
