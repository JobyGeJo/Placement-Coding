public class rotateArray {

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 3, 4, 9, 2, 7, 3, 8};
        int n = 3;

        int[] New = new int[numbers.length];

        for (int i=0; i<numbers.length; i++)
            New[i] = numbers[(i + n) % numbers.length];
            
        for (int N: New)
            System.err.print(N + " ");
    }
}