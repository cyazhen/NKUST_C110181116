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
<<<<<<< HEAD
                String pttTitle = hotClass.select("div:contains(◎)").text();       //最後輸出文章分類
                String articleSortDoc = hotClass.absUrl("href").toString();
                Document hotBoardDoc = Jsoup.connect(articleSortDoc).get();
                Elements articleSortClasses = hotBoardDoc.select("#main-container .r-ent .title a");
                for (Element articleClass : articleSortClasses){
                    String articleTitle = articleClass.text();                             //最後輸出文章標題
                    String articleDoc = articleClass.absUrl("href").toString();
                    Document articleClasses = Jsoup.connect(articleDoc).get();
                    Elements articleElements = articleClasses.select("#main-container #main-content");
                    for(Element articleElement : articleElements){
                        Element articleCommits = articleElement.select(" .push").first();
                        Elements commitsName = articleCommits.select(".f3");
                        System.out.println("Board: " + pttTitle);
                        System.out.println("Article title: " + articleTitle);
                        System.out.println("commit: " + commitsName.text());
                        System.out.println("=======================");
                    }
=======
                String pttTitle = hotClass.select("div:contains(◎)").text();                //最後輸出文章分類
                String articleDoc = hotClass.absUrl("href").toString();
                Document hotBoardDoc = Jsoup.connect(articleDoc);

                Elements articleClasses = hotBoardDoc.select("#main-container .r-ent .title a");
                for (Element articleClass : articleClasses){
                    System.out.println(articleClass.absUrl("href"));
>>>>>>> 0243b13cbb91664b16d3df08fa131ed28e986e6f
                }
            }
        }catch (Exception e){

        }
    }
}
