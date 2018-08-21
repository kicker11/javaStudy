package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		final int i1 = -5;
		final int i2 = +11;
		final int i3 = i1;

		int ii1 = i1;
		int ii2 = i2;
		int ii3 = i3;
		int ii4 = 0;

		int iii3 = i3;
		int iii4 = 0;

		System.out.println("i1 = " + ii1);
		System.out.println("i2 = " + ii2);
		System.out.println("i3 = " + ii3);

		// i4 = i3 + 1 ;
		ii4 = ++ii3;
		System.out.println(String.format("ii4 = ++ii3 : ii4 = %d  and ii3 = %d", ii4, ii3));

		int ii5 = ii3++;
		System.out.println(String.format("ii5 = ii3++ : ii5 = %d  and ii3 = %d", ii5, ii3));
		
		System.out.println("\n");

		iii3 = i3;
		iii4 = 0;

		while (iii4 <= 0) {
			iii4 = ++iii3;
			// System.out.println("[++V] i4 = " + i4 + " , i3 = " + i3);
			System.out.println(String.format("[++V] iii4 =  %d , iii3 = %d", iii4, iii3));
		}
		System.out.println("\n");

		iii3 = i3;
		iii4 = 0;

		while (iii4 <= 0) {
			iii4 = iii3++;
			System.out.println(String.format("[V++] iii4 =  %d , iii3 = %d", iii4, iii3));
		}
	}

}
