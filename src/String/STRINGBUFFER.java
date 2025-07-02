package String;

public class STRINGBUFFER {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello WOrld");
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        sb.append("  ni");
        System.out.println(sb);
    }
}
