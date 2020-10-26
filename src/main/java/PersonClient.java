import java.util.Scanner;
public class PersonClient {
    public static void main(String[] args) {
             
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name? (input as [First] [Last])");
        String scan = input.nextLine();
        String first = scan.substring(0,scan.indexOf(" "));
        String last = scan.substring(scan.indexOf(" ")+1);
        Person p = new Person(first, last, 0);
        System.out.println("Type \"STOP\" at any point to stop the game.");

        while(true){
            System.out.println("What should "+p.toString()+" do? \n1) Cook\n2) Do Something\n3) Nothing\n(1,2,3)");
            String action = input.nextLine();
            if(action.equals("1")){p.cook();}
            else if(action.equals("2")){p.doSomething();}
            else if(action.equals("STOP")){
                System.out.println(p.toString()+"\'s final XP was "+p.getXP());
                break;
            }
            else{p.nothing();}
            System.out.println(p.getFirstName()+"\'s XP is "+p.getXP());
        }






        input.close();
    }
}
