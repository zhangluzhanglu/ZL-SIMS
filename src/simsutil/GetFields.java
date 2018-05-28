package simsutil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import bean.StudentInfoBean;

/**
 * @author ��· qq:1758658975
 * @version 0.0.1
 * @����ʱ�� 2018��5��28�� ����3:23:29
 * @���� ��ȡ��ǰ��������������������̳ж������ࣩ
 */
public class GetFields {
	public String[] getAllField(String classType) {
		if (classType.equals("StudentInfoBean")) {
			List<Field> fieldList = new ArrayList<>();
			Class<?> tempClass = StudentInfoBean.class;
			while (tempClass != null) {// ������Ϊnull��ʱ��˵�����������ϲ�ĸ���(Object��).
				fieldList.addAll(Arrays.asList(tempClass.getDeclaredFields()));
				tempClass = tempClass.getSuperclass(); // �õ�����,Ȼ�󸳸��Լ�
			}
			String[] FieldArray=new String[fieldList.size()];
			int i=0;
			 for (Field f : fieldList) {
				 FieldArray[i++]=f.getName();
			 }
			return FieldArray;
		}
		return null;
	}

	public static void main(String[] args) {
		new GetFields().getAllField("StudentInfoBean");
	}
}
