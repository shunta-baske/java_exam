public class Exam6 {
    public static void main(String[] args) {
        System.out.println(calc(5, 3, "-"));
    }

    static int calc(int i,int j,String k){
        if (k="+") {
            int result = i+j;            
        }else if(k="-"){
            int result = i-j;
        }else if(k="*"){
            int result = i*k;
        }else{
            int result = -1;
        }
    }


}
