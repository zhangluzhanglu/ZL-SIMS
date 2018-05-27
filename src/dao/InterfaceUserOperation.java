/**
 * 
 */
package dao;

import bean.Users;

/**
 * @author 张路 qq:1758658975
 * @version 0.0.1
 * @创建时间 2018年5月27日 下午7:05:33
 * @描述 对于用户信息操作的相关接口，如登陆等
 */

public interface InterfaceUserOperation {
	public boolean login(Users user);// 登陆操作
}
