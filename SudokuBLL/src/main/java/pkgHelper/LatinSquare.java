package pkgHelper;

import java.util.Arrays;

public class LatinSquare {

	private int[][] LatinSquare;

	public LatinSquare() {
		super();
	}

	public LatinSquare(int[][] puzzle) {
		super();
		LatinSquare = puzzle;
	}

	public int[][] getLatinSquare() {
		return LatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}

	public static boolean doesElementExist(int[] arr, int iValue) {
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == iValue) {
				return true;
			}
		}

		return false;
	}

	public static boolean hasDuplicates(int[] arr) {
		int[] arrCopy = Arrays.copyOf(arr, arr.length);

		Arrays.sort(arrCopy);

		for (int i = 0; i < arr.length - 1; i++) {
			if (arrCopy[i] == arrCopy[i + 1]) {
				return true;
			}
		}

		return false;
	}

	public static boolean hasAllValues(int[] arr1, int[] arr2) {

		boolean hasAllValues = true;
		for (int j = 0; j < arr2.length; j++) {

			boolean bFound = false;

			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[j]) {
					bFound = true;
					break;
				}

			}
			if (bFound == false) {
				hasAllValues = false;
				break;
			}
		}
		return hasAllValues;

	}
	
	public int[] getColumn(int iCol) {
		int[] arrCol = new int[this.LatinSquare.length];
		for(int i = 0; i < this.LatinSquare.length; i++) {
			arrCol[i] = this.LatinSquare[i][iCol];
		}
		return arrCol;
	}
	
	public int[] getRow(int iRow) {
		
		return this.LatinSquare[iRow];
	}
	
	public boolean isLatinSquare() {
		int[] row;
		int[] column;
		boolean isLatinSquare = true;
		for (int i = 0; i < this.LatinSquare.length; i++) {
			
			row = this.getRow(i);
			for (int j = 0; j < this.LatinSquare.length; j++) {
				column = this.getColumn(j);
				if (!hasAllValues(row, column)) {
					isLatinSquare = false;
					break;
				}
			}
			
			column = this.getColumn(i);
			
			if (hasDuplicates(row)) {
				isLatinSquare = false;
				break;
			}
			if (hasDuplicates(column)) {
				isLatinSquare = false;
				break;
			}
			
		}
		
		
		return isLatinSquare;
	}
	
	public boolean containsZero() {
		int[] row;
		boolean containsZero = false;
		
		for (int i = 0; i < this.LatinSquare.length; i++) {
			row = getRow(i);
			for(int j = 0; j < this.LatinSquare.length; j++) {
				if(row[j] == 0) {
					containsZero = true;
					break;
				}
			}
		}
			
		return containsZero;
	}

}