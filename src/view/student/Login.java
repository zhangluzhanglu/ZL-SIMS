package view.student;

/**
* @author ��·   qq:1758658975
* @version 0.0.1
* @����ʱ�� 2018��5��27�� ����7:27:31
* @���� ��½������
*/
import java.awt.Container;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;// ���л�.Ϊ�˱��ְ汾�ļ����ԣ����ڰ汾����ʱ�����л��Ա��ֶ����Ψһ

	// ����Ҫ�õ������
	private JPanel jpanel1;// �������
	private JLabel usernameJLable;// ���ֱ�ǩ���û���
	private JTextField usernameJTextField;// �ı����û���
	private JLabel passwordJLabel;// ���ֱ�ǩ������
	private JPasswordField passwordJPasswordField;// �ı�������
	private JButton loginJButton;// ��½��ť
	private JButton resetJButton;// ��½��ť

	/**
	 * @throws HeadlessException
	 */
	public Login() throws HeadlessException {
		super();

		// ��ʼ�������
		jpanel1 = new JPanel();
		jpanel1.setLayout(null);// ���ò���NULL

		usernameJLable = new JLabel("�������û��� :   ", JLabel.RIGHT);
		usernameJLable.setToolTipText("�������û���...");
		usernameJLable.setBounds(250, 200, 100, 30);
		usernameJTextField = new JTextField(20);
		usernameJTextField.setBounds(350, 200, 200, 30);

		passwordJLabel = new JLabel("���������� :   ", JLabel.RIGHT);
		passwordJLabel.setBounds(250, 270, 100, 30);
		passwordJPasswordField = new JPasswordField(20);
		passwordJPasswordField.setEchoChar('*');
		passwordJPasswordField.setBounds(350, 270, 200, 30);

		loginJButton = new JButton("��½");
		loginJButton.setBounds(300, 340, 80, 30);
		loginJButton.addActionListener(this);// Ϊ��½��ť�����¼�������
		
		resetJButton = new JButton("����");
		resetJButton.setBounds(430, 340, 80, 30);
		resetJButton.addActionListener(this);// Ϊ��½��ť�����¼�������
		
		

		// ����������봰����
		Container container = this.getContentPane();// ��ȡ��������������
		container.add(jpanel1);

		jpanel1.add(usernameJLable);
		jpanel1.add(usernameJTextField);
		jpanel1.add(passwordJLabel);
		jpanel1.add(passwordJPasswordField);
		jpanel1.add(resetJButton);
		jpanel1.add(loginJButton);

		// ���ô����һЩ��Ϣ
		this.setTitle("ѧ����Ϣ����ϵͳ");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(800, 600);
		this.setLocation(250, 50);
		this.setVisible(true);
		this.setResizable(false);// �����С���ɱ�
	}

	public static void main(String[] args) {
		new Login();
	}

	/**
	 * actionPerformed(ActionEvent e) :�¼�����
	 */
	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == loginJButton) // �����¼
		{
			// ��ȡ�û���������
			String unsername = usernameJTextField.getText();
			String password = String.valueOf(passwordJPasswordField.getPassword());
			System.out.println(unsername);
			System.out.println(password);
		}
		if (e.getSource() == resetJButton) // �������
		{
			// ����û���������
			usernameJTextField.setText("");
			passwordJPasswordField.setText("");

		}
	}
}
