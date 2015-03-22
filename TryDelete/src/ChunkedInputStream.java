import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Path;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.8
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ChunkedInputStream {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("https://api.mtgiq.mtgx.se/mtgx/api/viewing-event/export?created-from=2015-02-03T09:00&created-to=2015-02-03T09:01&accessToken=BI_92564t1");
            out = new FileOutputStream("/tmp/outagain.txt");
            int c;

            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}