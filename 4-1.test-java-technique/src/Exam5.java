import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2000, 1, 4);
        int birthYear = localDate.getYear();
        int birthMonth = localDate.getMonthValue();
        int birthDay = localDate.getDayOfMonth();

        System.out.println("私の誕生日は"+birthYear+"年"+birthMonth+"月"+birthDay+"日です");
    }
}
