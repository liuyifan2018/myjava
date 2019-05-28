/**
 * java自定义窗口
 */
package com.mch0dm1n.seticon;
import java.util.*; //引入

import javax.swing.JFrame; //引入

public class test extends JFrame {
    public test() {
        this.setTitle("百度窗体");
        this.setBounds(300, 200, 580, 600);
        this.setSize(580, 600);
        this.setLocation(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new test();
    }
}