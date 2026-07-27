package com.array.book;

public class VarArg {
     
		public int vararg(int ... n) {
			int i = 0;
				for(int el:n) {
					i +=el;
				}
				return i;
		}
	}


