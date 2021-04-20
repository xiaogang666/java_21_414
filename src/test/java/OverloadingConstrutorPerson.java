/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class OverloadingConstrutorPerson {
    String name;
    int age;
    int sex;

    OverloadingConstrutorPerson(String name, int age, int sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    OverloadingConstrutorPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void out() {
        System.out.println("姓名 " + name + " 年龄 " + age + " 性别 " + sex);
    }

    public static void main(String[] args) {
        OverloadingConstrutorPerson p1 = new OverloadingConstrutorPerson("徐刚", 18, 1);
        p1.out();
        OverloadingConstrutorPerson p2 = new OverloadingConstrutorPerson("神丽", 18);
        p2.out();
    }

}
