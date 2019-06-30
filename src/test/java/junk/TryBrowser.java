package junk;

import com.trello.ui.core.BrowserFactory;
import org.testng.annotations.Test;

/**
 * Created by lolik on 20.06.2019
 */
public class TryBrowser extends BrowserFactory {


    @Test
    public void openClose(){
        driver().get("https://google.com");
    }


}
