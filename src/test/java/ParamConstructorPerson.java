/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class ParamConstructorPerson {
    String name;
    int age;

    public ParamConstructorPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void out() {
        System.out.println("姓名 " + name + " 年龄 " + age);
    }

    public static void main(String[] args) {
        ParamConstructorPerson p1 = new ParamConstructorPerson("徐刚", 18);
        p1.out();
        ParamConstructorPerson p2 = new ParamConstructorPerson("神丽", 18);
        p2.out();
    }
}
