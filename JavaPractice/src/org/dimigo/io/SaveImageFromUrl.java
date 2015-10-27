package org.dimigo.io;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class SaveImageFromUrl {
	
	public static void main(String[] args) {
		
		String imageUrl = "http://media.blizzard.com/d3/icons/items/large/unique_orb_004_x1_demonhunter_male.png";
		
		
		try {
			
			URL url = new URL(imageUrl);
			InputStream is = url.openStream();
			OutputStream os = new FileOutputStream("files/logo.png");
			
			int result;
			byte[] buf = new byte[100];
			
			while((result = is.read(buf)) != -1) {
				os.write(buf, 0, result);
			}
			
			System.out.println("haha!");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
