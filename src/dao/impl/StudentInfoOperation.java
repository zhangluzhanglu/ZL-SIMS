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

	/**
	 * 无参构造函数：在此函数中给studentLists分配内存
	 */
	public StudentInfoOperation() {
		studentLists = new LinkedList<StudentInfoBean>(); // Java中的对象必须要分配了内存后才能使用
	}

	/**
	 * init方法：初始化studentLists集合的值
	 */
	@Override
	public List<StudentInfoBean> init(int n) {
		StudentInfoBean studentObj = new StudentInfoBean();
		for (Long num = 10000l; num < 10000 + n; num++) {
			studentObj.setNumber(num);
			studentObj.setName("学生" + num);
			studentObj.setAge((int) Math.round(Math.random() * 7 + 16));
			studentObj.setSex('男');
			studentObj.setHeight((int) Math.round(Math.random() * 40 + 150));
			studentObj.setIdentify("学生");
			studentObj.setAddress("中国");
			studentObj.setSpeciality("唱歌");
			studentObj.setDepartment("计算机系");
			studentObj.setMajor("软件工程");
			studentObj.setClassNum("2017" + num);
			studentLists.add(studentObj);
			studentObj = new StudentInfoBean();
		}
		return studentLists;
	}

	/**
	 * add方法：向studentLists集合中添加一个元素
	 */
	@Override
	public int add(StudentInfoBean studentObj) {
		studentLists.add(studentObj);
		return studentLists.size();
	}

	/**
	 * delete方法：向studentLists集合中删除一个元素
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
	 * update方法：向studentLists集合中修改一个元素
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
	 * query方法：通过传入的value,对studentLists集合中每个元素的每个字段进行模糊查询，返回结果集合。
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
	 * clear方法：清空集合，返回新的集合长度。
	 */
	@Override
	public int clear() {
		studentLists.clear();
		return studentLists.size();
	}

	/**
	 * setToNull方法：将这个集合对象设置为null。
	 */
	@Override
	public boolean setToNull() {
		studentLists = null;
		return studentLists == null;
	}

	/**
	 * queryAll方法：直接返回这个集合对象。
	 */
	@Override
	public List<StudentInfoBean> queryAll() {
		// TODO Auto-generated method stub
		return studentLists;
	}

	public static void main(String[] args) {
		//对这些方法进行测试
		StudentInfoOperation ss = new StudentInfoOperation();
		ss.init(10);
		for (StudentInfoBean s : ss.queryAll()) {
			System.out.println(s.toString());
		}
		// StudentInfoBean studentObj = new StudentInfoBean();
		// studentObj.setNumber(10009l);
		// studentObj.setName("学生");
		// studentObj.setAge((int) Math.round(Math.random() * 7 + 16));
		// studentObj.setSex('男');
		// studentObj.setHeight((int) Math.round(Math.random() * 40 + 150));
		// studentObj.setIdentify("学生");
		// studentObj.setAddress("中国");
		// studentObj.setSpeciality("唱歌");
		// studentObj.setDepartment("计算机系");
		// studentObj.setMajor("软件工程");
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
