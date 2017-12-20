package MyacessPackage.A;

public class MyPublicClass {
	
	public void method1(){
		System.out.println("method1");
	}
	public void method2(){
	
		System.out.println("method2");

	}
	private void method3(){
		
		System.out.println("method2");
		MyPublicClass obj1 = new MyPublicClass();

	}
private static void main(String args[]){
		
		System.out.println("method2");
		
		MyPublicClass obj =new MyPublicClass();
		obj.method3();

	}

}
