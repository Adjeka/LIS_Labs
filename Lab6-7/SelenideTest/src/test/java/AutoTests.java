import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;

public class AutoTests {

    @Test
    public void SetDeliveryAddressWithoutIntercomAndEntrance(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_30p_xWX9lYELpBAzOiGhEi']").click();
        sleep(250);
        $x("//input[@id='address_in_line']").setValue("Тюмень, улица 50 лет Октября, 57А");
        sleep(250);
        $x("//li[@class='_37UGdkdDdtw7yGkyW1tDsC']").click();
        sleep(250);
        $x("//input[@id='flat']").setValue("101");
        sleep(250);
        $x("//input[@id='floor']").setValue("1");
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _39oJG8QJLzIdaSowQffAdx']").click();
        sleep(1000);
    }

    @Test
    public void SetDeliveryAddressWithIntercomAndEntrance(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_30p_xWX9lYELpBAzOiGhEi']").click();
        sleep(250);
        $x("//input[@id='address_in_line']").setValue("Тюмень, улица 50 лет Октября, 57А");
        sleep(250);
        $x("//li[@class='_37UGdkdDdtw7yGkyW1tDsC']").click();
        sleep(250);
        $x("//input[@id='flat']").setValue("101");
        sleep(250);
        $x("//input[@id='floor']").setValue("1");
        sleep(250);
        $x("//div[@class='_3t4u90NcxqWcxabmPfQhDx']").click();
        sleep(250);
        $x("//input[@id='intercom']").setValue("101");
        sleep(250);
        $x("//input[@id='porch']").setValue("1");
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _39oJG8QJLzIdaSowQffAdx']").click();
        sleep(1000);
    }

    @Test
    public void Registration(){
        open("https://papajohns.ru/tyumen");
        $x("//button[@class='zoI7DuOAdLXS9CS9Ke6KB']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _1aTazpwpPX44UYeaNcq7y6 _1d-F68YzkPR8l-6EPVpQ-1']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _2r67pFPJlJ-sprfvyorP8Q Xrn25iLX57NaMOnaelcXC']").click();
        sleep(250);
        $x("//input[@id='username']").setValue("Евгений");
        sleep(250);
        $x("//input[@name='phone']").setValue("9123245153");
        sleep(250);
        $x("//input[@id='email']").setValue("awdawdasdw@mail.ru");
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG SignUpForm__button']").click();
        sleep(250);
        $x("//input[@id='password']").setValue("123456aA");
        sleep(250);
        $x("//input[@id='password_repeat']").setValue("123456aA");
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG SignUpForm__button']").click();
        sleep(1000);
    }

    @Test
    public void Autorization(){
        open("https://papajohns.ru/tyumen");
        $x("//button[@class='zoI7DuOAdLXS9CS9Ke6KB']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _1aTazpwpPX44UYeaNcq7y6 _1d-F68YzkPR8l-6EPVpQ-1']").click();
        sleep(250);
        $x("//input[@name='phone']").setValue("9123245151");
        sleep(250);
        $x("//input[@id='password']").setValue("123456aA");
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _1-XhLR_YaoZf4yBE611q5']").click();
        sleep(1000);
    }

    @Test
    public void SelectStock(){
        open("https://papajohns.ru/tyumen");
        $x("//button[@class='zoI7DuOAdLXS9CS9Ke6KB']").click();
        sleep(250);
        $x("//a[@class='_2mlVGCPHjGSnnnWIl-y4Gf']").click();
        sleep(250);
        $x("//a[@class='_1wXw9lZKuAoGgF9QFzMsq _3RlBjkJSd9OQyVmpT-J0P9']").click();
        sleep(1000);
    }

    @Test
    public void SelectBonus(){
        open("https://papajohns.ru/tyumen");
        $x("//button[@class='zoI7DuOAdLXS9CS9Ke6KB']").click();
        sleep(250);
        $x("//a[@href='/tyumen/papabonus']").click();
        sleep(1000);
    }

    @Test
    public void SelectContacts(){
        open("https://papajohns.ru/tyumen");
        $x("//button[@class='zoI7DuOAdLXS9CS9Ke6KB']").click();
        sleep(250);
        $x("//a[@href='/tyumen/contacts']").click();
        sleep(1000);
    }

