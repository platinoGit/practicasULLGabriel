package com.company.plexus.gateway.utils;
import java.net.URLConnection;
import java.net.URL;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class DataGetter {
	public static final int DEFAULT_BUFFER_SIZE = 8192;
	
	public static String getData() {
		try {
			URLConnection connection = new URL("https://datos.canarias.es/catalogos/general/api/3/action/datastore_search?resource_id=6b2ad730-826a-4c94-abad"
					+ "-57a720b92e23").openConnection();
			InputStream is = connection.getInputStream();
			String result = convertInputStreamtoString(is);
			System.out.println(result);
			return result;
		} catch (Exception error) {
			System.out.println(error);
			return "";
		}
	}
	
	public static void main(String[] args) {
		getData();
	}
	
	private static String convertInputStreamtoString(InputStream input) throws IOException {
		ByteArrayOutputStream result = new ByteArrayOutputStream();
		byte [] buffer = new byte[DEFAULT_BUFFER_SIZE];
		int length;
		while ((length = input.read(buffer)) != -1) {
			result.write(buffer, 0, length);
		}
		return result.toString("UTF-8");
	}
}
