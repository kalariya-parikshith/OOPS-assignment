interface MyInterface1{
	public void displayInterfaceName1();
}
interface MyInterface2{
	public void displayInterfaceName2();
}
abstract class MyAbstract implements MyInterface1,MyInterface2{
	public void displayInterfaceName1(){
		System.out.println("In MyInterface1");
	}
	public void displayInterfaceName2(){
		System.out.println("In MyInterface2");
	}
	public void displayAbstractClassName(){
		System.out.println("In myAbstract class");
	}
}

class InterAbstract extends MyAbstract{
	
	public static void main(String[] args) {
		InterAbstract ia = new InterAbstract();
		ia.displayInterfaceName1();
		ia.displayInterfaceName2();
		ia.displayAbstractClassName();
	}
}