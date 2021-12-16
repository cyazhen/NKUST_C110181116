import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class etfSpider {
    public static void main(String[] args) {
        try{
            Document doc = Jsoup.connect("https://goodinfo.tw/tw/StockList.asp?MARKET_CAT=%E5%85%A8%E9%83%A8&INDUSTRY_CAT=ETF&SHEET=%E4%BA%A4%E6%98%93%E7%8B%80%E6%B3%81&SHEET2=%E6%97%A5&RPT_TIME=%E6%9C%80%E6%96%B0%E8%B3%87%E6%96%99").get();

            Elements etfTable = doc.select("div#txtStockListData div#divStockList table#tblStockList.r10.b1.p4_1");
            System.out.println(etfTable);
            Elements etfTrs = etfTable.select("tr");
            for (Element etfTr : etfTrs){
                Elements etfThs = etfTr.select("th");
                for (Element etfTh : etfThs){
                    System.out.printf(etfTh.text());
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
