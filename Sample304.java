public class Sample304 {
    public static void main(String[] args){
        int dice = (int)(Math.random()*7)+1; //1から7までの乱数を発生させる
        // さいころの目を入力
        System.out.println("さいころの目:"+dice);
        // 値がさいころの目の範囲内かどうか調べる
        if (1 <= dice && dice <= 6){
            //　さいころの目が偶数か、奇数かで処理を分ける
            if (dice == 2 || dice == 4 || dice == 6){
                System.out.println("丁です"); //偶数なら丁
            }else{
                System.out.println("半です"); //奇数なら半
            }

        }else{
            System.out.println("範囲外の数値です");
        }
    }
}
