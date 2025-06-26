package Lib;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RollingBall extends JPanel implements ActionListener{
    int Stang = 0;
    int x=getWidth();
   

    public RollingBall(){
        Timer t = new Timer(50, this);
        t.start();

    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawOval(x/2-40,getHeight()/2-50, 100, 100);

        g.fillArc(x/2-40,getHeight()/2-50,100,100,Stang,180);

    }

      @Override
    public void actionPerformed(ActionEvent e) {

   
        Stang-=10;
        

        if(x<=getWidth()*2+100)
        x=x+30;
        else
        x=0;

        

        repaint();

        
    }

    
  



}
    

