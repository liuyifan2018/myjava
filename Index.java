/**
 * java���ֵ�ж�
 */
package com.mch0dm1n.seticon;
import java.util.*; //����
import javax.swing.JFrame; //����
public class Index extends JFrame
{
    public static void main(String[] args)
    {
        System.out.println("��������λ���룺");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        switch(num)
        {
            case 8:
                System.out.println("��ϲ�㣬��������Ƚ���");
                break;
            case 88:
                System.out.println("��ϲ�㣬����˶��Ƚ���");
                break;
            case 888:
                System.out.println("��ϲ�㣬�����һ�Ƚ���");
                break;
            default:
                System.out.println("лл���룡");
                break;
        }
    }

//    public static void testFun(int num){
//        int c = 200;
//        c = c - num;
//        if(c>100)    //�ж��û�����������Ƿ����100
//            System.out.println("�������ִ���100");
//        else if(c==100)    //�ж��û�����������Ƿ����100
//            System.out.println("�������ֵ���100");
//        else if(c<100)    //�ж��û�����������Ƿ�С��100
//            System.out.println("��������С��100");
//        else
//            System.out.println("��������!");
//
//        System.out.println("�ܽ��" + c);
//    }
//    public static void main(String[] args)
//    {
//        System.out.println("������һ�����֣�");
//        Scanner input=new Scanner(System.in);
//        try{
//            int num=input.nextInt(); // ���ռ�����������
//            testFun(num);
//        }catch (InputMismatchException e){
//            input.nextLine();
//            System.out.println("���������һ�����֣�");
//            int num=input.nextInt(); // ���ռ�����������
//            testFun(num);
//        }
//    }
}