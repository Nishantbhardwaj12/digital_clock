import javax.swing.*;
import java.text.*;
import java.util.*;  
public class digitalclock implements Runnable{  
JFrame f;  
Thread t=null;  
int hours=0, minutes=0, seconds=0;  
String timeString = "";  
JButton b;  
  
digitalclock(){  
    f=new JFrame();  
      
    t = new Thread(this);  
        t.start();  
      
    b=new JButton();  
        b.setBounds(500,300,500,250);  
      
    f.add(b);  
    f.setSize(1000,1000);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
   
 public void run() {  
      try {  
         while (true) {  
  
            Calendar cal = Calendar.getInstance();  
            hours = cal.get( Calendar.HOUR_OF_DAY );  
            if ( hours > 12 ) hours -= 12;  
            minutes = cal.get( Calendar.MINUTE );  
            seconds = cal.get( Calendar.SECOND );  
  
            SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss");  
            Date date = cal.getTime();  
            timeString = formatter.format( date );  
  
            printTime();  
  
            Thread.sleep( 1000 );  // interval given in milliseconds  
         }  
      }  
      catch (Exception e) { }  
 }  
  
public void printTime(){  
b.setText(timeString);  
}  
  
public static void main(String[] args) {  
    new digitalclock();  
   
          
  
}  
}

//desgined by nishant bhardwaj