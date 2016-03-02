package caculateTime;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestIO {
	

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(new File("C:\\Users\\Administrator\\Desktop\\11.txt"));
			fos = new FileOutputStream(new File("C:\\Users\\Administrator\\Desktop\\22.txt"));
			int s;
			while ((s = fis.read()) != -1) {
				fos.write(s);
			}
			System.out.println("“—–¥»Î");
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
				try {
					if (fis != null) fis.close();
					if (fos != null) fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}

	}

}
