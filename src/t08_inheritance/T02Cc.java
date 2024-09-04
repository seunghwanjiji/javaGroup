package t08_inheritance;

public class T02Cc extends T02Bb{
	void prn(int flag, String ans, int res, double res2) {
		String str;
		if(ans.equals("a"))str="넓이";
		else  str = "둘레";
	
	if(flag==1) {
		//사각형 넓이/둘레 출력처리
		System.out.println("사각형의 "+str+"는"+res+"입니다.");
	}
	else if(flag==2) {
		System.out.println("원의 "+str+"는"+res2+"입니다.");
	}
	
	}
}
