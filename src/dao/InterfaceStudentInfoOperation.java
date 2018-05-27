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

	public int delete(Long number);// 返回删除后list的总数

	public int update(T studentObj);// 返回被修改的对象在list里面的下标

	public List<T> query(String value);// 查询参数为一个字符串，返回查询出的list集合（此方法会对每个字段进行模糊查询）

	public List<T> queryAll();// 查询所有list集合

	public int clear();// 清空list集合,返回清空后的数据长度

	public boolean setToNull();// 将list集合对象设置为null

}
