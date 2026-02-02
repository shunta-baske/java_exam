import java.util.ArrayList;
import java.util.List;

public class Exam3 {
    public static void main(String[] args) {
        List<Department>list = new ArrayList<>();
        
        list.add(new Department("後藤", 31));
        list.add(new Department("山田",28));
        list.add(new Department("佐藤", 25));
        list.add(new Department("田中", 19));

        for(Department name :list){
            System.out.println(name.getName()+"("+name.getAge()+"歳)");
        }
    }
}
