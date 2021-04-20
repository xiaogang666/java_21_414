/**
 * @author 徐刚
 * @date 2021/4/15
 */
public class Ttest {
    public static void findEvenOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + " 是偶数");
        } else {
            System.out.println(num + "是奇数");
        }
    }

    public static void main(String[] args) {
        findEvenOdd(10);
    }
}
