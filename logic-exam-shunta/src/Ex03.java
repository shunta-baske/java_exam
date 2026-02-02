public class Ex03 {
    public static void main(String[] args) {
        int time = 1900;

        int time2 = time / 100 +1;

        if (time % 100 == 0) {
            time2 = time2-1;
        } 

        System.out.println(time + "年は" + time2 + "世紀です");
    }
}
