/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class StaticMethodStudent {
    String name;
    int age;
    static String school = "郑州大学";

    StaticMethodStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    static void change() {
        school = "河南大学";
    }

    void out() {
        System.out.println(name + " " + age + " " + school);
    }

    public static void main(String[] args) {
        StaticMethodStudent.change();
        StaticMethodStudent s1 = new StaticMethodStudent("徐刚", 18);
        StaticMethodStudent s2 = new StaticMethodStudent("神丽", 18);
        s1.out();
        s2.out();
    }
}
