package dao.impl;

import dao.InterfaceStudentInfoOperation;

import java.util.LinkedList;
import java.util.List;
import bean.StudentInfoBean;

/**
 * @author 张路 qq:1758658975
 * @version 0.0.1
 * @创建时间 2018年5月27日 上午10:33:26
 * @类说明
 */
public class StudentInfoOperation implements InterfaceStudentInfoOperation<StudentInfoBean> {
	private List<StudentInfoBean> studentLists;

	@Override
	public List<StudentInfoBean> init(int n) {
		studentLists=new LinkedList<StudentInfoBean>(); //Java中的对象必须要分配了内存后才能使用
		StudentInfoBean studentObj = new StudentInfoBean();
		for (Long num = 10000l; num < 10000 + n; num++) {
			studentObj.setNumber(num);
			studentObj.setName("学生" + num);
			studentObj.setAge(19);
			studentObj.setSex('男');
			studentObj.setHeight(1.73);
			studentObj.setIdentify("学生");
			studentObj.setAddress("中国");
			studentObj.setSpeciality("唱歌");
			studentObj.setDepartment("计算机系");
			studentObj.setMajor("软件工程");
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
