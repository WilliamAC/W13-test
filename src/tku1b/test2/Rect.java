package tku1b.test2;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Rect extends Shape {

   public Rect(int x1, int y1, int x2, int y2, Color color1, Color color2, boolean filled){
      super(x1,y1,x2,y2,color1,color2,filled);
   }   
   
   public void draw(Graphics g){
     Graphics2D g2d = ( Graphics2D ) g;
     //g.setColor(color);
     gradient = true;
     if(gradient){
    	 g2d.setPaint( new GradientPaint( 5, 30, color1, 35, 100, color2, true ));  
     }else
         g2d.setPaint(color1);

     //g2d.setPaint(color);
     g2d.setStroke( new BasicStroke( 5.0f ) ); 
     if(filled)
       g2d.fillRect(Math.min(x1,x2),Math.min(y1,y2),Math.abs(x1-x2),Math.abs(y1-y2));
     else 
       g2d.drawRect(Math.min(x1,x2),Math.min(y1,y2),Math.abs(x1-x2),Math.abs(y1-y2));
   }

@Override
public String toString() {
	return "Rect [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2
			+ ", color1=" + color1 + ", color2=" + color2 + ", gradient="
			+ gradient + ", filled=" + filled + "]";
}
   
   
}
