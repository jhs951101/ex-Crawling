package pkg;

import java.lang.String;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;

public class TestCrawling {

    public static void main(String[] args) throws IOException {
        String URL = "https://www.naver.com";
        Document doc = Jsoup.connect(URL).get();

        //System.out.println(doc.text());  // text만 출력
        System.out.println(doc.html());  // html 코드까지 출력
    }
}
