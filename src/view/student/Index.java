package view.student;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import bean.StudentInfoBean;
import dao.impl.StudentInfoOperation;
import simsutil.GetFields;

/**
 * @author 张路 qq:1758658975
 * @version 0.0.1
 * @创建时间 2018年5月28日 上午11:40:46
 * @描述 登陆成功后的首页
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
		// 设置当前窗体的一些基本信息
		frame.dispose();
		setTitle("学生信息列表");
		this.setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 提取数据的表头
		GetFields fieldsObj = new GetFields();
		String[] fieldArray = fieldsObj.getAllField("StudentInfoBean");
		String[] columnNames = fieldArray;// 定义表格列名数组
		// 将列名数组转换为中文
		for (int i = 0; i < columnNames.length; i++) {
			switch (columnNames[i]) {
			case "number":
				columnNames[i] = "编号";
				break;
			case "department":
				columnNames[i] = "院系";
				break;
			case "major":
				columnNames[i] = "专业";
				break;
			case "classNum":
				columnNames[i] = "班级";
				break;
			case "name":
				columnNames[i] = "名字";
				break;
			case "age":
				columnNames[i] = "年龄";
				break;
			case "sex":
				columnNames[i] = "性别";
				break;
			case "height":
				columnNames[i] = "身高";
				break;
			case "identify":
				columnNames[i] = "身份";
				break;
			case "speciality":
				columnNames[i] = "特长";
				break;
			case "address":
				columnNames[i] = "地址";
				break;
			default:
				break;
			}
		}

		// 开始获取数据进行加载
		StudentInfoOperation infoOperation = new StudentInfoOperation(); // 实例化学生信息数据操作对象
		List<StudentInfoBean> studentList = infoOperation.init(100); // 通过此对象实例化初始数据

		// 定义表格数据数组
		String[][] tableValues = new String[studentList.size()][fieldArray.length];
		int rows = 0;
		for (StudentInfoBean s : studentList) {
			tableValues[rows++] = s.toString().split(",");
		}
		// 创建指定列名和数据的表格
		JTable table = new JTable(tableValues, columnNames);
		// 创建显示表格的滚动面板
		JScrollPane scrollPane = new JScrollPane(table);
		// 将滚动面板添加到边界布局的中间
		getContentPane().add(scrollPane, BorderLayout.CENTER);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
