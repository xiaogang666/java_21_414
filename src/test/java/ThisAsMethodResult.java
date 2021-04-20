/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class ThisAsMethodResult {
    ThisAsMethodResult getThisAsMethodResult() {
        return this;
    }

    void out() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        new ThisAsMethodResult().getThisAsMethodResult().out();
    }
}
