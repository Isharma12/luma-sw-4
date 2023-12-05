package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {

    By shoppingCartText = By.xpath("//span[@class='base']");
    By productCronusYogaPantName = By.xpath("//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']");
    By productYogaPantSizeText = By.xpath("//dd[contains(text(),'32')]");
    By productCronusYogaPantColourText = By.xpath("//dd[contains(text(),'Black')]");
    By productOvernightDuffleText = By.xpath("//td[@class='col item']//a[normalize-space()='Overnight Duffle']");
    By productOverNightDuffleQtyText = By.xpath("//input[@title='Qty']");
    By productOvernightDufflePriceText = By.xpath("(//span[@class='cart-price']//span)[2]");
    By qtyFieldInCart = By.xpath("(//input[@class='input-text qty'])[1]");
    By updateShoppingCartButton = By.xpath("//div[@class='cart main actions']/descendant::button[2]");
    By productPrice = By.xpath("//td[@data-th='Subtotal']//span[@class='price']");

    public String verifyShoppingCartTitle(){
        return getTextFromElement(shoppingCartText);
    }
    public String verifyProductCronusYogaPantName(){
        return getTextFromElement(productCronusYogaPantName);
    }
    public String verifyProductCronusYogaPantColourText(){
        return getTextFromElement(productCronusYogaPantColourText);
    }
    public String verifyProductCronusYogaPantSizeText(){
        return getTextFromElement(productYogaPantSizeText);
    }
    public String verifyProductNameOvernightDuffle(){
        return getTextFromElement(productOvernightDuffleText);
    }
    public String verifyProductsCronusYogaPantPriceText(String value){
        return getTextFromElement(productCronusYogaPantColourText);
    }


    public String verifyProductsCronusYogaPantQtyText(String value){
        return getTheAttributeValue(productCronusYogaPantName,value);
    }

    public void changeFieldInCart(String qty){
        clearField(qtyFieldInCart);
        waitUntilVisibilityOfElementLocated(qtyFieldInCart,5);
        sendTextToElement(qtyFieldInCart,qty);
    }

    public void updateShoppingCart(){
        waitUntilVisibilityOfElementLocated(updateShoppingCartButton,5);
        clickOnElement(updateShoppingCartButton);
    }

    public String verifyProductPrice(){
        return getTextFromElement(productPrice);
    }


}
