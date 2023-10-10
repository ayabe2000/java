
public class Sample402 {
 
    public static void main(String[] args) {
        //  forの二重ループ
        for(int i = 1;i <= 2;i++){
            for(int j = 1; j <=3 ; j++){
                int k = i + j;
                System.out.print(i+"+" + j +  "=" + k +" ");
            }
            System.out.println();
        }
    }
}