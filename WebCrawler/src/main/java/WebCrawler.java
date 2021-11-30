import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebCrawler {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://rule.nkust.edu.tw/").get();
            System.out.println(doc.title());
            Elements newsHeadlines = doc.select("#Dyn_2_2 a");
            for (Element headline : newsHeadlines) {
                System.out.printf("%s\n%s\n",headline.attr("title"), headline.absUrl("href"));
            }
        }catch(Exception e){

        }
    }
}
