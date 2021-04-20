/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class WithoutThisStudent {
    String name;
    int age;

    WithoutThisStudent(String name1, int age1) {
        name = name1;
        age = age1;
    }

    void out() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        WithoutThisStudent s1 = new WithoutThisStudent("徐刚", 18);
        WithoutThisStudent s2 = new WithoutThisStudent("神丽", 18);
        s1.out();
        s2.out();
    }
}
