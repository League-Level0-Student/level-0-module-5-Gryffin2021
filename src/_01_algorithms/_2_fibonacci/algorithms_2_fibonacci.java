package _01_algorithms._2_fibonacci;

public class algorithms_2_fibonacci {
public static void main(String[] args) {
int number1=0;
int number2=1;
int temp = number2;
int sum =number1+number2;
System.out.println(number1);
System.out.println(number2);
System.out.println(sum);
for(int i = 1; i <= 11; i ++) {
	temp=number2;
	number1=temp;
	number2=sum;
	sum = number1 + number2;
	System.out.println(sum);
	
}
}
}
