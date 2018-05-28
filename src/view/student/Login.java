package view.student;

/**
* @author 张路   qq:1758658975
* @version 0.0.1
* @创建时间 2018年5月27日 下午7:27:31
* @描述 登陆界面类
*/
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import dao.impl.UsersOperation;
import bean.Users;
import view.student.Index;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;// 序列化.为了保持版本的兼容性，即在版本升级时反序列化仍保持对象的唯一

	// 声明要用到的组件
	private JPanel jpanel1;// 容器组件
	private JLabel usernameJLable;// 文字标签：用户名
	private JTextField usernameJTextField;// 文本域：用户名
	private JLabel passwordJLabel;// 文字标签：密码
	private JPasswordField passwordJPasswordField;// 文本域：密码
	private JButton loginJButton;// 登陆按钮
	private JButton resetJButton;// 登陆按钮

	/**
	 * @throws HeadlessException
	 */
	public Login() throws HeadlessException {
		super();

		// 初始化各组件
		jpanel1 = new JPanel();
		jpanel1.setLayout(null);// 设置布局NULL

		usernameJLable = new JLabel("请输入用户名 :   ", JLabel.RIGHT);
		usernameJLable.setToolTipText("请输入用户名...");
		usernameJLable.setBounds(250, 200, 100, 30);
		usernameJTextField = new JTextField(20);
		usernameJTextField.setBounds(350, 200, 200, 30);

		passwordJLabel = new JLabel("请输入密码 :   ", JLabel.RIGHT);
		passwordJLabel.setBounds(250, 270, 100, 30);
		passwordJPasswordField = new JPasswordField(20);
		passwordJPasswordField.setEchoChar('*');
		passwordJPasswordField.setBounds(350, 270, 200, 30);

		loginJButton = new JButton("登陆");
		loginJButton.setBounds(300, 340, 80, 30);
		loginJButton.addActionListener(this);// 为登陆按钮增加事件监听器

		resetJButton = new JButton("重置");
		resetJButton.setBounds(430, 340, 80, 30);
		resetJButton.addActionListener(this);// 为登陆按钮增加事件监听器

		// 将各组件放入窗体中
		Container container = this.getContentPane();// 获取窗体的最外层容器
		container.add(jpanel1);

		jpanel1.add(usernameJLable);
		jpanel1.add(usernameJTextField);
		jpanel1.add(passwordJLabel);
		jpanel1.add(passwordJPasswordField);
		jpanel1.add(resetJButton);
		jpanel1.add(loginJButton);

		// 设置窗体的一些信息
		this.setTitle("学生信息管理系统");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocation(250, 50);
		this.setVisible(true);
		this.setResizable(false);// 窗体大小不可变
	}

	public static void main(String[] args) {
		new Login();
	}

	/**
	 * actionPerformed(ActionEvent e) :事件集合
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == loginJButton) // 点击登录
		{
			// 获取用户名和密码
			String username = usernameJTextField.getText();
			String password = String.valueOf(passwordJPasswordField.getPassword());
		    boolean loginResult=new UsersOperation().login(new Users(username,password));//如果为true，表示登陆成功
		    System.out.println(loginResult);
		    if(loginResult){
		    	new Index(this);
		    }
		}
		if (e.getSource() == resetJButton) // 点击重置
		{
			// 清空用户名和密码
			usernameJTextField.setText("");
			passwordJPasswordField.setText("");

		}
	}
}
