package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By womenTab = By.xpath("//span[contains(text(),'Women')]");
    By topsInWomenDropdown = By.xpath("//li[contains(@class,'nav-2-1 ')]/child::a");
    By jacketsInWomenTops = By.xpath("//li[contains(@class,'nav-2-1 ')]/child::ul/child::li[1]/child::a");
    By mensTab = By.xpath("//span[normalize-space()='Men']");
    By bottomsInMensDropdown = By.xpath("//a[@id='ui-id-18']");
    By pantsInMensBottom = By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By gearTab = By.xpath("//span[normalize-space()='Gear']");
    By bagsInGear = By.xpath("//span[normalize-space()='Bags']");
    public void mouseHoverOnWomenTab(){waitUntilVisibilityOfElementLocated(womenTab,5);
        mouseHoverToElement(womenTab);
    }
    public void mouseHoverOnMenTab(){waitUntilVisibilityOfElementLocated(mensTab,5);
        mouseHoverToElement(mensTab);
    }
    public void mouseHoverOnGearTab(){
        waitUntilVisibilityOfElementLocated(gearTab,5);
        mouseHoverToElement(gearTab);
    }
    public void mouseHoverOnTopsInWomenTab(){
        waitUntilVisibilityOfElementLocated(topsInWomenDropdown,5);
        mouseHoverToElement(topsInWomenDropdown);
    }
    public void mouseHoverOnBottomsInMensDropdown(){
        waitUntilVisibilityOfElementLocated(bottomsInMensDropdown,5);
        mouseHoverToElement(bottomsInMensDropdown);
    }
    public void  mouseHoverAndClickOnJacketsInWomen(){
        waitUntilVisibilityOfElementLocated(jacketsInWomenTops,5);
        mouseHoverToElement(jacketsInWomenTops);
    }
    public void mouseHoverAndClickOnPantsInBottoms(){
        waitUntilVisibilityOfElementLocated(pantsInMensBottom,5);
        mouseHoverToElementAndClick(pantsInMensBottom);
    }
    public void mouseHoverAndClickOnBagsInGear(){
        waitUntilVisibilityOfElementLocated(bagsInGear,5);
        mouseHoverToElementAndClick(bagsInGear);
    }
}
