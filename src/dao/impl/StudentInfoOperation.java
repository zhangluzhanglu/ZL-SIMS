package dao.impl;

import dao.InterfaceStudentInfoOperation;

import java.util.LinkedList;
import java.util.List;
import bean.StudentInfoBean;

/**
 * @author ��· qq:1758658975
 * @version 0.0.1
 * @����ʱ�� 2018��5��27�� ����10:33:26
 * @��˵��
 */
public class StudentInfoOperation implements InterfaceStudentInfoOperation<StudentInfoBean> {
	private List<StudentInfoBean> studentLists;

	@Override
	public List<StudentInfoBean> init(int n) {
		studentLists=new LinkedList<StudentInfoBean>(); //Java�еĶ������Ҫ�������ڴ�����ʹ��
		StudentInfoBean studentObj = new StudentInfoBean();
		for (Long num = 10000l; num < 10000 + n; num++) {
			studentObj.setNumber(num);
			studentObj.setName("ѧ��" + num);
			studentObj.setAge(19);
			studentObj.setSex('��');
			studentObj.setHeight(1.73);
			studentObj.setIdentify("ѧ��");
			studentObj.setAddress("�й�");
			studentObj.setSpeciality("����");
			studentObj.setDepartment("�����ϵ");
			studentObj.setMajor("�������");
			studentObj.setClassNum("2017" + num);
			this.studentLists.add(studentObj);
			studentObj = new StudentInfoBean();
		}
		return this.studentLists;
	}

	@Override
	public int add(StudentInfoBean studentObj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String number) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(StudentInfoBean studentObj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<StudentInfoBean> query(Object obj) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		StudentInfoOperation ss=new StudentInfoOperation();
		System.out.println(ss);
		List<StudentInfoBean> sstudentLists=ss.init(10);
		for(StudentInfoBean s : sstudentLists){
			System.out.println(s.toString());
		}
	}
}
