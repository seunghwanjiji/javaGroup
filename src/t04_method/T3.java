package t04_method;

public class T3 {
	public static void main(String[] args) {
		int tot =0;
		System.out.println("********1~10까지의 합을 출력*******");
		for(int i=1; i<=10; i++) {
			System.out.println("i: "+i);
			tot+=i;
		}
		System.out.println("1~10까지의 합은"+tot);
	}
}
