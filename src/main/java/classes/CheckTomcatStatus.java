package classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CheckTomcatStatus {

    public static String getTomcatStatus(String url) {
        try {
            int statusCode = getStatusCode(url);

            if (statusCode == 200) {
                return "Tomcat is running successfully. Status Code: " + statusCode;
            } else {
                return "Tomcat is not running or the application is not deployed. Status Code: " + statusCode;
            }
        } catch (IOException e) {
            return "Error while checking Tomcat status: " + e.getMessage();
        }
    }

    private static int getStatusCode(String urlString) throws IOException {
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        try {
            return connection.getResponseCode();
        } finally {
            connection.disconnect();
        }
    }
}

