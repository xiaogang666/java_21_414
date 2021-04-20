/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class CopyValuePerson {
    String name;
    int age;

    CopyValuePerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    CopyValuePerson() {
    }

    void out() {
        System.out.println("姓名 " + name + " 年龄 " + age);
    }

    public static void main(String[] args) {
        CopyValuePerson p1 = new CopyValuePerson("徐刚", 18);
        p1.out();
        CopyValuePerson p2 = new CopyValuePerson();
        p2.name = p1.name;
        p2.age = p1.age;
        p2.out();
    }
}
