package test06;


import org.junit.Test;
import sun.net.www.http.HttpClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;


public class httpurl{
//    //设置自定义连接池
//    @Test
//    public void test() throws Exception{
//        String url1="https://www.baidu.com";
//        URL url=new URL(url1);
//        URLConnection urlConnection=url.openConnection();
//        HttpURLConnection httpURLConnection=(HttpURLConnection)urlConnection;
//
//        httpURLConnection.setRequestMethod("GET");
//        try(
//                InputStream is=httpURLConnection.getInputStream();
//                InputStreamReader isr= new InputStreamReader(is, StandardCharsets.UTF_8);
//                BufferedReader br=new BufferedReader(isr);
//                ){
//            String line;
//            while((line=br.readLine())!=null){
//                System.out.println(line);
//            }
//
//        }
//
//
//
//    }







    @Test
    public  void testGet1(){
//        CloseableHttpClient httpclient=HttpClients.createDefault();

    }
}
