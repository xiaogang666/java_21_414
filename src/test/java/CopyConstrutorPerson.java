/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class CopyConstrutorPerson {
    String name;
    int age;

    CopyConstrutorPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    CopyConstrutorPerson(CopyConstrutorPerson person) {
        this.name = person.name;
        this.age = person.age;
    }

    void out() {
        System.out.println("姓名 " + name + " 年龄 " + age);
    }

    public static void main(String[] args) {
        CopyConstrutorPerson p1 = new CopyConstrutorPerson("徐刚", 18);
        p1.out();
        CopyConstrutorPerson p2 = new CopyConstrutorPerson(p1);
        p2.out();
    }


}
