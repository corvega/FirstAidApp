package FirstAidApp.templates;

import FirstAidApp.templates.relations.DescriptionImage;
import org.junit.Test;

import java.io.File;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class LessonTemplateTest {

   @Test
    public void getTitle() {
        ArrayList<DescriptionImage> content= new ArrayList();
        content.add(new DescriptionImage("b","c", "d"));

        LessonTemplate lessonTemplate = new LessonTemplate("a", content);
        assertEquals(lessonTemplate.getTitle(), "a");
    }

    @Test
    public void getDescription() {
        ArrayList<DescriptionImage> content= new ArrayList();
        content.add(new DescriptionImage("b","c", "d"));

        LessonTemplate lessonTemplate = new LessonTemplate("a", content);
        assertEquals(lessonTemplate.getContent().get(0).getDescription(), "b");
    }

    @Test
    public void getImage() {
        ArrayList<DescriptionImage> content= new ArrayList();
        content.add(new DescriptionImage("b","c", "d"));

        LessonTemplate lessonTemplate = new LessonTemplate("a", content);
        assertEquals(lessonTemplate.getContent().get(0).getImage(), new File("c"));
    }

    @Test
    public void getImageCaption() {
        ArrayList<DescriptionImage> content= new ArrayList();
        content.add(new DescriptionImage("b","c", "d"));

        LessonTemplate lessonTemplate = new LessonTemplate("a", content);
        assertEquals(lessonTemplate.getContent().get(0).getImageCaption(), "d");
    }
}