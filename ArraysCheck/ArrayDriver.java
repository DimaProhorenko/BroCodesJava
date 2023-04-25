package ArraysCheck;

import java.util.Arrays;

public class ArrayDriver {
	
	static int min(int[] arr) {
		int minVal = arr[0];
		
		for (int i:arr) {
			if (minVal > i) {
				minVal = i;
			}
		}
		
		return minVal;
	}
	
	
	static void printArray(int[] arr) {
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	static int[] getArr() {
		return new int[] {1, 3, 5};
	}
	
	public static void main(String[] args) {
		int[] a = new int[5];
		
		for(int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		
		int[] b = {57, 234, 23, 22, 345,7, 546, 223,2,};
		
//		for (int i: b) {
//			System.out.println(i);
//		}
		
		int minBValue = min(b);
		
//		System.out.println(minBValue);
		
		
//		printArray(new int[] {2, 44, 5, 75});
		
//		printArray(getArr());
		
//		int[] x = getArr();
//		
//		for (int i = 0; i < x.length; i++) {
//			System.out.println(x[i]);
//		}
		
		
//		int[][] multi = {
//				{1, 2, 3},
//				{4, 5, 6, 9, 44, 278743},
//				{7, 8, 9}
//		};
//		
//		for (int[] arrEl : multi) {
//			for (int el : arrEl) {
//				System.out.print(el + " ");
//			}
//			System.out.println("\n-------------");
//		}
		
		
		
		
		int[] j = getArr();
		
//		Class c = j.getClass();
//		
//		System.out.println(c.getName());
		
		int[] l = new int[3];
		
//		System.arraycopy(j, 0, l, 0, l.length);
//		printArray(l);
//		System.out.println(Arrays.toString(b));
		
		
//		int[] single = {1, 2, 3};
//		int[] cloneSingle = single.clone();
//		
//		single[2] = 55;
//		
//		printArray(single);
//		printArray(cloneSingle);
		
		
		int[][] multiD = {
				{1, 2, 3},
				{4, 5, 6}
		};
		
		int[][] multiDClone = multiD.clone();
		
//		System.out.println(Arrays.toString(multiD));
//		
//		System.out.println(Arrays.toString(multiDClone));
		
		multiDClone[0][1] = 3248;
		
//		for (int[] arrEl:multiD) {
//			for (int el: arrEl) {
//				System.out.println(el);
//			}
//		}
		
//		System.out.println(multiD[0] == multiDClone[0]);
		
		
		
		int[][] firstM = {
				{1, 3, 4, 1},
				{3, 4, 5, 1}
		};
		
		int[][] secondM = {
				{1, 3, 4, 1},
				{3, 4, 5, 1}
		};
		
		int [][] addedM = new int[2][4];
		
		for (int i = 0; i < firstM.length; i++) {
			for (int j1 = 0; j1 < firstM[0].length; j1++) {
				addedM[i][j1] = firstM[i][j1] + secondM[i][j1];
				System.out.print(addedM[i][j1] + " ");
			}
			System.out.println("");
		}
		
	}
	
}

