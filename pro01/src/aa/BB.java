package aa;

public class BB {
	public static void main(String[] args) {
		AA a=new AA();
		
	//System.out.println(a.x); //Error
	System.out.println(a.y);//동일한 패키지에선 가능
	System.out.println(a.z);//어느곳에서든 사용 가능
	System.out.println(a.su);//동일패키지에선 가능
	}

}
