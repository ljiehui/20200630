/**
 * Created by Administrator on 2020/6/29.
 */
public class Test {
    static double playground = 800;//800M的操场
    static double rest = 200;//休息
    static double A = 40;//A的速度是40米/分钟
    static double B = 60;//B的速度是60米/分钟

    static double ADistance = 0;//A总路程
    static double BDistance = 0;//B总路程

    static double ASubsection = 0;//A统计休息
    static double BSubsection = 0;//B统计休息

    static int ADate = 0;//判断A是否需要停留时间
    static int BDate = 0;//判断B是否需要停留时间

    /**
     * 在一个长800M的操场上，
     * A B两个人在同一个地点，同时同方向出发，
     * A的速度是40米/分钟，B的速度是60米/分钟，
     * 两个人都是每走200米休息两分钟
     * 请问，B比A多走一圈追上A需要多少时间 （结果保留两位小数即可）
     */
    public static void main(String[] args) {
        realization();
    }

    /**
     *
     */
    private static void realization(){
        for (int i = 1; i <= 100000; i++){//i为每分钟
            algorithm(i);
            if (BDistance - ADistance >= playground){
                System.out.println("B比A多走一圈追上A需要"+i+"时间");
                break;
            }
        }
        System.out.println("程序结束！");
    }

    /**
     * 实现算法
     */
    private static void algorithm(int date){
        System.out.println("当前时间："+date+"分钟");
        if(ADate==0){
            ADistance += A;
            ASubsection +=A;
            if(ASubsection >= rest){//每走200米休息两分钟
                ASubsection = ASubsection - rest;
                ADate ++;
                System.out.println("A当前走了"+ADistance+"米,下两分钟休息");
            }else{
                System.out.println("A当前一共走了"+ADistance+"米");
            }
        }else if(ADate == 2){
            ADate = 0;
            System.out.println("A当前休息，走了"+ADistance+"米,下会开始走");
        }else {
            ADate++;
            System.out.println("A当前休息，走了"+ADistance+"米");
        }

        if(BDate==0){
            BDistance += B;
            BSubsection +=B;
            if(BSubsection >= rest){//每走200米休息两分钟
                BSubsection = BSubsection - rest;
                BDate ++;
                System.out.println("B当前走了"+BDistance+"米,下两分钟休息");
            }else {
                System.out.println("B当前一共走了"+BDistance+"米");
            }
        }else if(BDate == 2){
            BDate = 0;
            System.out.println("B当前休息，走了"+BDistance+"米,下会开始走");
        }else {
            BDate ++;
            System.out.println("B当前休息，走了"+BDistance+"米");
        }
    }
}
