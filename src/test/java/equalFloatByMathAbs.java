/**
 * @author 徐刚
 * @date 2021/4/20
 */
public class equalFloatByMathAbs {
    final static double THRESHOLD = 0.0000001;

    public static void main(String[] args) {
        double d1 = .0;
        for (int i = 1; i <= 11; i++) {
            d1 += .1;
        }
        double d2 = .1 * 11;
        if (Math.abs(d1 - d2) < THRESHOLD) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
