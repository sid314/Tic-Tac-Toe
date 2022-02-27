package TicTacToe;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame implements ActionListener
{
    JFrame frame;
    JButton one,two,three,four,five,six,seven,eight,nine;
    JPanel panel;
    JTextArea output;
    public GUI(){
    frame = new JFrame();
    one=new JButton();
    two=new JButton();
    three=new JButton();
    four=new JButton();
    five=new JButton();
    six=new JButton();
    seven=new JButton();
    eight=new JButton();
    nine=new JButton();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
