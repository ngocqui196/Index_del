import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        int Array[] = {1, 5, 8, 4, 6, 7, 9, 2, 3};
        Scanner sc = new Scanner(System.in);
        int index;
        do {
            System.out.println("Enter index delete : ");
            index = sc.nextInt();
        } while (index < 0 || index > Array.length-1);
        for (int i = index; i < Array.length - 1; i++) {
            Array[i] = Array[i + 1];
        }
        Array[Array.length - 1] = 0;
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
    }
}
