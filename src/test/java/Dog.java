/**
 * @author 徐刚
 * @date 2021/4/17
 */
public class Dog extends Animal {
    String color = "黑色";

    @Override
    void eat() {
        System.out.println("吃....");
    }

    void printColor() {
        System.out.println(color);
        System.out.println(super.color);

    }

    void bark() {
        System.out.println("汪汪汪。。。");
    }

    void work() {
        super.eat();
        bark();
    }

    Dog() {
        System.out.println("狗狗来了");
    }
}
