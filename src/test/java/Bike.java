import java.util.ArrayList;
import java.util.List;

/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class Bike {
    List<String> list;

    {
        list = new ArrayList<>();
        list.add("徐刚");
        list.add("神丽");
    }


    public static void main(String[] args) {
        System.out.println(new Bike().list);
    }
}
