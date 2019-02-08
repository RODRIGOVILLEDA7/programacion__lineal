import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Calculadora extends JPanel implements ActionListener{
       private JPanel[] panel;
       private JLabel[] etiq;
       private JTextField[] tex;
       private JButton[] bot;
       public Calculadora(){
              int i;
              panel= new JPanel[2];
              etiq= new JLabel[3];
              tex= new JTextField[3];
              bot= new JButton[4];
              panel[0]= new JPanel();
              panel[0].setLayout(new GridLayout(3,2));
              panel[1]=new JPanel();
              panel[1].setLayout(new GridLayout(1,4));
              setLayout(new GridLayout(2,1));
              etiq[0]= new JLabel("Numero 1");
              etiq[1]= new JLabel("Numero 2");
              etiq[2]= new JLabel("Resultado");
              
              bot[0]= new JButton("+"); 
              bot[1]= new JButton("-"); 
              bot[2]= new JButton("*"); 
              bot[3]= new JButton("/"); 
              for(i=0;i<3;++i){
		      tex[i]=new JTextField(10);
                      panel[0].add(etiq[i]);
                      panel[0].add(tex[i]);
                     }
              for(i=0;i<4;++i)
                      panel[1].add(bot[i]);
                    add(panel[0]);
                    add(panel[1]);
                  for(i=0;i<4;++i){
                  bot[i].addActionListener(this);
                   }
                 }
              public void actionPerformed(ActionEvent e){
                     int i;
                     double a,b,c;
                     try{
                     a=Double.parseDouble(tex[0].getText());
                     b=Double.parseDouble(tex[1].getText());
                     for(i=0;i<4;++i)
                     if(e.getSource()==bot[i])
                     switch(i){
                         case 0:
                         c=a+b;
                         tex[2].setText(""+c);
                         break;
                         case 1:
                         c=a-b;
                         tex[2].setText(""+c);
                         break;
                         case 2:
                         c=a*b;
                            tex[2].setText(""+c);
                         break;
                         case 3:
                         if(b==0)
                           tex[2].setText("Error, divicion entre cero"); 
                          else{
                                c=a/b;
                                tex[2].setText(""+c);
                               }
                           break;
                         }
                         }catch(Exception exc){
                          tex[2].setText("Error, introduce numeros");
                         }
                       }
              public static void main(String[]args){
                    JFrame ventana=new JFrame("Calculadora");
                    ventana.setSize(400,200);
                    ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    ventana.setContentPane(new Calculadora());
                    ventana.setVisible(true);
                  }
            }
                               
