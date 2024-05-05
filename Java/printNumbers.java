public class printNumbers {

    public static void main(String[] args) {
        String s = "nqix1w3k4432bdj";

        for (char c: s.toCharArray())
            if (47 < c && c < 58) 
                System.out.print(c + " ");
    }
}