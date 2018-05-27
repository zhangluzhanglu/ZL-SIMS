package dao;

import java.util.List;

/**
 * @author ��· qq:1758658975
 * @version 0.0.1
 * @����ʱ�� 2018��5��26�� ����10:21:43
 * @��˵�� ����ѧ����Ϣ�����ĳ���ӿ�
 */
public interface InterfaceStudentInfoOperation<T> {

	public List<T> init(int n);// ��ʼ��list,�������ɵ�list����

	public int add(T studentObj);// ������Ӻ�list������

	public int delete(Long number);// ����ɾ����list������

	public int update(T studentObj);// ���ر��޸ĵĶ�����list������±�

	public List<T> query(String value);// ��ѯ����Ϊһ���ַ��������ز�ѯ����list���ϣ��˷������ÿ���ֶν���ģ����ѯ��

	public List<T> queryAll();// ��ѯ����list����

	public int clear();// ���list����,������պ�����ݳ���

	public boolean setToNull();// ��list���϶�������Ϊnull

}
