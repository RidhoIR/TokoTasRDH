package view;

import javax.swing.*;
import java.awt.*;

public class FramePage_GUI extends JFrame {

    private JLabel hellolabel,numLabel;
    private JButton minBtn,plusBtn,tiga,satu,x2;
    private int number;

    public FramePage_GUI(){
        setTitle("Toko Tas");
//        setLayout(null);
        setSize(400,400);
        setLocation(400,200);

        component();
        event();
    }

    private void component(){
//        hellolabel = new JLabel("Toko Tas");
//        boundedAdd(hellolabel,147,187,105,27);

        minBtn = new JButton("+1");
        minBtn.setBounds(50,55,50,50);
        add(minBtn);

        plusBtn = new JButton("+3");
        plusBtn.setBounds(280,55,50,50);
        add(plusBtn);

        satu = new JButton("-1");
        satu.setBounds(50,150,50,50);
        add(satu);

        tiga = new JButton("-3");
        tiga.setBounds(280,150,50,50);
        add(tiga);

        x2 = new JButton("x2");
        x2.setBounds(164,200,50,50);
        add(x2);

        Font font;
        String numStr = String.valueOf(number);
        numLabel = new JLabel(numStr);
        font = new Font("serif",Font.BOLD,40);
        numLabel.setFont(font);
        numLabel.setHorizontalAlignment(SwingConstants.CENTER);
        numLabel.setBounds(115,50,140,55);
        add(numLabel);
    }

    private void event(){
        minBtn.addActionListener((event) ->{
            number +=1;

            String numstr = String.valueOf(number);
            numLabel.setText(numstr);
        });

        plusBtn.addActionListener((event) ->{
            number +=3;

            String numstr = String.valueOf(number);
            numLabel.setText(numstr);
        });

        satu.addActionListener((event) ->{
            number -=1;

            String numstr = String.valueOf(number);
            numLabel.setText(numstr);
        });

        tiga.addActionListener((event) ->{
            number -=3;

            String numstr = String.valueOf(number);
            numLabel.setText(numstr);
        });

        x2.addActionListener((event) ->{
            number *=2;

            String numstr = String.valueOf(number);
            numLabel.setText(numstr);
        });




    }



    protected void boundedAdd(Component comp, int x, int y, int width, int height){
        int constX = 15, constY = 55;
        x = x - (constX/2);
        y = y - (constY/2);
        width  = width + (constX/2);
        comp.setBounds(x,y,width,height);
        add(comp);
    }
}
