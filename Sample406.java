public class Sample406 {
    public static void main(String[] args){
        System.out.println("6が出たら終了");
        //無限ループ
        while(true){
            int dice = (int)(Math.random()*6)+1;
            System.out.println(dice);
            if(dice == 6){
                break; //ループから抜ける
            }

        }
        System.out.println("終了");
    }
}
