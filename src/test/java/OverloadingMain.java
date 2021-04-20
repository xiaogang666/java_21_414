/**
 * @author 徐刚
 * @date 2021/4/17
 */
public class OverloadingMain {
    public static void main(String[] args) {
        System.out.println("String[] args");
    }

    public static void main(String args) {
        System.out.println("String args");
    }

    public static void main() {
        System.out.println("无参");
    }
}
