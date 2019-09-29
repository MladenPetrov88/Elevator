import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = scanner.nextInt();
        int capacity = scanner.nextInt();

        int courses = (int) Math.ceil((double) numberOfPeople / capacity);
        System.out.println(courses);
    }
}
