
package bean;

/**
 * @author 张路 qq:1758658975
 * @version 0.0.1
 * @创建时间 2018年5月26日 下午9:56:52
 * @类说明 学生信息类
 */

public class StudentInfoBean extends AbstractBasePeople {

	private Long number;// 学号
	private String department;// 所属院系
	private String major;// 专业
	private String classNum;// 班级

	public StudentInfoBean() {
		super();
	}

	/**
	 * @param number
	 *            学生编号
	 * @param department
	 *            所属院系
	 * @param major
	 *            专业
	 * @param classNum
	 *            班级
	 */
	public StudentInfoBean(StudentInfoBean studentInfoBean) {
		super(studentInfoBean);
		this.number = studentInfoBean.number;
		this.department = studentInfoBean.department;
		this.major = studentInfoBean.major;
		this.classNum = studentInfoBean.classNum;
	}

	/**
	 * @return the number
	 */
	public Long getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(Long number) {
		this.number = number;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department the department to set
	 */
	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * @return the major
	 */
	public String getMajor() {
		return major;
	}

	/**
	 * @param major the major to set
	 */
	public void setMajor(String major) {
		this.major = major;
	}

	/**
	 * @return the classNum
	 */
	public String getClassNum() {
		return classNum;
	}

	/**
	 * @param classNum the classNum to set
	 */
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "StudentInfoBean [number=" + number + ", department=" + department + ", major=" + major + ", classNum="
				+ classNum + ", getName()=" + getName() + ", getAge()=" + getAge() + ", getSex()=" + getSex()
				+ ", getIdentify()=" + getIdentify() + ", getSpeciality()=" + getSpeciality() + ", getAddress()="
				+ getAddress() + ", getHeight()=" + getHeight() + "]";
	}


}
