package parking;

public class RunProject1 {
    public static void main(String[] args) {
        String l1 = "D33-SSS";
        String l2 = "D33-SS1";

        if (l1.matches("[A-Za-z]\\d{2}-[A-Za-z]{3}")){
            System.out.println(l1 + " is valid!");
        }
        else {
            System.out.println(l1 + " invalid!!");
        }

        if (l2.matches("[A-Za-z]\\d{2}-[A-Za-z]{3}")){
            System.out.println(l2 + " valid!");
        }
        else {
            System.out.println(l2 + " invalid!!");
        }
       // new Operation().run();
    }
}