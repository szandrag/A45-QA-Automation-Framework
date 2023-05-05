import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {
    @Test
    public static void playSong() throws InterruptedException {
        navigateToPage();
        provideEmail("sandra.geche@gmail.com");
        providePassword("te$t$tudent");
        clickSubmit();
        Thread.sleep(2000);
        playSongButton();
        boolean isSoundBarDisplayed = isSoundBarDisplayed();
        Assert.assertTrue(isSoundBarDisplayed);
    }
}

