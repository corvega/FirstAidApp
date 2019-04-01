package FirstAidApp.templates.relations;

import org.junit.Test;

import java.io.File;

import static org.junit.Assert.*;

public class DescriptionImageTest {

    @Test
    public void getImage() {
        DescriptionImage test = new DescriptionImage("a", "b", "c");
        assertEquals(test.getImage(), new File("b"));
    }

    @Test
    public void getDescription() {
        DescriptionImage test = new DescriptionImage("a", "b", "c");
        assertEquals(test.getDescription(), "a");
    }

    @Test
    public void getImageCaption() {
        DescriptionImage test = new DescriptionImage("a", "b", "c");
        assertEquals(test.getImageCaption(),"c");
    }
}