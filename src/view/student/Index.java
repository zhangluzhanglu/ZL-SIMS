package view.student;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @author ��· qq:1758658975
 * @version 0.0.1
 * @����ʱ�� 2018��5��28�� ����11:40:46
 * @���� ��½�ɹ������ҳ
 */
public class Index extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Index frame = new Index();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Index() {
		setTitle("ѧ����Ϣ�б�");
		setBounds(100, 100, 240, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		String[] columnNames = { "A", "B" };// ��������������
		// ��������������
		String[][] tableValues = { { "A1", "B1" }, { "A2", "B2" }, { "A3", "B3" }, { "A4", "B4" }, { "A5", "B5" } };
		// ����ָ�����������ݵı��
		JTable table = new JTable(tableValues, columnNames);
		// ������ʾ���Ĺ������
		JScrollPane scrollPane = new JScrollPane(table);
		// �����������ӵ��߽粼�ֵ��м�
		getContentPane().add(scrollPane, BorderLayout.CENTER);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
