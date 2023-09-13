import javax.swing.*;
public class swing_lect
{
	swing_lect()
	{
		JFrame jf=new JFrame();
		jf.setTitle("CSAIML");
		JLabel jl=new JLabel("Click me!");
		jl.setBounds(10,100,100,30);
		jf.add(jl);
		String s[]={"Select","a","b","c","d"};
		JComboBox jc=new JComboBox(s);
		jc.setBounds(100,200,100,30);
		jf.add(jc);
		jf.setSize(400,400);
		jf.setLayout(null);
		jf.setVisible(true);
		
	}
	public static void main(String args[])
	{
		new swing_lect();
	}
}
