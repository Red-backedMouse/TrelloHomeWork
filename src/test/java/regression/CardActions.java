package regression;

import com.trello.api.TrelloRestClient;
import com.trello.api.models.Card;
import com.trello.ui.core.BrowserFactory;
import com.trello.ui.pages.BoardsPage;
import com.trello.ui.pages.CardPage;
import com.trello.ui.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Date;

/**
 * Created by lolik on 25.06.2019
 */
public class CardActions extends BrowserFactory {

    public TrelloRestClient client = new TrelloRestClient();

    public LoginPage loginPage = new LoginPage();
    public BoardsPage boardsPage = new BoardsPage();
    public CardPage cardPage = new CardPage();

    Card card = new Card("Test_Card_"+new Date().getTime());

    @BeforeTest
    public void prepareData() throws IOException {
        card = client.cardsService.createCard("5d1781d43d383f6b6052dd48", card).execute().body();
    }

    @AfterTest
    public void clearData() throws IOException {
        client.cardsService.deleteCard(card.id).execute();
    }

    @Test
    public void login() throws InterruptedException {
        loginPage.open();
        loginPage.login("ekormashova@gmail.com", "Test1234");
        //trello.Authorize(hardcodedToken);

        (new WebDriverWait(driver, 500))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@title='jh']")));
        //Thread.sleep(5000);
        cardPage.open(card.url);
        cardPage.addDescription("Test");
        cardPage.addComment("CommentTest");
        cardPage.openlabel();
        cardPage.addLabel("red");
        cardPage.addLabel("yellow");
        cardPage.closeModal();

        Thread.sleep(5000);
       // boardsPage.openBoard("jacksparrowtitle");
    }

    @Test
    public void openCard() throws InterruptedException {
        cardPage.open("https://trello.com/c/zqvvAEuA/1-kj");
        Thread.sleep(100);
    }

    @Test
    public void moveCard(){
     //   cardPage.moveToList(""):

    }

    @Test
    public void rename(){

    }




}
