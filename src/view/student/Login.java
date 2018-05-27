package view.student;

/**
* @author 张路   qq:1758658975
* @version 0.0.1
* @创建时间 2018年5月27日 下午7:27:31
* @描述 登陆界面类
*/
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;// 序列化.为了保持版本的兼容性，即在版本升级时反序列化仍保持对象的唯一
	
	// 声明要用到的组件
	JPanel jpanel;// 容器组件
	JButton jbutton;// 按钮
	JLabel jlable;// 文字标签
	

	/**
	 * @throws HeadlessException
	 */
	public Login() throws HeadlessException {
		super();
		

		//初始化各组件
		jpanel = new JPanel();
		jpanel.setLayout(null);//设置布局NULL  
		
		jbutton = new JButton("登陆");
		jbutton.setBounds(138, 26, 90, 30); 
		
		jlable=new JLabel("请输入密码");
		jlable.setBounds(50, 50, 100, 50); 

		//将各组件放入窗体中
		this.add(jpanel);

		jpanel.add(jbutton);
		jpanel.add(jlable);
		
		
		//设置窗体的一些信息
		this.setTitle("学生信息管理系统--登陆");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setExtendedState(MAXIMIZED_BOTH);
		this.setVisible(true);

		

	}

	public static void main(String[] args) {
		new Login();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
