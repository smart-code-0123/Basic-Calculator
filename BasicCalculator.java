import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator extends Frame implements ActionListener
{
    TextField display;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bc, bcc, ba, bs, bm, bd, bt;

    BasicCalculator()
    {
        display=new TextField();
        display.setBounds(50,50,379,75);
        display.setBackground(Color.GREEN);

        b0=new Button("0");
        b0.setBounds(50,435,80,80);
        b0.addActionListener(this);

        b1=new Button("1");
        b1.setBounds(50,135,80,80);
        b1.addActionListener(this);

        b2=new Button("2");
        b2.setBounds(150,135,80,80);
        b2.addActionListener(this);

        b3=new Button("3");
        b3.setBounds(250,135,80,80);
        b3.addActionListener(this);

        b4=new Button("4");
        b4.setBounds(50,235,80,80);
        b4.addActionListener(this);

        b5=new Button("5");
        b5.setBounds(150,235,80,80);
        b5.addActionListener(this);

        b6=new Button("6");
        b6.setBounds(250,235,80,80);
        b6.addActionListener(this);

        b7=new Button("7");
        b7.setBounds(50,335,80,80);
        b7.addActionListener(this);

        b8=new Button("8");
        b8.setBounds(150,335,80,80);
        b8.addActionListener(this);

        b9=new Button("9");
        b9.setBounds(250,335,80,80);
        b9.addActionListener(this);

        ba=new Button("+");
        ba.setBounds(350,135,80,80);
        ba.addActionListener(this);

        bs=new Button("-");
        bs.setBounds(350,235,80,80);
        bs.addActionListener(this);

        bm=new Button("X");
        bm.setBounds(350,335,80,80);
        bm.addActionListener(this);

        bd=new Button("/");
        bd.setBounds(350,435,80,80);
        bd.addActionListener(this);

        bt=new Button("=");
        bt.setBounds(150,435,80,80);
        bt.addActionListener(this);

        bc=new Button("C");
        bc.setBounds(350,335,80,80);
        bc.addActionListener(this);

        bcc=new Button("Clear");
        bcc.setBounds(350,335,80,80);
        bcc.addActionListener(this);

        add(b0);
        add(b7);
        add(b8);
        add(b9);

        add(b4);
        add(b5);
        add(b6);
        add(b1);
        add(b2);
        add(b3);

        add(ba);
        add(bs);
        add(bm);
        add(bd);
        add(bt);
        add(bc);
        add(bcc);
        add(display);
        setSize(500,570);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            String ex=display.getText();
            ex+="1";
            display.setText(ex);
        }
        if(e.getSource()==b2)
        {
            String ex=display.getText();
            ex+="2";
            display.setText(ex);
        }
        if(e.getSource()==b3)
        {
            String ex=display.getText();
            ex+="3";
            display.setText(ex);
        }
        if(e.getSource()==b4)
        {
            String ex=display.getText();
            ex+="4";
            display.setText(ex);
        }
        if(e.getSource()==b5)
        {
            String ex=display.getText();
            ex+="5";
            display.setText(ex);
        }
        if(e.getSource()==b6)
        {
            String ex=display.getText();
            ex+="6";
            display.setText(ex);
        }
        if(e.getSource()==b7)
        {
            String ex=display.getText();
            ex+="7";
            display.setText(ex);
        }
        if(e.getSource()==b8)
        {
            String ex=display.getText();
            ex+="8";
            display.setText(ex);
        }
        if(e.getSource()==b9)
        {
            String ex=display.getText();
            ex+="9";
            display.setText(ex);
        }
        if(e.getSource()==b0)
        {
            String ex=display.getText();
            ex+="0";
            display.setText(ex);
        }
        if(e.getSource()==bcc)
        {
            String ex=display.getText();
            display.setText("0");
        }
        if(e.getSource()==bt)
        {
            String ex=display.getText();
            ex+="0";
            display.setText(ex);
        }
    }
    public static void main(String[] args)
    {
        new BasicCalculator();
    }
}