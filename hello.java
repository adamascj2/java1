import java.applet.*;
import java.awt.*;

public class hello extends Applet{
 Panel p1;
 Label l1;

 public hello(){
  p1 = new Panel();
  p1.setBackground(Color.green);
  add(p1);
  l1 = new Label();
  p1.add(l1);
  l1.setText("HELLO WORLD!");
  }
}


