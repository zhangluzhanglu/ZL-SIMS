package bean;

/**
 * @author ��· qq:1758658975
 * @version 0.0.1
 * @����ʱ�� 2018��5��27�� ����6:59:10
 * @��˵��
 */
public class Users {

	private String username;
	private String password;

	/**
	 * Users(): Users����޲ι��캯��
	 */
	public Users() {
		super();
	}

	/**
	 * @param username
	 *            �û���
	 * @param password
	 *            ����
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
