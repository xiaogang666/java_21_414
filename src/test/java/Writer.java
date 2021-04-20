/**
 * @author 徐刚
 * @date 2021/4/17
 */
public final class Writer {
    final String name;
    final int age;


    public Writer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    int getAge() {
        return age;
    }

    String getName() {
        return name;
    }
}
