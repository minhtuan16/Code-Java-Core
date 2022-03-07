package model;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import sun.net.www.protocol.http.HttpURLConnection;

public class MyThread extends Thread {

	@Override
	public void run() {
		try {
			ddos();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void ddos() throws IOException {

		URL url = new URL("http://www.24h.com.vn/");
		HttpURLConnection urlCon = (HttpURLConnection) url.openConnection();
		for (int i = 0; i < urlCon.getHeaderFields().size(); i++) {
			System.out.println(urlCon.getHeaderFieldKey(i) + "=" + urlCon.getHeaderField(i));
		}
	}
}
