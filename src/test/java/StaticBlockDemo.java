import java.util.ArrayList;
import java.util.List;

/**
 * @author 徐刚
 * @date 2021/4/16
 */
public class StaticBlockDemo {
    public static List<String> writes = new ArrayList<>();

    static {
        writes.add("徐刚1");
        writes.add("徐刚2");
        writes.add("徐刚3");
        System.out.println("第一块");
    }

    static {
        writes.add("神丽1");
        writes.add("神丽2");
        writes.add("神丽3");
        System.out.println("第二块");
    }
}
