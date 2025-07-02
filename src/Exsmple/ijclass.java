package Exsmple;

public class ijclass {
    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i <= 6; i++) {
            System.out.println("I variable");
            int j = 0;
            for (j = 0; j <= i; j++) {
                System.out.println("J variable");
                j++;
            }
        }
        i++;
    }
}
