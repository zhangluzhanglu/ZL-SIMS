package dao.impl;

import bean.Users;
import dao.InterfaceUserOperation;

/**
 * @author ��· qq:1758658975
 * @version 0.0.1
 * @����ʱ�� 2018��5��27�� ����7:11:00
 * @���� ���û������ӿڵ�ʵ��
 */
public class UsersOperation implements InterfaceUserOperation {

	/**
	 * login:��½��֤
	 */
	@Override
	public boolean login(Users user) {
		if (user.getUsername().equals("admin") && user.getPassword().equals("123456"))
			return true;
		else
			return false;
	}

}
