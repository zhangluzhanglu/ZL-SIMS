package dao.impl;

import bean.Users;
import dao.InterfaceUserOperation;

/**
 * @author 张路 qq:1758658975
 * @version 0.0.1
 * @创建时间 2018年5月27日 下午7:11:00
 * @描述 对用户操作接口的实现
 */
public class UsersOperation implements InterfaceUserOperation {

	/**
	 * login:登陆验证
	 */
	@Override
	public boolean login(Users user) {
		if (user.getUsername().equals("admin") && user.getPassword().equals("123456"))
			return true;
		else
			return false;
	}

}
