package com.yuhe.SimpleRPC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class URLConnectionTest {
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;

        String urlNameString = url + "?" + param;
        try {
            URL realUrl = new URL(urlNameString);
            HttpURLConnection connection = (HttpURLConnection)realUrl.openConnection();
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.connect();
            Map<String, List<String>> map = connection.getHeaderFields();
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String res = sendGet("http://linkcenter.derbysoft-test.com/dplatform-linkcenter/booking.htm", "hotelCode=TAMBOURINE-1406&checkInDate=2019-10-18&checkOutDate=2019-10-21&channelCode=dh-wego&language=en-US&rooms=1&guests=5&deviceType=desktop&country=AM&currency=USD&testClick=false&roomTypeCode=rt123&ratePlanCode=rp123");
        System.out.println(res);

    }
}
