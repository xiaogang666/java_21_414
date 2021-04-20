/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class StaticBlock {
    static {
        System.out.println("静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("main 方法");
    }
}
