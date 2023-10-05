// 変数とその単位を明確化
//収入 'income:￥/month(月あたりの円)
//支出 'expense':￥/month(月あたりの円)
//貯金残高'balance':￥
//経過月数'monthsPassed':month(月)

//ストックを計算する式
//newBalance = balance + (income - expense)* monthsPassed

//javaプログラムの変数、定数の型と名前
//収入:doble income = 100000.0;
//支出: double expense = 50000.0;
//初期預金残高:double balance = 200000.0;
//経過月数:int monthsPassed = 2;
//新しい預金残高double newBalance;

public class BankCalculator{
    public static void main(String args[]){
        double income = 100000.0;
        double expense = 50000.0;
        double balance = 200000.0;
        int monthsPassed =2;
        
        double newBalance = balance + (income - expense) * monthsPassed;
        System.out.println("New balance after " + monthsPassed + "months =" + newBalance + "￥");
    }
}