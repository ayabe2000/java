public class Sample701 {
    public static void main(String[] args){
        SampleClass02 s = new SampleClass02();
        // method1()は、privateなので、外部からはアクセスできない
        // s.method1();
        // method2呼び出し
        s.method2();
        // method3呼び出し
        s.method3();
        //numは、privateフィールドなので外部からアクセスできない
        //s.num =1;
    }
}
