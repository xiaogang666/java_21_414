/**
 * @author 徐刚
 * @date 2021/4/15
 */
public class MyAbstractDemo extends AbstractDemo {

    @Override
    void display() {
        System.out.println("重写了抽象方法");
    }

    public static void main(String[] args) {
        MyAbstractDemo myAbstractDemo = new MyAbstractDemo();
        myAbstractDemo.display();
    }
}
