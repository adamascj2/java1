import java.applet.*;
import java.awt.*;
 
public class catalogo extends Applet{
  Panel p1;
  Panel p2;
  Panel p3;
  Choice ch1;
  TextField t1;
  Button b1;
  lista l;
   
  
 public catalogo(){
  setLayout(new BorderLayout());
  l = new lista(); 
  
  p1 = new Panel();
  p1.setBackground(Color.yellow);
  add("North",p1);
  ch1 = new Choice();
  ch1.addItem("maria");
  ch1.addItem("eduardo");
  ch1.addItem("carlos");
  p1.add(ch1);

  p2 = new Panel();
  p2.setBackground(Color.yellow);
  add("Center",p2); 
  b1 = new Button("RAMAL");
  p2.add(b1); 

   p3 = new Panel();
   p3.setBackground(Color.yellow);
   add("South",p3);
   t1 = new TextField(5);
   p3.add(t1);
  }
   public boolean action(Event evt, Object arg){
    
    if("RAMAL".equals(arg)){ 
     if(ch1.getSelectedItem()== "maria" )t1.setText(l.maria.ramal); 
     if(ch1.getSelectedItem()== "eduardo" )t1.setText(l.eduardo.ramal);   
     if(ch1.getSelectedItem()== "carlos" )t1.setText(l.carlos.ramal);   
       
     
    }
    return true;
  }
}
  
  