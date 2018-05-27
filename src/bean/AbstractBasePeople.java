package bean;

/**
 * @author 张路 qq:1758658975
 * @version 0.0.1
 * @创建时间：2018年5月25日 下午5:35:45
 * @描述：包含角色基本信息的抽象基类
 */
public abstract class AbstractBasePeople {

	private String name; // 名字
	private int age; // 年龄
	private char sex; // 性别
	private double height;// 身高
	private String identify;// 身份
	private String speciality;// 特长
	private String address; // 地址

	public AbstractBasePeople() {
		super();
	}

	public AbstractBasePeople(AbstractBasePeople abstractBasePeople) {
		this.name = abstractBasePeople.name;
		this.age = abstractBasePeople.age;
		this.sex = abstractBasePeople.sex;
		this.height = abstractBasePeople.height;
		this.identify = abstractBasePeople.identify;
		this.speciality = abstractBasePeople.speciality;
		this.address = abstractBasePeople.address;
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
	 * @return the identify
	 */
	public String getIdentify() {
		return identify;
	}

	/**
	 * @param identify
	 *            the identify to set
	 */
	public void setIdentify(String identify) {
		this.identify = identify;
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
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "AbstractBasePeople [name=" + name + ", age=" + age + ", sex=" + sex + ", height=" + height
				+ ", identify=" + identify + ", speciality=" + speciality + ", address=" + address + "]";
	}
	
}
