package test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import URL.URLNormalization;

@RunWith(value = Parameterized.class)
public class URLStringsParameterizedTest {

	private String correctUrl;
	private String testUrl;

	public URLStringsParameterizedTest(String correctUrl, String testUrl) {
		super();
		this.correctUrl = correctUrl;
		this.testUrl = testUrl;
	}

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		Object[][] data = new Object[][] {
				{ "http://example.com/display?category=foo%2Fbar%20baz",
						"http://example.com/display?category=foo/bar+baz" },
				{ "https://mail.google.com/dom1/", "hTTPs://mail.GooGlE.coM/dom1/index.html" },
				{ "http://example.com/dss/", "http://example.com/dss" } };
		return Arrays.asList(data);
	}
	
	public void tUrlNormalization(){
        String noNormalizedUrl = testUrl;
        URL locator = getLocator(noNormalizedUrl);
        URLNormalization test = new URLNormalization();
        test.setURLParameters(locator);
        String normalizedUrl = test.getNormalizeURL();
        assertEquals(correctUrl, normalizedUrl);
    }
   
    private URL getLocator(String urlElement){
        URL locator = null;
        try{
             locator = new URL(urlElement);
        }
        catch(MalformedURLException e){
             locator = null;
        }
        return locator;
    }   

}
