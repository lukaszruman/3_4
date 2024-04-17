import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj pierwszy bok:");
        int width = scanner.nextInt();

        System.out.println("podaj drugi bok:");
        int height = scanner.nextInt();

        System.out.println("podaj pierwszy znak:");
        char borderChar = scanner.next().charAt(0);

        System.out.println("podaj drugi znak:");
        char fillChar = scanner.next().charAt(0);

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height-1 || j == 0 || j == width-1) {
                    System.out.print(borderChar);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}