package tests;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestClass {
    @Before
    public void setup(){
        Configuration.browser = "chrome";
        Configuration.startMaximized = true;
        open("https://dev-trader.swiperapp.io/");
    }
    @Test
    public void loginWithValidData(){

        $(By.xpath("/html/body/app-root/app-login/div/app-body/div/div/div[2]/div[1]/div[2]/app-form-input/div/div[2]/mat-form-field/div/div[1]/div/input")).setValue("email4@email.com");
        $(By.xpath("/html/body/app-root/app-login/div/app-body/div/div/div[2]/div[1]/div[3]/app-form-input/div/div[2]/mat-form-field/div/div[1]/div[1]/input")).setValue("passwordQ1!");
        $(By.xpath("/html/body/app-root/app-login/div/app-body/div/div/div[2]/div[2]/app-custom-button/button")).click();
        //$(By.xpath("/html/body/")).shouldBe(visible);
    }
    @Test
    public void loginInBroker(){
        $(By.xpath("/html/body/app-root/app-main/div/div[1]/app-main-header/div/div[1]/app-custom-button/button")).click();
        $(By.xpath("/html/body/app-root/app-main/div/app-modals/app-choose-broker-window/div/div/div[1]")).shouldBe(visible);
    }
}
