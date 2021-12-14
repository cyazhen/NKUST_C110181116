import java.util.*;

import javax.swing.JOptionPane;

public class Test {
    public static void main(String[] args) {
        //彈出訊息對話方塊
        JOptionPane.showMessageDialog(null, "hello world !");
        //彈出確認對話方塊
        int  option=JOptionPane.showConfirmDialog(null, "1+1=2?");
        if(option==JOptionPane.YES_OPTION)
            System.out.println("你選擇的是Yes");
        else
            System.out.println("你選擇的是No");
        String name=JOptionPane.showInputDialog("請輸入你的名字：");
        int    age =Integer.parseInt(JOptionPane.showInputDialog("請輸入你的年齡："));
        JOptionPane.showMessageDialog(null, "你好，"+name+"\n你今年"+age+"歲了");
    }
}
