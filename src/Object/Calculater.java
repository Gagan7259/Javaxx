package Object;

class demo {


    public int add(int a, int b) {
        int r = a + b;
        return r;
    }
}

public class Calculater {


    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        demo cal = new demo();
        int result = cal.add(num1, num2);
        System.out.println("Sum is: " + result);
    }
}

