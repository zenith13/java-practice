import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

/**
 * @author 002L1R744 on 09-09-2022
 */
public class UrlDemo
{
    public static void main(String[] args) throws MalformedURLException
    {
//        URL url = new URL("/a-guide-to-java-sockets");
//        System.out.println(url.toString());
//        URIBuilder ssoLogoutUriBuilder = new URIBuilder(configurationService.getConfiguration().getString(SSO_LOGOUT_URL));
//        ssoLogoutUriBuilder.addParameter(POST_LOGOUT_REDIRECT_URI, siteBaseUrlResolutionService.getWebsiteUrlForSite(baseSiteService.getCurrentBaseSite(), true, LOGOUT_PATH));
        StringBuilder stringBuilder = new StringBuilder("/logout");
        stringBuilder.append("?uidToken="+234234);
        System.out.println(stringBuilder);


        final Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, -1);
        System.out.println(cal.getTime());
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        System.out.println(simpleDateFormat.format(cal.getTime()));

        Instant now = Instant.now();
        Instant yesterday = now.minus(1, ChronoUnit.DAYS);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(dateFormat.format(Date.from(yesterday)));

    }
}
