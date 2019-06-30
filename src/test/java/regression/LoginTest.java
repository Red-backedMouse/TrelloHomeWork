package regression;

import com.trello.ui.core.BrowserFactory;
import com.trello.ui.pages.BoardsPage;
import com.trello.ui.pages.LoginPage;
import org.testng.annotations.Test;

/**
 * Created by lolik on 20.06.2019
 */
public class LoginTest extends BrowserFactory {

    LoginPage loginPage = new LoginPage();
    BoardsPage boardsPage = new BoardsPage();

    @Test
    public void login() throws InterruptedException {
        loginPage.open();
        loginPage.login("ekormashova@gmail.com", "Test1234");
        Thread.sleep(5000);

        //boardsPage.openBoard("jacksparrowtitle");
    }

}
