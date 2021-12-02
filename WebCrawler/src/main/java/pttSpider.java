import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class pttSpider {
    public static void main(String[] args) throws IOException {
        try{
            Document doc = Jsoup.connect("https://www.ptt.cc/bbs/hotboards.html").get();
            Elements hotClasses = doc.select("#main-container .b-ent a");
            for (Element hotClass : hotClasses){
                String pttTitle = hotClass.select("div:contains(◎)").text();                //最後輸出文章分類
                String articleDoc = hotClass.absUrl("href").toString();
                Document hotBoardDoc = Jsoup.connect(articleDoc);

                Elements articleClasses = hotBoardDoc.select("#main-container .r-ent .title a");
                for (Element articleClass : articleClasses){
                    System.out.println(articleClass.absUrl("href"));
                }
            }
        }catch (Exception e){

        }
    }
}
