package com.Jha.OOP.InnerClass;

import javax.swing.*;

public class GuiDemo {
    public static void main(String[] args) {
        JFrame jf=new JFrame();
        JPanel jp=new JPanel();
        JButton jb=new JButton("点击");
       /* jb.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(jp,"芜湖！！起飞！！");
            }
        });*/
        jb.addActionListener((e)-> {
            JOptionPane.showMessageDialog(jp, "芜湖！！起飞！！");
        });
        jf.add(jp);
        jp.add(jb);
        jf.setSize(400,400);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
