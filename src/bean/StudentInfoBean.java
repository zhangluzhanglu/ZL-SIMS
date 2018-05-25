package bean;

/**
 * @author 张路 qq:1758658975
 * @version 创建时间：2018年5月25日 下午5:35:45 类说明:学生信息类，封装了学生信息
 */
public class StudentInfoBean {

	private String number;// 学号
	private String name; // 名字
	private int age; // 年龄
	private char sex; // 性别
	private double height;// 身高
	private String department;// 所属院系
	private String major;// 专业
	private String classNum;// 班级
	private String address;// 地址
	private String speciality;// 特长

	/**
	 * @param number
	 *            学号
	 * @param name
	 *            名字
	 * @param age
	 *            年龄
	 * @param sex
	 *            性别
	 * @param height
	 *            身高
	 * @param department
	 *            所属院系
	 * @param major
	 *            专业
	 * @param classNum
	 *            班级
	 * @param address
	 *            地址
	 * @param speciality
	 *            特长
	 */
	public StudentInfoBean(String number, String name, int age, char sex, double height, String department,
			String major, String classNum, String address, String speciality) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.height = height;
		this.department = department;
		this.major = major;
		this.classNum = classNum;
		this.address = address;
		this.speciality = speciality;
	}

	/**
	 * 
	 */
	public StudentInfoBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the sex
	 */
	public char getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(char sex) {
		this.sex = sex;
	}

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the department
	 */
	public String getDepartment() {
		return department;
	}

	/**
	 * @param department
	 *            the department to set
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
	 * @param major
	 *            the major to set
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
	 * @param classNum
	 *            the classNum to set
	 */
	public void setClassNum(String classNum) {
		this.classNum = classNum;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the speciality
	 */
	public String getSpeciality() {
		return speciality;
	}

	/**
	 * @param speciality
	 *            the speciality to set
	 */
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

}
