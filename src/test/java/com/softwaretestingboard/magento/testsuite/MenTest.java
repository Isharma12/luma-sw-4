package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ProductPage;
import com.softwaretestingboard.magento.pages.ShoppingCart;
import com.softwaretestingboard.magento.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends TestBase {

        HomePage homePage = new HomePage();
        ProductPage productPage = new ProductPage();
        ShoppingCart shoppingCart = new ShoppingCart();

        @Test
        public void userShouldAddProductSuccessFullyToShoppingCart() {
            //  * Mouse Hover on Men Menu
            homePage.mouseHoverOnMenTab();
            //   * Mouse Hover on Bottoms
            homePage.mouseHoverOnBottomsInMensDropdown();
            //   * Click on Pants
            homePage.mouseHoverAndClickOnPantsInBottoms();
            //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on size 32.
            productPage.mouseHoverOnProductCronusYogaPant();
            productPage.mouseHoverAndClickOnSizeOfCronusYogaPant();
            //* Mouse Hover on product name‘Cronus Yoga Pant’ and click on colourBlack.
            productPage.mouseHoverAndClickOnCronusYogaPantColour();
            // * Mouse Hover on product name‘Cronus Yoga Pant’ and click on‘Add To Cart’ Button.
            productPage.mouseHoverOnProductCronusYogaPant();
            productPage.mouseHoverAndClickOnAddToCart();
            //  * Verify the text‘You added Cronus Yoga Pant to your shopping cart.’
            Assert.assertEquals(productPage.verifyProductAddedToCartMessage(), "You added Cronus Yoga Pant to your shopping cart.");
            //* Click on ‘shopping cart’ Link into message
            productPage.clickOnShoppingCartLink();
            //  * Verify the text ‘Shopping Cart.’
            Assert.assertEquals(shoppingCart.verifyShoppingCartTitle(), "Shopping Cart");
            // * Verify the product name ‘Cronus Yoga Pant’
            Assert.assertEquals(shoppingCart.verifyProductCronusYogaPantName(), "Cronus Yoga Pant");
            //* Verify the product size ‘32’
            Assert.assertEquals(shoppingCart.verifyProductCronusYogaPantSizeText(), "32");
            //* Verify the product colour ‘Black’
            Assert.assertEquals(shoppingCart.verifyProductCronusYogaPantColourText(), "Black");
        }
    }


