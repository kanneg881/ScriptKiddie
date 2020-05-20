/**
 * 參考書籍 職業駭客的告白 秋聲 著
 * 寫入 haha 到 Haha.txt 浪費硬碟空間
 *
 * @author 饒義忠
 * @version 1.0 2018/04/14
 */

import java.io.*;

public class WriteToDisk {
    public static void main(String[] arguments) {
        try {
            // 檔案
            File file = new File("Haha.txt");
            // 檔案輸出串流
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            write(fileOutputStream, 100);
        }
        catch(IOException exception) {
            exception.printStackTrace();
        }
    }
    
    /**
     * 寫入內容到檔案
     *
     * @param fileOutputStream 檔案輸出串流
     * @param number 寫入次數
     */
    public static void write(FileOutputStream fileOutputStream, long number)
        throws IOException {
        // 寫入的內容
        String content = "haha \n";
        // 把內容轉換成byte
        byte[] byteContent = content.getBytes();
        
        for(int i = 0; i < number; i++) {
            System.out.println(content);
            // 寫入內容到檔案
            fileOutputStream.write(byteContent, 0, byteContent.length);
        }
    }
}
