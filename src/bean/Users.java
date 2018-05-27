package bean;

/**
 * @author 张路 qq:1758658975
 * @version 0.0.1
 * @创建时间 2018年5月27日 下午6:59:10
 * @类说明
 */
public class Users {

	private String username;
	private String password;

	/**
	 * Users(): Users类的无参构造函数
	 */
	public Users() {
		super();
	}

	/**
	 * @param username
	 *            用户名
	 * @param password
	 *            密码
	 */
	public Users(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