    @Test
    public void SwipeStocksAndSelect(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='swiper-button-prev']").click();
        sleep(250);
        $x("//div[@class='swiper-button-next']").click();
        sleep(250);
        $x("//div[@class='swiper-button-next']").click();
        sleep(250);
        $x("//div[@class='swiper-button-next']").click();
        sleep(250);
        $x("//button[@class='swiper-slide swiper-slide-visible swiper-slide-active _1MCcxzS4MuPQ1iqFx0wWoz']").click();
        sleep(1000);
    }

    @Test
    public void SelectFilter(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_3nbiLxbwx44p0E7Ln8Z6sc HomePage__menu']").scrollIntoView(true);
        sleep(250);
        $x("//button[@class='_2Eby5_r4QGVEtTYaFjjjGX PizzaFilter__action_toggle']").click();
        sleep(250);
        $x("//button[@class='_1cP7m0DMXqVgnTf8qHObt_']").click();
        sleep(1000);
    }

    @Test
    public void SelectFilterAndSorts(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_3nbiLxbwx44p0E7Ln8Z6sc HomePage__menu']").scrollIntoView(true);
        sleep(250);
        $x("//button[@class='_2Eby5_r4QGVEtTYaFjjjGX PizzaFilter__action_toggle']").click();
        sleep(250);
        $x("//div[@class='_1vfx_k428p06B0iVWfKpzS _1cP7m0DMXqVgnTf8qHObt_']").click();
        sleep(250);
        $x("//div[@class='_1vfx_k428p06B0iVWfKpzS _1cP7m0DMXqVgnTf8qHObt_ _1VfEn0Yttkb41Y0R6So4A_ _3ZOQLG8uG6sj_kWjNwCm_G']").click();
        sleep(250);
        $x("//div[@class='_1vfx_k428p06B0iVWfKpzS _1cP7m0DMXqVgnTf8qHObt_ _1VfEn0Yttkb41Y0R6So4A_']").click();
        sleep(1000);
    }

    @Test
    public void AddPizzaInCart(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_3nbiLxbwx44p0E7Ln8Z6sc HomePage__menu']").scrollIntoView(true);
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _14XzZBn5BcfM1Of6IMlYQh']").click();
        sleep(1000);
    }

    @Test
    public void AddPizzaInCartAndChangeAmount(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_3nbiLxbwx44p0E7Ln8Z6sc HomePage__menu']").scrollIntoView(true);
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _14XzZBn5BcfM1Of6IMlYQh']").click();
        sleep(250);
        $x("//button[@data-test-id='plus']").click();
        sleep(250);
        $x("//button[@data-test-id='plus']").click();
        sleep(250);
        $x("//button[@data-test-id='minus']").click();
        sleep(1000);
    }

    @Test
    public void ClearCart(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_3nbiLxbwx44p0E7Ln8Z6sc HomePage__menu']").scrollIntoView(true);
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _14XzZBn5BcfM1Of6IMlYQh']").click();
        sleep(250);
        $x("//a[@class='_1wXw9lZKuAoGgF9QFzMsq _2RngcSl-a2tW0eKOHDXwG6']").click();
        sleep(2000);
    }

    @Test
    public void OpenFormWithAddIngredientsInPizza(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_3nbiLxbwx44p0E7Ln8Z6sc HomePage__menu']").scrollIntoView(true);
        sleep(250);
        $x("//div[@data-test-id='ingredients_button']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _2dD4xd1_8FHI9s2HEKx3Ch Xrn25iLX57NaMOnaelcXC']").click();
        sleep(2000);
    }

    @Test
    public void AddIngredientsInPizza(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_3nbiLxbwx44p0E7Ln8Z6sc HomePage__menu']").scrollIntoView(true);
        sleep(250);
        $x("//div[@data-test-id='ingredients_button']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _2dD4xd1_8FHI9s2HEKx3Ch Xrn25iLX57NaMOnaelcXC']").click();
        sleep(250);
        $x("//li[@class='AbR4Dttr-9tOajuHksWu4']").click();
        sleep(250);
        $x("//div[@class='_1tDESah0d7G8Vl5mIBBDs-']").click();
        sleep(2000);
    }

    @Test
    public void AddIngredientsInPizzaAndAddInCart(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_3nbiLxbwx44p0E7Ln8Z6sc HomePage__menu']").scrollIntoView(true);
        sleep(250);
        $x("//div[@data-test-id='ingredients_button']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _2dD4xd1_8FHI9s2HEKx3Ch Xrn25iLX57NaMOnaelcXC']").click();
        sleep(250);
        $x("//li[@class='AbR4Dttr-9tOajuHksWu4']").click();
        sleep(250);
        $x("//div[@class='_1tDESah0d7G8Vl5mIBBDs-']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG']").click();
        sleep(2000);
    }

    @Test
    public void OpenStockWithNewYear(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_1hWKJ6rz5mRs57WsiJw853']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _14fQNtB9bZtbtt8oWhgXP8 ZqzViClLzO_Z6fPofWQo3']").click();
        sleep(250);
        $x("//input[@name='phone']").setValue("9123245151");
        sleep(250);
        $x("//input[@id='password']").setValue("123456aA");
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _1-XhLR_YaoZf4yBE611q5']").click();
        sleep(2000);
    }

    @Test
    public void OpenStockWithNewYearAndOpenTask(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_1hWKJ6rz5mRs57WsiJw853']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _14fQNtB9bZtbtt8oWhgXP8 ZqzViClLzO_Z6fPofWQo3']").click();
        sleep(250);
        $x("//input[@name='phone']").setValue("9123245151");
        sleep(250);
        $x("//input[@id='password']").setValue("123456aA");
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _1-XhLR_YaoZf4yBE611q5']").click();
        sleep(250);
        $x("//div[@class='_1WuAPwP4G_DlbQWT0w0b7-']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _14fQNtB9bZtbtt8oWhgXP8 ZqzViClLzO_Z6fPofWQo3']").click();
        sleep(250);
        $x("//div[@class='_1WuAPwP4G_DlbQWT0w0b7-']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _14fQNtB9bZtbtt8oWhgXP8 ZqzViClLzO_Z6fPofWQo3']").click();
        sleep(2000);
    }

    @Test
    public void OpenStockWithNewYearTasksAndFlip(){
        open("https://papajohns.ru/tyumen");
        $x("//div[@class='_1hWKJ6rz5mRs57WsiJw853']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _14fQNtB9bZtbtt8oWhgXP8 ZqzViClLzO_Z6fPofWQo3']").click();
        sleep(250);
        $x("//input[@name='phone']").setValue("9123245151");
        sleep(250);
        $x("//input[@id='password']").setValue("123456aA");
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _1-XhLR_YaoZf4yBE611q5']").click();
        sleep(250);
        $x("//div[@class='_1WuAPwP4G_DlbQWT0w0b7-']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _14fQNtB9bZtbtt8oWhgXP8 ZqzViClLzO_Z6fPofWQo3']").click();
        sleep(250);
        $x("//div[@class='_1OTpEP5DktFPVnxl5T62P0']").click();
        sleep(250);
        $x("//div[@class='swiper-slide swiper-slide-next _3sELl7VMZXzFgNndIOnmBF']").click();
        sleep(250);
        $x("//div[@class='swiper-slide swiper-slide-next _3sELl7VMZXzFgNndIOnmBF']").click();
        sleep(250);
        $x("//div[@class='swiper-slide swiper-slide-next _3sELl7VMZXzFgNndIOnmBF']").click();
        sleep(2000);
    }

    @Test
    public void OpenProfile(){
        open("https://papajohns.ru/tyumen");
        $x("//button[@class='zoI7DuOAdLXS9CS9Ke6KB']").click();
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _1aTazpwpPX44UYeaNcq7y6 _1d-F68YzkPR8l-6EPVpQ-1']").click();
        sleep(250);
        $x("//input[@name='phone']").setValue("9123245151");
        sleep(250);
        $x("//input[@id='password']").setValue("123456aA");
        sleep(250);
        $x("//button[@class='PdZogalGcZKBiADOHltbG _1-XhLR_YaoZf4yBE611q5']").click();
        sleep(250);
        $x("//div[@class='sIlP-oWtmD3gpguRFLZ3c']").click();
        sleep(1000);
    }
}
