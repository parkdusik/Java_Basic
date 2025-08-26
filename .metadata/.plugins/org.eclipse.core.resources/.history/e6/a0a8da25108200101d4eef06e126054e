package ch04.quiz_function;

/*
login() 함수와 logout() 함수를 선언합니다. login()함수를 호출할 때에는 매개값으로
 id와 password를 제공하고, logout()함수는 id만 매개값으로 제공합니다.
 */

public class ch04_Quiz_07함수문제_16 {

	public static void main(String[] args) {
			boolean result=login("hong", "1234");
			
			if(result) {
				System.out.println("로그인 되었습니다.");
				logout("hong");
			}else {
				System.out.println("id와password가 올바르지 않습니다");
			}
		
	}
	
	//login함수
	public static boolean login(String id, String pw) {
		if(id.equals("hong")&& pw.equals("1234")) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void logout(String id) {
		if(id.equals("hong")) {
			System.out.println("로그아웃 되었습니다.");
		}
	}
}
