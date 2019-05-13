import java.io.InputStream;
import java.net.URL;

public class Class {	
	
	//bad code
	public static void main(String[] args) throws Exception{
		
		for (int i = 0; i < 300; i++) {
			new Thread(
					()-> {
				try {
					URL url = new URL("http://www.naver.com");
					
					InputStream in = url.openStream();
					byte[] arr = new byte[8192];
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
			).start();
		}
		
	}

}
