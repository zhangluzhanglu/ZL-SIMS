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
	 * @描述 向数组末尾添加新的元素，新元素是一个数组
	 */
	// public Object[] AddElementToArray(Object[] oldArray,Object[] obj[]) {
	// Object[] columnNames = new Object[oldArray.length + obj.length];
	// for (int i = 0; i < columnNames.length; i++) {
	// if (i >= oldArray.length)
	// columnNames[i] = obj[];
	// else
	// columnNames[i] = oldArray[i];
	// }
	// return columnNames;
	// }

	public static void main(String[] args) {
		Object[] array = { 1, 2, 3, 4 };
		Object[] newArray = (new ArrayManager().AddElementToArray(array, 5));
		for (Object i : newArray) {
			System.out.println((int) i);
		}
	}
}
