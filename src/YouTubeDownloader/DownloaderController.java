package YouTubeDownloader;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class DownloaderController {

    public TextArea OutputArea;
    public TextField proxy;
    public TextField Url;

    public void Download(){
        Process p;

        String cmds = "extr/youtube-dl.exe "+Url.getText()+" --proxy "+proxy.getText();
        System.out.println(cmds);
        try {
            //执行命令
            p = Runtime.getRuntime().exec(cmds);
            //获取输出流，并包装到BufferedReader中
            BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream(), Charset.forName("GBK")));
            BufferedReader es = new BufferedReader(new InputStreamReader(p.getErrorStream(), Charset.forName("GBK")));
            String line = null;
            while ((line = br.readLine()) != null) {
//                OutputArea.appendText(line);
                System.out.print("\r"+line);
            }
            while ((line = es.readLine()) != null) {
                System.out.print("\r"+line);
            }
            int exitValue = p.waitFor();
            System.out.println("进程返回值：" + exitValue);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void DownloadClicked(MouseEvent mouseEvent) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Download();
            }
        }).start();
        System.out.println("开始下载");
    }
}
