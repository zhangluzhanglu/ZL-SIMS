package simsutil;

/**
 * @author 张路 qq:1758658975
 * @version 0.0.1
 * @创建时间 2018年5月28日 下午5:17:59
 * @描述 向数组末尾添加新的元素，新元素是单个的元素也可以是另一个数组
 */
public class ArrayManager {
	/**
	 * @描述 向数组末尾添加新的元素，新元素是单个的元素
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
	 * @描述  重载函数，向数组末尾添加新的元素，新元素是一个数组
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
