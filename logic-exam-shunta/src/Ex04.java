public class Ex04 {
    public static void main(String[] args) {
        
        int year = 1445;


        boolean result = Ex04_1.yearSet2(year);

        if (result) {
            System.out.println(year+"年はうるう年です");
        }else{
            System.out.println(year+"年はうるう年ではありません");
        }


  
}
      
        public static boolean yearSet2(int year){
            
            if (year%400==0) {
                check = true;
            }else if (year%100==0) {
                check = false;
            }else if (year%4==0) {
                check = true;
            }else{
                check = false;
            }            
            return check;
        
    }
}
