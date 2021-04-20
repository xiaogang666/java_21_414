/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class Student {
    String name;
    int age;
    static String school = "郑州大学";

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student s1 = new Student("徐刚", 18);
        Student s2 = new Student("神丽", 18);
    }
}
