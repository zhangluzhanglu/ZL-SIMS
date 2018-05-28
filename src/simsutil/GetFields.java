package simsutil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import bean.StudentInfoBean;

/**
 * @author 张路 qq:1758658975
 * @version 0.0.1
 * @创建时间 2018年5月28日 下午3:23:29
 * @描述 获取当前类的所有属性名（包括继承而来的类）
 */
public class GetFields {
	public String[] getAllField(String classType) {
		if (classType.equals("StudentInfoBean")) {
			List<Field> fieldList = new ArrayList<>();
			Class<?> tempClass = StudentInfoBean.class;
			while (tempClass != null) {// 当父类为null的时候说明到达了最上层的父类(Object类).
				fieldList.addAll(Arrays.asList(tempClass.getDeclaredFields()));
				tempClass = tempClass.getSuperclass(); // 得到父类,然后赋给自己
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
