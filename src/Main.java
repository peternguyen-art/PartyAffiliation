import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String party;
        System.out.print("What's your party affiliation? ");

        if (in.hasNextLine()) {
            party = in.nextLine();

            if (party.equals("D")) {
                System.out.println("You have a Democrat Donkey!");
            } else if (party.equals("R")) {
                System.out.println("You have a Republican Elephant!");
            } else if (party.equals("I")) {
                System.out.println("You're an Independent Man");
            } else {
                System.out.println("You're one of the others!");
            }
        }
    }
}
