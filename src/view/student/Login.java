package view.student;

/**
* @author ��·   qq:1758658975
* @version 0.0.1
* @����ʱ�� 2018��5��27�� ����7:27:31
* @���� ��½������
*/
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;// ���л�.Ϊ�˱��ְ汾�ļ����ԣ����ڰ汾����ʱ�����л��Ա��ֶ����Ψһ
	
	// ����Ҫ�õ������
	JPanel jpanel;// �������
	JButton jbutton;// ��ť
	JLabel jlable;// ���ֱ�ǩ
	

	/**
	 * @throws HeadlessException
	 */
	public Login() throws HeadlessException {
		super();
		

		//��ʼ�������
		jpanel = new JPanel();
		jpanel.setLayout(null);//���ò���NULL  
		
		jbutton = new JButton("��½");
		jbutton.setBounds(138, 26, 90, 30); 
		
		jlable=new JLabel("����������");
		jlable.setBounds(50, 50, 100, 50); 

		//����������봰����
		this.add(jpanel);

		jpanel.add(jbutton);
		jpanel.add(jlable);
		
		
		//���ô����һЩ��Ϣ
		this.setTitle("ѧ����Ϣ����ϵͳ--��½");
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
