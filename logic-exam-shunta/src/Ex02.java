import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Ex02 {
    public static void main(String[] args) {
              

        LocalTime localTime = null;
        DateTimeFormatter dateTimeFormatter 
        = DateTimeFormatter.ofPattern("HH時mm分ss秒");

        


        int i =23;
        int j =59;
        int k =59;
        localTime = LocalTime.of(i, j, k);  

        LocalTime localTime2 = localTime.plusSeconds(1);
        String format1 = localTime.format(dateTimeFormatter);
        String format2 = localTime2.format(dateTimeFormatter);


        


        System.out.println(format1+"の1秒後は"+format2+"です");
    }
}
