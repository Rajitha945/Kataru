package org.test;

public class Mutabble {
    
	public static void main(String[] args) {
		String S1 = "Rajitha";
		String S2 = "Rajitha";
		System.out.println(System.identityHashCode(S1));
		System.out.println(System.identityHashCode(S2));
		String S = S1.concat(S2);
		System.out.println(S);
		System.out.println(System.identityHashCode(S));
		StringBuffer X1 = new StringBuffer("Rakesh");
		System.out.println(System.identityHashCode(X1));
		StringBuffer X2 = new StringBuffer("Lakshmi");
	X1.append(X2);
	System.out.println(System.identityHashCode(X1));
	}

}
