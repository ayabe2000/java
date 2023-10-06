public class SampleClass02 {
    // コンストラクタ
    public SampleClass02(){
        System.out.println("コンストラクタ");
    }
    // privateメソッド
    private void method1(){
        System.out.println("method1(private)");
    }
    // publicメソッド１
    public void method2(){
        System.out.println("method2(public)");
    }
    // publicメソッド２
    public void method3(){
        // privateメソッドの呼び出し
        method1();
        System.out.println("method3(public) : num=" + this.num);
    }
    // privateフィールド
    private int num = 1;

}
