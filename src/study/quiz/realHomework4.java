package study.quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
		//1. 아래 코드에서 예상되는 출력 결과를 작성하세요
		int x = 2;
		int y = 3;
		int z;

		System.out.println("x="+x + " y="+y); // x=2 y=3
		System.out.println(x + y); // 5
		System.out.println(x++ + y++); //x++=2, y++=3, 2+3=5, 다른 연산을 수행한 후에 피연산자의 값을 1증가 시키므로 적용이 아직은 안됨. 
		System.out.println("x="+x + " y="+y); // x=3 y=4, 위에 있는 증감 연산자 적용으로 피연산자의 값이 1증가.
		z = ++x + ++y; // 앞에서완 달리 다른 연산 수행 전에 1증가 됐으므로 z = 4+5 = 9 (현재 증감이 2번 적용되었음.)    
		System.out.println("x="+x + " y="+y); // x=4, y=5
		z--; // 현재 z의 값은 9(z = ++x + ++y), 하지만 여기서 증감 연산자가 추후에 적용되므로 다음부터 값은 8        
		System.out.println(x += --y);  // +=는 변수 = 변수 + 피연산자하겠다는 의미므로, x = x + --y를 하겠다는 의미, 즉 x = 4 + 4 = 8
		System.out.println("x="+x + " y="+y + " z="+z); // x=8, y=4, z= 9 + 5 = 14 - 1 = 13?
		x = 10; // x변수를 10으로 다시 지정.
		z = x/y++; // z라는 변수를 x를 y에 1을 추후에 더한값을 나눈것으로 저장  즉, 10/5=2 
		System.out.println("x="+x + " y="+y + " z="+z); // x=10, y=5, z=2
		System.out.println("x="+(x*2) + " y="+ ++y + " z="+z); // x=20, y=6, z=2
		System.out.println("x="+x + " y="+y + " z="+z); // x=10, y=6, z=2
		
		
		
		
		// 2. 아래 조건에 대한 출력 결과를 예상해서 작성하세요
		int d = 1;
		int e = 2;
		int f = 3;
		System.out.println( (d<e) && (f>=d) ); // e가 d보다 높은 숫자이고, f가 d보다 높거나 같은 숫자기 때문에 true; 
		//
		//
		System.out.println( (d == e ) || ( d >= e) || (f > 10) ); // d랑 e는 같은 값이 아님, d는 e보다 크거나 같지 않음, f는 10보다 크지 않으므로 false
		boolean result = !(f == 3);
		System.out.println(result); // result라는 변수에 f는 3과 같은 것에 부정을 넣음. 즉 false
		
		
		
	
		/*
		3. 아래 조건 범위에 맞춰서 결과가 나올 수 있도록, 삼항연산자 코드를 완성하세요.

		점심 메뉴 가격에 따라서 아래 결과를 출력하고 싶습니다.
		6000원 이하 -> "훌륭"
		6000원 초과 ~ 8000원 -> "선방"
		8000원 초과 ~ 12000원 -> "눈물"
		12000원 초과 -> "물로배채우기"

		int menuPrice = 30000; //점심 식사 메뉴 가격 (임의로 변경해가면서 테스트)
		String result = ________;
		System.out.println(result);
		*/
		
		int menuPrice = 7000;
		String result1 = (menuPrice <= 6000) ? "훌륭" : (menuPrice <= 8000 ? "선방" : (menuPrice <= 12000 ? "눈물" : "물로배채우기"));
		System.out.println(result1);
		
	}

}
