package caculateTime;

public class CalculateTime {

	public static void main(String[] args) {
		int num = 11;
		if (oddOrnot(num)) {
			System.out.println("该数是奇数");
		}else {
			System.out.println("该数不是奇数");
		}

	}
	
	private static boolean oddOrnot(int num){
		return (num & 1) !=0;
	}

}
