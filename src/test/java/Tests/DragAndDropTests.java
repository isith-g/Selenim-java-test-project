package Tests;

import Pages.DragAndDropPage;
import org.openqa.selenium.Point;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class DragAndDropTests extends BaseTest{
    private DragAndDropPage dragAndDropPage;

    @BeforeMethod
    public void initialiseTests(){
         dragAndDropPage = homePage.clickDragAndDropPage();
    }

    @Test
    public void testDragAndDrop(){
        Point[] dragAndDropLoc = dragAndDropPage.DragElement();
        assertThat(dragAndDropLoc[0]).isEqualTo(dragAndDropLoc[1]);
    }
}
