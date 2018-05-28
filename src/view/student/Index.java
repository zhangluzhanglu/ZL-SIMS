package view.student;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.List;

import javax.naming.CommunicationException;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import bean.StudentInfoBean;
import dao.impl.StudentInfoOperation;
import simsutil.GetFields;

/**
 * @author ��· qq:1758658975
 * @version 0.0.1
 * @����ʱ�� 2018��5��28�� ����11:40:46
 * @���� ��½�ɹ������ҳ
 */
public class Index extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Index frame = new Index(new JFrame("test"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public Index(JFrame frame) {
		// ���õ�ǰ�����һЩ������Ϣ
		frame.dispose();
		setTitle("ѧ����Ϣ�б�");
		this.setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ��ȡ���ݵı�ͷ
		GetFields fieldsObj = new GetFields();
		String[] fieldArray = fieldsObj.getAllField("StudentInfoBean");
		String[] columnNames = fieldArray;
		// ��������������
		// ����������ת��Ϊ����
		for (int i = 0; i < columnNames.length; i++) {
			switch (columnNames[i]) {
			case "number":
				columnNames[i] = "���";
				break;
			case "department":
				columnNames[i] = "Ժϵ";
				break;
			case "major":
				columnNames[i] = "רҵ";
				break;
			case "classNum":
				columnNames[i] = "�༶";
				break;
			case "name":
				columnNames[i] = "����";
				break;
			case "age":
				columnNames[i] = "����";
				break;
			case "sex":
				columnNames[i] = "�Ա�";
				break;
			case "height":
				columnNames[i] = "���";
				break;
			case "identify":
				columnNames[i] = "���";
				break;
			case "speciality":
				columnNames[i] = "�س�";
				break;
			case "address":
				columnNames[i] = "��ַ";
				break;
			default:
				break;
			}
		}

		// ��ʼ��ȡ���ݽ��м���
		StudentInfoOperation infoOperation = new StudentInfoOperation(); // ʵ����ѧ����Ϣ���ݲ�������
		List<StudentInfoBean> studentList = infoOperation.init(100); // ͨ���˶���ʵ������ʼ����

		// ��������������
		String[][] tableValues = new String[studentList.size()][fieldArray.length];
		int rows = 0;
		for (StudentInfoBean s : studentList) {
			tableValues[rows++] = s.toString().split(",");
		}
		// ����ָ�����������ݵı��
		JTable table = new JTable(tableValues, columnNames);
		// ������ʾ���Ĺ������
		JScrollPane scrollPane = new JScrollPane(table);
		// �����������ӵ��߽粼�ֵ��м�
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
