import org.junit.jupiter.api.Test;
import pages.PageObjects;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDrop {
    PageObjects pageObjects = new PageObjects();

    @Test
    void testDragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        pageObjects.drapAndDrop();
        pageObjects.checkBox();
    }


}
