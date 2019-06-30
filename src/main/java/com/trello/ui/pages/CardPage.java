package com.trello.ui.pages;

import com.trello.ui.core.Constants;
import com.trello.ui.core.Elem;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;

import static com.trello.ui.core.BrowserFactory.get;

/**
 * Created by lolik on 25.06.2019
 */
public class CardPage {
    public Elem descriptionFld = new Elem(By.xpath("//*[@class='description-fake-text-area hide-on-edit js-edit-desc js-hide-with-draft']"), "Description Field");
    public Elem commentFld = new Elem(By.xpath("//*[@class='comment-box-input js-new-comment-input']"), "Comment Field");
    public Elem labelsBtn = new Elem(By.xpath("//*[@class='button-link js-edit-labels']"), "Labels Button");
    public Elem checklistBtn = new Elem(By.xpath("//*[@class='button-link js-add-checklist-menu']"), "Checklist Button");
    public Elem duedateBtn = new Elem(By.xpath("//*[@class='button-link js-add-due-date']"), "Due Date Button");
    public Elem attachBtn = new Elem(By.xpath("//*[@class='button-link js-add-attach']"), "Attachment Button");
    public Elem TextDesc = new Elem(By.xpath("//*[@class='field field-autosave js-description-draft description card-description']"),"Text Description");
    public Elem SaveDesc = new Elem(By.xpath("//*[@class='primary confirm mod-submit-edit js-save-edit']"),"Save Description");
    public Elem CloseBtn = new Elem(By.xpath("//*[@class='pop-over-header-close-btn icon-sm icon-close']"),"Save Description");



    public void open(String cardUrl){
            get(cardUrl);
            //Assert.assertTrue(isOpened(), "Page 'Login' ["+PATH+"] not Opened");
    }
    public void addDescription(String Description){
        descriptionFld.click();
        TextDesc.type(Description);
        SaveDesc.click();
    }

    public void addComment(String comment){
        commentFld.type(comment);

    }
    public void openlabel(){
        labelsBtn.click();
    }

    public void addLabel(String color){
       Elem colorLabel = new Elem(By.xpath("//*[@data-color='"+color+"']"));
       colorLabel.click();
    }
    public void closeModal(){
        CloseBtn.click();
    }

    //public void move(String listName){



}
