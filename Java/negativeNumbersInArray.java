public class negativeNumbersInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, -3, 3, 4, 5, 2, -7, 3, 8};
        
        for (int n: numbers) 
            if (n < 0) 
                System.out.println(n);
    }
}
