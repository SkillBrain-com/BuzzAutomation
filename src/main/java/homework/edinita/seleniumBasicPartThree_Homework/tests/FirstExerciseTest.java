package homework.edinita.seleniumBasicPartThree_Homework.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import seleniumBasicPartThree_Homework.pageObjects.FirstPage;

public class FirstExerciseTest extends BaseTest {
    @Test(description = "Wait and verify for the drop-down lists", groups = {"first_page"})
    public void firstTest() {
        categoryDesktop();
    }

    private void categoryDesktop() {
        FirstPage firstPage = new FirstPage(driver);
        firstPage.getCategoryOptions().get(1).click();
        getWait(driver).until(ExpectedConditions.invisibilityOf(firstPage.getLodingIcon()));
        getWait(driver).until(ExpectedConditions.attributeContains(firstPage.getLanguageOptions().getFirst(), "value","10"));
        firstPage.getSubmitButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOf(firstPage.getLanguageID2()));
        getWait(driver).until(ExpectedConditions.visibilityOfAllElements(firstPage.getLanguageID()));
        assertEquals("Not correct value",
                "10",  firstPage.getLanguageID().getText());
        firstPage.getBackToFormButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOfAllElements(firstPage.getSubmitButton()));
        firstPage.getCategoryOptions().get(1).click();
        getWait(driver).until(ExpectedConditions.invisibilityOf(firstPage.getLodingIcon()));
        getWait(driver).until(ExpectedConditions.attributeContains(firstPage.getLanguageOptions().get(1), "value", "11"));
        firstPage.getLanguageOptions().get(1).click();
        firstPage.getSubmitButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOf(firstPage.getLanguageID2()));
        getWait(driver).until(ExpectedConditions.visibilityOfAllElements(firstPage.getLanguageID()));
        assertEquals("Not correct value",
                "11",  firstPage.getLanguageID().getText());
        firstPage.getBackToFormButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOfAllElements(firstPage.getSubmitButton()));
        firstPage.getCategoryOptions().get(1).click();
        getWait(driver).until(ExpectedConditions.invisibilityOf(firstPage.getLodingIcon()));
        getWait(driver).until(ExpectedConditions.attributeContains(firstPage.getLanguageOptions().get(2), "value", "12"));
        firstPage.getLanguageOptions().get(2).click();
        firstPage.getSubmitButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOf(firstPage.getLanguageID2()));
        getWait(driver).until(ExpectedConditions.visibilityOfAllElements(firstPage.getLanguageID()));
        assertEquals("Not correct value",
                "12",  firstPage.getLanguageID().getText());
        firstPage.getBackToFormButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOfAllElements(firstPage.getSubmitButton()));
        firstPage.getCategoryOptions().get(1).click();
        getWait(driver).until(ExpectedConditions.invisibilityOf(firstPage.getLodingIcon()));
        getWait(driver).until(ExpectedConditions.attributeContains(firstPage.getLanguageOptions().get(3), "value", "13"));
        firstPage.getLanguageOptions().get(3).click();
        firstPage.getSubmitButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOf(firstPage.getLanguageID2()));
        getWait(driver).until(ExpectedConditions.visibilityOfAllElements(firstPage.getLanguageID()));
        assertEquals("Not correct value",
                "13",  firstPage.getLanguageID().getText());
        firstPage.getBackToFormButton().click();
        getWait(driver).until(ExpectedConditions.visibilityOfAllElements(firstPage.getSubmitButton()));
    }
}
