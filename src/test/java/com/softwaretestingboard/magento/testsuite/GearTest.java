package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.ShoppingCart;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends TestBase {

    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    ShoppingCart shoppingCart = new ShoppingCart();

    @Test
    public void userShouldAddProductSuccessFullyToShoppingCart() {
        // * Mouse Hover on Gear Menu
        homePage.mouseHoverOnGearTab();
        // * Click on Bags
        homePage.mouseHoverAndClickOnBagsInGear();
        //* Click on Product Name ‘Overnight Duffle’
        productPage.clickOnProductOvernightDuffle();
        //* Verify the text ‘Overnight Duffle’
        Assert.assertEquals(productPage.verifyOvernightDuffleText(),"Overnight Duffle");
        //* Change Qty("3");
        productPage.changeQty("3");
        //* Click on ‘Add to Cart’ Button.
        productPage.clickOnAddToCartButton();
        //* Verify the text‘You added Overnight Duffle to your shopping cart.’
        Assert.assertEquals(productPage.verifyProductAddedToCartMessage(),"You added Overnight Duffle to your shopping cart.");
        //* Click on ‘shopping cart’ Link into message
        productPage.clickOnShoppingCartLink();
        //  * Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(shoppingCart.verifyProductCronusYogaPantName(),"Cronus Yoga Pant");
        //* Verify the Qty is ‘3’
        Assert.assertEquals(shoppingCart.verifyProductsCronusYogaPantQtyText("value"),"3");
        //* Verify the product price ‘$135.00’
        Assert.assertEquals(shoppingCart.verifyProductsCronusYogaPantPriceText("value"),"$135.00");
        //* Change Qty to ‘5’
        shoppingCart.changeFieldInCart("5");
        //* Click on ‘Update Shopping Cart’ button
        shoppingCart.updateShoppingCart();
        //  * Verify the product price ‘$225.00’
        Assert.assertEquals(shoppingCart.verifyProductPrice(),"$225.00");
    }


}
