/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package layoutsalone2;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author finito
 */
public class LayoutsAlone2 extends JFrame {
    JPanel panel1 = new JPanel();
    JButton b1 = new JButton("button1");
    JButton b2 = new JButton("button2");
    JButton b3 = new JButton("button3");
    
    JButton b4 = new JButton("button4");
    JButton b5 = new JButton("button5");
    JButton b6 = new JButton("button6");
    
    JButton b7 = new JButton("button7");
    JButton b8 = new JButton("button8");
    JButton b9 = new JButton("button9");
    
    JButton b10 = new JButton("button10");
    JButton b11 = new JButton("button11");
    JButton b12 = new JButton("button12");
    
   
    
    
    public LayoutsAlone2()
    {
        this.setBounds(400, 400, 400, 300);
        initComponent();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void initComponent()
    {
       /* GroupLayout layout = new GroupLayout(getContentPane());
        this.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        
        layout.setHorizontalGroup(
        layout.createSequentialGroup()
        .addComponent(b1)
        .addGroup(
                layout.createParallelGroup().addComponent(b2).addComponent(b5)
        ).addComponent(b3)
        );
        
       layout.setVerticalGroup(
        layout.createSequentialGroup()
        .addGroup(layout.createParallelGroup()
        .addComponent(b1).addComponent(b2).addComponent(b3)
        )
        .addComponent(b4)               
       );
       */
        GroupLayout layout = new GroupLayout(getContentPane());
        
        this.getContentPane().setLayout(layout);
        
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        layout.setHorizontalGroup(
                layout.createSequentialGroup()
                .addGroup(
                 layout.createParallelGroup().addComponent(b1).addComponent(b4).addComponent(b7)
                )
                .addGroup(
                layout.createParallelGroup().addComponent(b2).addComponent(b5).addComponent(b8)
                )
                .addGroup(
                layout.createParallelGroup().addComponent(b3).addComponent(b6).addComponent(b9)
                )
                
                .addContainerGap(10, Short.MAX_VALUE)
                
                );
        
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                .addGroup(
                layout.createParallelGroup().addComponent(b1).addComponent(b2).addComponent(b3)
                )
                .addGroup(
                layout.createParallelGroup().addComponent(b4).addComponent(b5).addComponent(b6)
                )
                .addGroup(
                layout.createParallelGroup().addComponent(b7).addComponent(b8).addComponent(b9)
                )
                        
                .addContainerGap(10, Short.MAX_VALUE)
                
                );
        
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new LayoutsAlone2().setVisible(true);
    }
    
}
