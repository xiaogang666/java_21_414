/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class InvokeCurrentClassMethod {
    void method1() {
    }

    void method2() {
        method1();
    }

    public static void main(String[] args) {
        (new InvokeCurrentClassMethod()).method1();
    }
}
