package Object;

class Calci {
    public int add(int n1, int n2, int n3) {
        return n1 + n2 + n3;
    }

    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

public class ComputerClass {
    public static void main(String[] args) {
        Calci c = new Calci();
        int res = c.add(2, 3, 4);
        System.out.println(res);
    }
}
