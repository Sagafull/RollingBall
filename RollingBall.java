package Lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RollingBall extends JPanel implements ActionListener{

    public RollingBall(){

    }
    
    public void paintComponent(Graphics g){
        g.drawOval(getWidth()/2-40,getHeight()/2-50, 100, 100);

        g.fillArc(getWidth()/2-40,getHeight()/2-50,100,100,0,180);
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }



}
    

