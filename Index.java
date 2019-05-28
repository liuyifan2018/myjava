/**
 * java输出值判断
 */
package com.mch0dm1n.seticon;
import java.util.*; //引入
import javax.swing.JFrame; //引入
public class Index extends JFrame
{
    public static void main(String[] args)
    {
        System.out.println("请输入座位号码：");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        switch(num)
        {
            case 8:
                System.out.println("恭喜你，获得了三等奖！");
                break;
            case 88:
                System.out.println("恭喜你，获得了二等奖！");
                break;
            case 888:
                System.out.println("恭喜你，获得了一等奖！");
                break;
            default:
                System.out.println("谢谢参与！");
                break;
        }
    }

//    public static void testFun(int num){
//        int c = 200;
//        c = c - num;
//        if(c>100)    //判断用户输入的数据是否大于100
//            System.out.println("余额的数字大于100");
//        else if(c==100)    //判断用户输入的数据是否等于100
//            System.out.println("余额的数字等于100");
//        else if(c<100)    //判断用户输入的数据是否小于100
//            System.out.println("余额的数字小于100");
//        else
//            System.out.println("错误类型!");
//
//        System.out.println("总金额" + c);
//    }
//    public static void main(String[] args)
//    {
//        System.out.println("请输入一个数字：");
//        Scanner input=new Scanner(System.in);
//        try{
//            int num=input.nextInt(); // 接收键盘输入数据
//            testFun(num);
//        }catch (InputMismatchException e){
//            input.nextLine();
//            System.out.println("输入必须是一个数字！");
//            int num=input.nextInt(); // 接收键盘输入数据
//            testFun(num);
//        }
//    }
}