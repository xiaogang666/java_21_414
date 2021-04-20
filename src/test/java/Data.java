/**
 * @author 徐刚
 * @date 2021/4/16
 */
class Data {
    ThisAsConstrutorParam param;

    Data(ThisAsConstrutorParam param) {
        this.param = param;
    }

    void out() {
        System.out.println(param.count);
    }
}