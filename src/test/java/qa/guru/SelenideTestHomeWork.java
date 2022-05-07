package qa.guru;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.module.Configuration;

import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class SelenideTestHomeWork {
//    Task1

/*
$("h1 div") - h1 и div - элементы ищутся совместно и выдается h1-элемент у которого есть div-элемент.
$("h1").$("div") - после того как будет найден h1-элемент, будет выполнен поиск первого по списку div-элемента.
*/


    @Test
    void SelenideSoftAssertions () {
//    Task2

        Selenide.open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(withTagAndText("a", "Soft assertions")).shouldBe(Condition.visible).click();
//        $("#wiki-body > div.markdown-body > ul:nth-child(3) > li:nth-child(6) > a").shouldBe(Condition.visible);
        $("#user-content-3-using-junit5-extend-test-class").shouldBe(Condition.visible);



    }
}
