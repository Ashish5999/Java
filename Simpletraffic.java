import java.util.Scanner;

public class Simpletraffic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the light  state");
        String light = sc.nextLine();

        switch (light) {
            case "RED":
                System.out.println("Stop! The light is Red.");
                break;
            case "YELLOW":
                System.out.println("Caution! The light is Yellow.");
                break;
            case "GREEN":
                System.out.println("Go! The light is Green.");
                break;
            default:
                System.out.println("Invalid light signal");
                break;
        }
    }
}