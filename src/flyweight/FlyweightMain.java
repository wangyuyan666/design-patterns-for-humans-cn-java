package flyweight;

public class FlyweightMain {
    public static void main(String[] args) {
        TeaMaker teaMaker = new TeaMaker();
        TeaShop teaShop = new TeaShop(teaMaker);

        teaShop.takeOrder("less sugar", 1);
        teaShop.takeOrder("more milk", 2);
        teaShop.takeOrder("without sugar", 5);

        teaShop.serve();
//        Serving tea to table# 1
//        Serving tea to table# 2
//        Serving tea to table# 5
    }
}
