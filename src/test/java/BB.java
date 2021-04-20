/**
 * @author 徐刚
 * @date 2021/4/17
 */
public class BB {
    BB() {
        System.out.println("子类构造方法");
    }

    {
        System.out.println("代码初始化块");
    }

    public static void main(String[] args) {
        new BB();
    }
}
