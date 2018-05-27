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

	/**
	 * �޲ι��캯�����ڴ˺����и�studentLists�����ڴ�
	 */
	public StudentInfoOperation() {
		studentLists = new LinkedList<StudentInfoBean>(); // Java�еĶ������Ҫ�������ڴ�����ʹ��
	}

	/**
	 * init��������ʼ��studentLists���ϵ�ֵ
	 */
	@Override
	public List<StudentInfoBean> init(int n) {
		StudentInfoBean studentObj = new StudentInfoBean();
		for (Long num = 10000l; num < 10000 + n; num++) {
			studentObj.setNumber(num);
			studentObj.setName("ѧ��" + num);
			studentObj.setAge((int) Math.round(Math.random() * 7 + 16));
			studentObj.setSex('��');
			studentObj.setHeight((int) Math.round(Math.random() * 40 + 150));
			studentObj.setIdentify("ѧ��");
			studentObj.setAddress("�й�");
			studentObj.setSpeciality("����");
			studentObj.setDepartment("�����ϵ");
			studentObj.setMajor("�������");
			studentObj.setClassNum("2017" + num);
			studentLists.add(studentObj);
			studentObj = new StudentInfoBean();
		}
		return studentLists;
	}

	/**
	 * add��������studentLists���������һ��Ԫ��
	 */
	@Override
	public int add(StudentInfoBean studentObj) {
		studentLists.add(studentObj);
		return studentLists.size();
	}

	/**
	 * delete��������studentLists������ɾ��һ��Ԫ��
	 */
	@Override
	public int delete(Long number) {
		for (StudentInfoBean s : studentLists) {
			if (s.getNumber().equals(number)) {
				studentLists.remove(s);
				break;
			}
		}
		return studentLists.size();
	}

	/**
	 * update��������studentLists�������޸�һ��Ԫ��
	 */
	@Override
	public int update(StudentInfoBean studentObj) {
		int index = 0;
		for (int i = 0; i < studentLists.size(); i++) {
			if (studentLists.get(i).getNumber().equals(studentObj.getNumber())) {
				studentLists.set(i, studentObj);
				index = i;
				break;
			}
		}
		return index;
	}

	/**
	 * query������ͨ�������value,��studentLists������ÿ��Ԫ�ص�ÿ���ֶν���ģ����ѯ�����ؽ�����ϡ�
	 */
	@Override
	public List<StudentInfoBean> query(String value) {
		List<StudentInfoBean> resultList = new LinkedList<>();
		for (StudentInfoBean s : studentLists) {
			if (s.getNumber().toString().indexOf(value) != -1) {
				resultList.add(s);
			} else if (s.getName().indexOf(value) != -1) {
				resultList.add(s);
			} else if (("" + s.getAge()).indexOf(value) != -1) {
				resultList.add(s);
			} else if (("" + s.getSex()).indexOf(value) != -1) {
				resultList.add(s);
			} else if (("" + s.getHeight()).indexOf(value) != -1) {
				resultList.add(s);
			} else if (s.getIdentify().indexOf(value) != -1) {
				resultList.add(s);
			} else if (s.getAddress().indexOf(value) != -1) {
				resultList.add(s);
			} else if (s.getSpeciality().indexOf(value) != -1) {
				resultList.add(s);
			} else if (s.getDepartment().indexOf(value) != -1) {
				resultList.add(s);
			} else if (s.getMajor().indexOf(value) != -1) {
				resultList.add(s);
			} else if (s.getClassNum().indexOf(value) != -1) {
				resultList.add(s);
			}
		}
		return resultList;
	}

	/**
	 * clear��������ռ��ϣ������µļ��ϳ��ȡ�
	 */
	@Override
	public int clear() {
		studentLists.clear();
		return studentLists.size();
	}

	/**
	 * setToNull��������������϶�������Ϊnull��
	 */
	@Override
	public boolean setToNull() {
		studentLists = null;
		return studentLists == null;
	}

	/**
	 * queryAll������ֱ�ӷ���������϶���
	 */
	@Override
	public List<StudentInfoBean> queryAll() {
		// TODO Auto-generated method stub
		return studentLists;
	}

	public static void main(String[] args) {
		//����Щ�������в���
		StudentInfoOperation ss = new StudentInfoOperation();
		ss.init(10);
		for (StudentInfoBean s : ss.queryAll()) {
			System.out.println(s.toString());
		}
		// StudentInfoBean studentObj = new StudentInfoBean();
		// studentObj.setNumber(10009l);
		// studentObj.setName("ѧ��");
		// studentObj.setAge((int) Math.round(Math.random() * 7 + 16));
		// studentObj.setSex('��');
		// studentObj.setHeight((int) Math.round(Math.random() * 40 + 150));
		// studentObj.setIdentify("ѧ��");
		// studentObj.setAddress("�й�");
		// studentObj.setSpeciality("����");
		// studentObj.setDepartment("�����ϵ");
		// studentObj.setMajor("�������");
		// studentObj.setClassNum("2017");
		// ss.add(studentObj);
		// ss.update(studentObj);
		// ss.delete(10009l);
		// ss.clear();
		// System.out.println(ss.setToNull());
		// System.out.println("\n\n----------------------------\n\n");
		// for (StudentInfoBean s : ss.queryAll()) {
		// System.out.println(s.toString());
		// }
	}

}
