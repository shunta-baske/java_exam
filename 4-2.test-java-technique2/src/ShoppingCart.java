import java.util.LinkedList;
import java.util.List;

public class ShoppingCart extends LinkedList{

    int total = 0;
    public int getTotalPrice(LinkedList<> list){
        // List<Integer>total = new LinkedList<>();
        // total += price;
        
        for(int price : list){
            total += price;
            return total;
        }

    }

    public int getAveragePrice(){

    }
}
