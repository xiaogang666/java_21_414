/**
 * @author 徐刚
 * @date 2021/4/20
 */
public class equalFloat {
    public static void main(String[] args) {
        double d1 = .0;
        for (int i = 1; i <= 11; i++) {
            d1 += .1;

        }
        double d2 = .1 * 11;
        System.out.println(d1 == d2);
        System.out.println(d1);
        System.out.println(d2);
    }
}
