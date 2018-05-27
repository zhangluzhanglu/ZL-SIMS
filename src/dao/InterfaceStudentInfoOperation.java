package dao;

import java.util.List;

/**
 * @author 张路 qq:1758658975
 * @version 0.0.1
 * @创建时间 2018年5月26日 下午10:21:43
 * @类说明 对于学生信息操作的抽象接口
 */
public interface InterfaceStudentInfoOperation<T> {

	public List<T> init(int n);// 初始化list,返回生成的list集合

	public int add(T studentObj);// 返回添加后list的总数

	public int delete(String number);// 返回删除后list的总数

	public int update(T studentObj);// 返回被修改的对象在list里面的下标

	public List<T> query(Object obj);// 查询参数为一个对象，返回查询出的list集合

}
