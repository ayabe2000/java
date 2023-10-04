/**
 * タンクに水をためるシミュレーション
 * @author 喜多 
 * @version 3.0
 */
public class TankCalculator3{
/**
 * タンクの底面積,単位はm**2
 */
    final double TANK_AREA = 20.0;
/**
 * タンクの初期水位,単位はm
 */
    final double INITIAL_TANK_LEVEL = 10.0;
/**
 * タンクへの流入量パターン,一秒毎,単位はm**3/s
 */
    double flow[] = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0};
/**
 * タンクへの流入量(m**3/s)を得る。
 * @param t 時刻，単位は秒
 * @return その時刻の流入量，単位は mm*3/s
 */

    public double getFlow(double t){
        int index = (int)t % flow.length;
        return flow[index];
    }

/**
 * タンクの状態を標準出力に書き出す。
 * @param time 時刻
 * @param flow 流入量
 * @param tankLevel 水位
 */

    public void report(double time, double flow, double tankLevel){
        System.out.println(time + "," + flow + "," + tankLevel);
    }

    public static void main(String args[]){
        TankCalculator3 calculator = new TankCalculator3();
        final int MAX_TIME = 50;
        double tankLevel[] = new double[MAX_TIME+1];
        tankLevel[0] = calculator.INITIAL_TANK_LEVEL;
        System.out.println("Time(s), Flow(m**3/s), Tank Level(m)");
        for (int i = 0; i < MAX_TIME; i++){
            double time = i;
            tankLevel[i+1] = tankLevel[i] + calculator.getFlow(time) / calculator.TANK_AREA;
            calculator.report(time, calculator.getFlow(time), tankLevel[i]);
        }
        double finalTime = MAX_TIME;
        calculator.report(finalTime, 0.0, tankLevel[MAX_TIME]);
    }
}
