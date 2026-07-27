package com.array.book;

public class Book {
	public static void main(String[] args) {
		books book = new books();
//		book.arrayforBook();
//		book.arrayforshowbook();

		VarArg v = new VarArg();
		int a = v.vararg(1, 2, 3, 4, 5);
		System.out.println(a);

	}

}
