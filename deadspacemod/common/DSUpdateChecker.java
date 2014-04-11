package deadspacemod.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

public class DSUpdateChecker {

	public static String latVersion;
	
	public static boolean isUpdateAvailable() throws IOException, MalformedURLException, UnknownHostException {
		BufferedReader versionFile = new BufferedReader(new InputStreamReader(new URL("https://masquitto-pls-change-this-to-the-file-hosting-site/ie/mediafire/dropbox.net").openStream()));
		latVersion = versionFile.readLine();
		if (!latVersion.contains(DeadSpaceCore.VERSION)) {
			return true;
		}
		versionFile.close();
		return false;
	}
}