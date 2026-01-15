public class Exam3 {
    public static void main(String[] args) {
        int a = 200;
        int b = 250;
        double tax = 0.1;
        int total = a*3+b*4;
        System.out.println("小計");
        System.out.println(total);
        System.out.println("消費税");
        System.out.println((int)(tax*total));
        System.out.println("合計金額");
        System.out.println(total+(int)(tax*total));
    }

}
