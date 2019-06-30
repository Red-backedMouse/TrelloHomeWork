package junk;

import com.trello.api.TrelloRestClient;
import com.trello.api.models.Card;
import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by lolik on 25.06.2019
 */
public class TryTrelloApi {

    TrelloRestClient client = new TrelloRestClient();


    @Test
    public void callIt() throws IOException, InterruptedException {
        Card card = new Card();
        card.name = "My New CARD 2";
        Card createdCard = client.cardsService.createCard("5d1781d43d383f6b6052dd48", card).execute().body();
        client.cardsService.deleteCard(createdCard.id).execute();
    }

}
