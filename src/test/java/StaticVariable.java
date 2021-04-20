public class StaticVariable {
    public static int data;

    static {
        data = 66;
    }

    public static void main(String[] args) {
        System.out.println(StaticVariable.data);
    }
}
