package qa.guru;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withTagAndText;
import static com.codeborne.selenide.Selenide.$;

public class SelenideTestHomeWork {
//    Task1

/*
$("h1 div") - h1 и div - элементы ищутся совместно и выдается h1-элемент у которого есть div-элемент.
$("h1").$("div") - после того как будет найден h1-элемент, будет выполнен поиск первого по списку div-элемента.
*/

    //    Task2
    @Test
    void SelenideSoftAssertions() {

        Selenide.open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(withTagAndText("a", "Soft assertions")).shouldBe(Condition.visible).click();
        $("#user-content-3-using-junit5-extend-test-class").shouldBe(Condition.visible);

    }
}
