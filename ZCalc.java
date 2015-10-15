import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

public class ZCalc extends JFrame{
	Container c;
	JButton ad, mi, mu, di, inv, res;
	JTextField in, out;
	JPanel pb, pt, pl;
	JLabel la;
	String s1, s2;
	double i, fl, r, o;
	
	public ZCalc(){
		super("Zakir's Calculator");
		c=getContentPane();
		pb=new JPanel();
		pt=new JPanel();
		pl=new JPanel();
		
		la=new JLabel("Enter input number and then click disered operation and then another input and finally the result button");
		
		ad=new JButton("Addition");
		mi=new JButton("Substraction");
		mu=new JButton("Multiplication");
		di=new JButton("Division");
		inv=new JButton("Inverse");
		res=new JButton("Result");
		/*
		ad=new JButton("+");
		mi=new JButton("-");
		mu=new JButton("*");
		di=new JButton("/");
		inv=new JButton("1/x");
		res=new JButton("=");
		*/
		in=new JTextField(30);
		out=new JTextField(10);
		out.setEditable(false);
		
		ad.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				s1=in.getText();
				i=Double.parseDouble(s1);
				fl=1;
				in.setText("0");
			}
		});
		
		mi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				s1=in.getText();
				i=Double.parseDouble(s1);
				fl=2;
				in.setText("0");
			}
		});
		
		mu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				s1=in.getText();
				i=Double.parseDouble(s1);
				fl=3;
				in.setText("0");
			}
		});
		
		di.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				s1=in.getText();
				i=Double.parseDouble(s1);
				fl=4;
				in.setText("0");
			}
		});
		
		inv.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				s1=in.getText();
				i=Double.parseDouble(s1);
				fl=5;
				in.setText("0");
			}
		});
		
		res.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				s2=in.getText();
				if(s2.equals("0")){
					if(fl==5){
						r=1/i;
					}
				}
				else{
					o=Integer.parseInt(s2);
					if(fl==1){
						r=i+o;
					}
					if(fl==2){
						r=i-o;
					}
					if(fl==3){
						r=i*o;
					}
					if(fl==4){
						r=i/o;
					}
				}
				in.setText("0");
				out.setText(""+r);
			}
		});
		
		pl.add(la);
		pt.add(in);
		pt.add(out);
		pb.add(ad);
		pb.add(mi);
		pb.add(mu);
		pb.add(di);
		pb.add(inv);
		pb.add(res);
		c.add(pl, BorderLayout.NORTH);
		c.add(pt, BorderLayout.CENTER);
		c.add(pb, BorderLayout.SOUTH);
	}
	
	public static void main(String args[]){
		ZCalc zc=new ZCalc();
		zc.setSize(600, 150);
		zc.setVisible(true);
	}
}