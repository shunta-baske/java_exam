public class Exam6 {
    public static void main(String[] args) {
        System.out.println(calc(15, 5, '/'));
    }

        
    static int calc(int i,int j,char k){
        
        int result;
        if (k=='+'){
             result = i+j;  
            //  return result;          
        }else if(k=='-'){
             result = i-j;
            //  return result;
        }else if(k=='*'){
             result = i*j;
            //  return result;
        }else if (k=='/'){
             result = i/j;
            //  return result;
        }else{
             result = -1;
            //  return result;
        }

        // int result = i k j;
        return result;

    }


}
