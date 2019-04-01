package FirstAidApp.templates;

import FirstAidApp.templates.relations.DescriptionImage;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LessonTest {

   @Test
    public void getTitle() {
        ArrayList<DescriptionImage> content= new ArrayList();
        content.add(new DescriptionImage("b","c", "d"));

        Lesson lesson = new Lesson("a", content);
        assertEquals(lesson.getTitle(), "a");
    }

    @Test
    public void getDescription() {
        ArrayList<DescriptionImage> content= new ArrayList();
        content.add(new DescriptionImage("b","c", "d"));

        Lesson lesson = new Lesson("a", content);
        assertEquals(lesson.getContent().get(0).getDescription(), "b");
    }

    @Test
    public void getImage() {
        ArrayList<DescriptionImage> content= new ArrayList();
        content.add(new DescriptionImage("b","c", "d"));

        Lesson lesson = new Lesson("a", content);
        assertEquals(lesson.getContent().get(0).getImage(), new File("c"));
    }

    @Test
    public void getImageCaption() {
        ArrayList<DescriptionImage> content= new ArrayList();
        content.add(new DescriptionImage("b","c", "d"));

        Lesson lesson = new Lesson("a", content);
        assertEquals(lesson.getContent().get(0).getImageCaption(), "d");
    }
}