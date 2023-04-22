package es.um.nosql.code.s13e.transfs.text2json.transf.utils;

public class FileUriUtils {

	public static String setSlashLastCharacter(String uri) {
		if (!uri.endsWith("/")) {
			uri += "/";
		}
		
		return uri;
	}

	public static String removeExtension(String uri) {
		return uri.substring(0, uri.lastIndexOf('.'));
	}
	
	public static String replaceExtension(String uri, String newExtension) {
		if (newExtension.startsWith(".")) {
			return removeExtension(uri) + newExtension;
		} else {
			return removeExtension(uri) + '.'+ newExtension;
		}
	}
	
}
