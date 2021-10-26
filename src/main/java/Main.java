import javax.swing.*;
import java.awt.*;

public class Main{

    public static class MyFrame extends JFrame{

        MyFrame(){

            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setBounds(0,0,600,600);
            this.getContentPane().setBackground(Color.white);
            this.setVisible(true);

        }

    }

    public static void main(String[] args){

        MyFrame myFrame = new MyFrame();

    }


}
