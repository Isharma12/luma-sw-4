package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class ProductPage extends Utility {

    By jacketElementList = By.xpath("//strong[@class='product name product-item-name']//a");
    By sortByField = By.xpath("(//select[@id='sorter'])[1]");
    By jacketsPriceElementList = By.xpath("//span[@class='price-wrapper ']//span");
    By productCronusYogaPant = By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By productCronusYogaPantSize = By.xpath("(//div[@class='swatch-option text'])[1]");
    By productCronusYogaPantColour = By.xpath("(//div[@class='swatch-option color'])[1]");
    By addToCart = By.xpath("(//span[contains(text(),'Add to Cart')])[1]");
    By productAddedToCartMessage = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartLink = By.xpath("//a[normalize-space()='shopping cart']");
    By productOvernightDuffle = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By productOverNightDuffleText = By.xpath("//span[@class='base']");
    By changeField = By.xpath("//input[@id='qty']");
    By addToCartButton = By.xpath("//button[@id='product-addtocart-button']");

    public void verifySortingOfProductsInAscendingOrder(String option) {
        waitUntilVisibilityOfElementLocated(jacketsPriceElementList, 5);
        waitUntilVisibilityOfElementLocated(sortByField, 5);
        verifyElementsInAscendingOrder(jacketElementList, sortByField, option);
    }

    public void verifySortingOfPriceInAscendingOrder(String option) {
        waitUntilVisibilityOfElementLocated(jacketsPriceElementList, 5);
        verifyElementsInAscendingOrder(jacketsPriceElementList, sortByField, option);
    }

    public void mouseHoverOnProductCronusYogaPant() {
        waitUntilVisibilityOfElementLocated(productCronusYogaPant, 5);
        mouseHoverToElement(productCronusYogaPant);
    }

    public void mouseHoverAndClickOnSizeOfCronusYogaPant() {
        waitUntilVisibilityOfElementLocated(productCronusYogaPantSize, 5);
        mouseHoverToElementAndClick(productCronusYogaPantSize);
    }

    public void mouseHoverAndClickOnCronusYogaPantColour() {
        waitUntilVisibilityOfElementLocated(productCronusYogaPantColour, 5);
        mouseHoverToElementAndClick(productCronusYogaPantColour);
    }

    public void mouseHoverAndClickOnAddToCart() {
        waitUntilVisibilityOfElementLocated(addToCart, 5);
        mouseHoverToElementAndClick(addToCart);
    }

    public String verifyProductAddedToCartMessage() {
        return getTextFromElement(productAddedToCartMessage);
    }

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartLink);
    }

    public void clickOnProductOvernightDuffle() {
        waitUntilVisibilityOfElementLocated(productOvernightDuffle, 5);
        clickOnElement(productOvernightDuffle);
    }

    public String verifyOvernightDuffleText() {
        return getTextFromElement(productOverNightDuffleText);
    }

    public void changeQty(String qty) {
        clearField(changeField);
        waitUntilVisibilityOfElementLocated(changeField, 5);
        sendTextToElement(changeField, qty);
    }

    public void clickOnAddToCartButton() {
        clickOnElement(addToCartButton);
    }
}