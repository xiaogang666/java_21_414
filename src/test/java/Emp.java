/**
 * @author 徐刚
 * @date 2021/4/17
 */
class Emp extends Person {
    float salary;

    Emp(int id, String name, float salary) {
        super(id, name);
        this.salary = salary;
    }

    void display() {
        System.out.println(id + " " + name + " " + salary);
    }
}
