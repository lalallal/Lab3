import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**
 * Retrieve contents from a URL and return them as a string.
 *
 * @param url url to retrieve contents from
 * @return the contents from the url as a string, or an empty string on error
 */

public class Nobug { //sdsdssssds


    public static String urlToString(final String url) {
        Scanner urlScanner; {
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;}

    }


        public static void main(String[] args) {
            System.out.print(urlToString("http://erdani.com/tdpl/hamlet.txt"));

            String a = "prince";
            long count = 0;
            int n = 0;
            int m = a.length();
            String b = urlToString("http://erdani.com/tdpl/hamlet.txt").substring(n, m);
            while (m <= urlToString("http://erdani.com/tdpl/hamlet.txt").length()) {
                if (b.equalsIgnoreCase(a)) {
                    count = count + 1;
                    System.out.println(count);
                }
                n = n + 1;
                m = m + 1;
            }
                System.out.println(count);
    }
}
