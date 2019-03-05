package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import pkgHelper.LatinSquare;

public class LatinSquareTest {

	@Test
	public void doesElementExist_Test1() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int iValue = 5;
		boolean bExpected = true;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);

		assertEquals(bExpected, bActual);

	}

	@Test
	public void doesElementExist_Test2() {

		int[] arr = { 1, 2, 3, 4, 5 };
		int iValue = 8;
		boolean bExpected = false;
		boolean bActual = LatinSquare.doesElementExist(arr, iValue);

		assertEquals(bExpected, bActual);

	}

	@Test
	public void hasDuplicates_test1() {

		int[] arr = { 1, 2, 3, 4, 5 };

		boolean bExpected = false;
		boolean bActual = LatinSquare.hasDuplicates(arr);

		assertEquals(bExpected, bActual);

	}

	@Test
	public void hasDuplicates_test2() {

		int[] arr = { 1, 2, 3, 4, 1 };

		boolean bExpected = true;
		boolean bActual = LatinSquare.hasDuplicates(arr);

		assertEquals(bExpected, bActual);

	}

	@Test
	public void hasDuplicates_test3() {

		int[] arr1 = { 1, 2, 3, 4, 1 };
		int[] arr2 = { 1, 2, 3, 4, 1 };

		boolean bExpected = true;
		boolean bActual = LatinSquare.hasDuplicates(arr1);

		assertEquals(bExpected, bActual);

	}
	
	@Test
	public void containsZero_test1() {
		int[][] arr = 
			{{0,1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
		LatinSquare lq = new LatinSquare(arr);
		assertEquals(true, lq.containsZero());
	}
	
	@Test
	public void containsZero_test2() {
		int[][] arr = 
			{{9,1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
		LatinSquare lq = new LatinSquare(arr);
		assertEquals(false, lq.containsZero());
	}
	
	@Test
	public void getColumn_test1() {
		int[][] arr = 
			{{9,1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
		int[] col = {9,1,1,1,1,1,1,1,1};
		LatinSquare lq = new LatinSquare(arr);
		assertEquals(Arrays.equals(col, lq.getColumn(0)), true);
	}
	
	@Test
	public void getColumn_test2() {
		int[][] arr = 
			{{9,1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
		int[] col = {9,1,1,1,1,1,1,1,1};
		LatinSquare lq = new LatinSquare(arr);
		assertEquals(Arrays.equals(col, lq.getColumn(1)), false);
	}
	
	@Test
	public void getRow_test1() {
		int[][] arr = 
			{{9,1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
		int[] row = {9,1,2,3,4,5,6,7,8};
		LatinSquare lq = new LatinSquare(arr);
		assertEquals(Arrays.equals(row, lq.getRow(0)), true);
		
	}
	
	@Test
	public void getRow_test2() {
		int[][] arr = 
			{{9,1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
		int[] row = {9,1,2,3,4,5,6,7,8};
		LatinSquare lq = new LatinSquare(arr);
		assertEquals(Arrays.equals(row, lq.getRow(1)), false);
		
	}
	
	@Test
	public void hasAllValues_test1() {
		int[] arr1 = {0,1,2,3,4,5,6,7,8,9};
		int[] arr2 = {9,8,7,6,5,4,3,2,1,0};
		
		assertEquals(true, LatinSquare.hasAllValues(arr1, arr2));
		
	}
	
	@Test
	public void hasAllValues_test2() {
		int[] arr1 = {0,1,2,3,4,5,6,7,8,9};
		int[] arr2 = {11,8,7,6,5,4,3,2,1,0};
		
		assertEquals(false, LatinSquare.hasAllValues(arr1, arr2));
		
	}
	
	@Test
	public void isLatinSquare_test1() {
		int[][] arr = 
			{{9,1,2,3,4,5,6,7,8},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
		LatinSquare lq = new LatinSquare(arr);
		
		assertEquals(lq.isLatinSquare(), false);
	}
	
	@Test
	public void isLatinSquare_test2() {
		int[][] arr = 
			{{1,1,1,3,4,5,6,7,8},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},
					{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9},{1,2,3,4,5,6,7,8,9}};
		LatinSquare lq = new LatinSquare(arr);
		
		assertEquals(lq.isLatinSquare(), false);
	}
	
	@Test
	public void isLatinSquare_test3() {
		int[][] arr = {{1,2,3}, {2,3,1}, {3,1,2}};
		LatinSquare lq = new LatinSquare(arr);
		
		assertEquals(lq.isLatinSquare(), true);
	}
	
	@Test
	public void isLatinSquare_test4() {
		int[][] arr = {{1,2,3}, {2,3,1}, {3,1,0}};
		LatinSquare lq = new LatinSquare(arr);
		
		assertEquals(lq.isLatinSquare(), false);
	}
}