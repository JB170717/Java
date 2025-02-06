package quiz22;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexQuiz02 {
	
	public static void main(String[] args) {
		
		//상품번호, GS25, (상품명), 가격 분리해서 출력.
		String str = "123123-45644 GS25(치킨도시락) 4,400원";
		String str2 = "123123-3453454 GS25(마늘햄쌈) 5,000원";
		String str3 = "123456-3453 GS(김혜자도시락) 6,000";
		String[] arr = {str, str2, str3};
		
		String num="\\d+-\\d+";
		String GS25="[A-Z]+\\d*";
		String item="\\([가-힣]+\\)";
		String pay= "\\d+,\\d+원?";

		for(String s :arr) {
			Matcher num1 =Pattern.compile(num).matcher(s);
			Matcher GS251 =Pattern.compile(GS25).matcher(s);			
			Matcher item1 =Pattern.compile(item).matcher(s);
			Matcher pay1 =Pattern.compile(pay).matcher(s);
		 
			if(num1.find()&&GS251.find()&&item1.find()&&pay1.find()) {
				System.out.println("상품번호>"+num1.group());
				System.out.println("지에스>:"+GS251.group());
				System.out.println("(상품명)>"+item1.group());
				System.out.println("가격>"+pay1.group());
				
				System.out.println("======================");
				
				
			}
		}
	}
}

		
		
		
	



