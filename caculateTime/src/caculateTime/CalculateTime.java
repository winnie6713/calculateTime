package caculateTime;

public class CalculateTime {

	public static void main(String[] args) {
		int num = 11;
		if (oddOrnot(num)) {
			System.out.println("����������");
		}else {
			System.out.println("������������");
		}

	}
	
	private static boolean oddOrnot(int num){
		return (num & 1) !=0;
	}

}
