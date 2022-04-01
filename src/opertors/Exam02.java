package opertors;

class Exam02{

	
	public static void main(String[] args) {
	
		//변수 number의 값에 따라 양수, 0, 음수인지를 알려달라
		int number = -50;
		
		//ME
		//number > 0 ? System.out.println("양수") : System.out.println("음수")
		
		//T
		System.out.println(number > 0 ? "양수" : (number < 0 ? "음수" : "0"));
		
		
	}

}