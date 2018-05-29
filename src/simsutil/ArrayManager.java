package simsutil;

/**
 * @author ��· qq:1758658975
 * @version 0.0.1
 * @����ʱ�� 2018��5��28�� ����5:17:59
 * @���� ������ĩβ����µ�Ԫ�أ���Ԫ���ǵ�����Ԫ��Ҳ��������һ������
 */
public class ArrayManager {
	/**
	 * @���� ������ĩβ����µ�Ԫ�أ���Ԫ���ǵ�����Ԫ��
	 */
	public Object[] AddElementToArray(Object[] oldArray, Object obj) {
		Object[] columnNames = new Object[oldArray.length + 1];
		for (int i = 0; i < columnNames.length; i++) {
			if (i == columnNames.length - 1)
				columnNames[i] = obj;
			else
				columnNames[i] = oldArray[i];
		}
		return columnNames;
	}

	/**
	 * @����  ���غ�����������ĩβ����µ�Ԫ�أ���Ԫ����һ������
	 */
	public Object[] AddElementToArray(Object[] oldArray, Object[] oldArray1) {
		Object[] columnNames = new Object[oldArray.length + oldArray1.length];
		for (int i = 0; i < oldArray.length; i++) {
			columnNames[i] = oldArray[i];
		}
		for (int j = 0; j < oldArray1.length; j++) {
			columnNames[oldArray.length + j] = oldArray1[j];
		}
		return columnNames;
	}

	public static void main(String[] args) {
		Object[] array = { 1, 2, 3, 4 };
		Object[] array1 = { 5, 6, 7, 8 };
		Object[] newArray = (new ArrayManager().AddElementToArray(array, array1));
		for (Object i : newArray) {
			System.out.println((int) i);
		}
	}
}
