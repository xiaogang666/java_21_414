/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class InvokeConstrutor {
    InvokeConstrutor() {
        this(10);
        System.out.println("hello");
    }

    InvokeConstrutor(int count) {
        System.out.println(count);
    }

    public static void main(String[] args) {
        InvokeConstrutor invokeConstrutor = new InvokeConstrutor();
    }
}
