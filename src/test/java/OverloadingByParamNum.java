/**
 * @author 徐刚
 * @date 2021/4/17
 */
public class OverloadingByParamNum {
    public static void main(String[] args) {
        System.out.println(Adder.add(10, 19));
        System.out.println(Adder.add(10, 19, 20));
    }
}
