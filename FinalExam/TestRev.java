import java.util.Arrays;
public class TestRev {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list1 = {1,2,3,4,5,6,7,8,9,10};
		int[] list2 = {1,2,3,4,5,6,7,8,9,10,11};
		System.out.println("before reverse");
		System.out.println("list1:" + Arrays.toString(list1));
		System.out.println("list2:" + Arrays.toString(list2));
		System.out.println("after invoking reverse");
		reverse(list1);
		System.out.println("list1:" + Arrays.toString(list1));
		reverse(list2);
		System.out.println("list2:" + Arrays.toString(list2));
	}
	public static void reverse(int[] lst) {
		int[] list = new int[lst.length];
		int j = 0;
		for (int i = lst.length - 1; i >= 0; i--) {
			list[j] = lst[i];
			j++;
		}
		for (int i = 0; i < lst.length; i++) {
			lst[i] = list[i];
		}
	}
}