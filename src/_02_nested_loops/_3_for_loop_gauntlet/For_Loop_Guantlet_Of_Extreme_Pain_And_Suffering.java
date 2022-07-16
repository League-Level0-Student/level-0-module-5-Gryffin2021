package _02_nested_loops._3_for_loop_gauntlet;

public class For_Loop_Guantlet_Of_Extreme_Pain_And_Suffering {
public static void main(String[] args) {
	//SINGLE LOOPS
	//for(int i = 0; i <= 100; i ++) {
		//System.out.println(i);
	//}
//for(int i = 100; i >= 0; i --) {
		//System.out.println(i);
	//}
	//for(int i = 2; i <= 100; i += 2) {
		//System.out.println(i);
	//}
	//for(int i = 1; i <= 99; i += 2) {
		//System.out.println(i);
	//}
	//for(int i = 1; i <= 500; i ++) {
		//if(i % 2 == 0) {
		//System.out.println(i + " is even");
		//}else {
			//System.out.println(i + " is odd");
		//}
	//}
	//for(int i = 7; i <= 777; i += 7) {
		//System.out.println(i);
	//}
	//int year = 2010;
	//for(int i = 0; i <= 12; i ++) {
		//System.out.println("in " + year + ", I was " + i + " years old.");
		//year ++;
	//}
	//NESTED LOOPS
	//for(int i =0; i <= 2; i++) {
		//for(int i2 = 0; i2 <= 2; i2++) {
			//System.out.println(i + " " + i2);
			//if(i2 > 2) {
				//i2 = 0;
			//}
		//}
	//int i3 = 3;
	//for(int i = 1; i <= 7; i += 0) {
		//for(int i2 = 2; i2 <= 8; i2 += 3 ) {
			//System.out.println(i + " " +i2+ " " + i3);
			//i += 3;
			//i3 += 3;
		//}
	//}
	//int i3 = 1;
		//for(int i = 1; i <= 10; i ++) {
			//for(int i2 = 1; i2 <= 10; i2 += 1) {
				//System.out.print(i3 + " ");
				//i3 += 1;
			//}
			//System.out.println();
		//}
	//for(int i = 0; i < 6; i ++) {
		//for(int i2 = 0; i2 <= i; i2 ++) {
			//System.out.print("* ");
		//}
			//System.out.println();
	//}
	for(int i = 0; i <= 100; i ++) {
		System.out.print(100 - i +  " ");
		if(i % 10 == 0) {
			System.out.println();
		}
	}
	
}
}

