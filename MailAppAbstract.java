package lesson7;

import lesson7.model.A;
import lesson7.model.B;
import lesson7.model.C;

public class MailAppAbstract {

	public static void main(String[] args) {

		C c = new C();
		// c
		B b = new C();
		// b
		A a = new A();
		// a
		A[] aArr = new A[5];

		aArr[0] = a;
		aArr[1] = b;
		aArr[2] = c;

		Object[] oArr = new Object[5];
		oArr[0] = a;
		oArr[1] = b;
		oArr[2] = c;
		oArr[3] = "HelloWorld!";
		oArr[4] = 2018;

		//!!!!!!!!!
		for (int i = 0; i < oArr.length; i++) {

			if (oArr[i] instanceof B) {

				B bb = (B) oArr[i];
				bb.greetUser();
			}
		}

		System.out.println();

	}

}
