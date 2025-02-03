import java.util.Scanner;d
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SmartWatch smartWatch = new SmartWatch();
        smartWatch.notifyUser();
        smartWatch.sayHello();
    }
}