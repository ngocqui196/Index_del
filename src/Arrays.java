public class Arrays {
    public static void main(String[] args) {
        int Array[] = {1, 5, 8, 4, 6, 7, 9, 2, 3};

        for (int i = 0; i < Array.length; i++) {
            if (Array[i] == 5) {
                Array[i] = Array[i + 1];
                i++;
            }
            System.out.println(Array[i]);
        }

    }
}
