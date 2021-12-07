import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class pttSpider {
    public static void main(String[] args) throws IOException {
        try{
            //抓取ptt熱門看板資料
            Document doc = Jsoup.connect("https://www.ptt.cc/bbs/hotboards.html").get();
            //抓取ptt每個熱門看板網址
            Elements hotClasses = doc.select("#main-container .b-ent a");
            for (Element hotClass : hotClasses){
                //最後輸出文章分類
                String pttTitle = hotClass.select("div:contains(◎)").text();
                //讀取每個熱門看板網址
                String articleSortDoc = hotClass.absUrl("href").toString();
                Document hotBoardDoc = Jsoup.connect(articleSortDoc).get();
                //抓取每個文章網址
                Elements articleSortClasses = hotBoardDoc.select("#main-container .r-ent .title a");
                for (Element articleClass : articleSortClasses){
                    //最後輸出文章標題
                    String articleTitle = articleClass.text();
                    //讀取每個文章網址
                    String articleDoc = articleClass.absUrl("href").toString();
                    Document articleClasses = Jsoup.connect(articleDoc).get();
                    //抓取每個文章留言
                    Elements articleElements = articleClasses.select("#main-container #main-content .push");
                    for(Element articleElement : articleElements){
                        //抓出每個文章第一個留言資料
                        Element firstPush = articleElements.get(0);
                        String commitName = firstPush.select("span").get(1).text();
                        String firstCommit = firstPush.select("span").get(2).text();
                        //結果輸出
                        System.out.println("Board: " + pttTitle);
                        System.out.println("Article title: " + articleTitle);
                        System.out.println("commit: " + commitName + firstCommit);
                        System.out.println("==================================");
                        break;
                    }
                }
            }
        }catch (Exception e){
            System.out.println("error:" + e);
        }
    }
}
