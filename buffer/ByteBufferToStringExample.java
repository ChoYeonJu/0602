package buffer;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public class ByteBufferToStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Charset charset = Charset.forName("UTF-8");
		
		String data = "안녕하세요";
		ByteBuffer byteBuffer = charset.encode(data);
		
		data = charset.decode(byteBuffer).toString();
		System.out.println("문자열 복원 : " + data);

	}

}
