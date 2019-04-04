package FirstAidApp.templates;

import FirstAidApp.templates.relations.DescriptionImage;

import java.io.File;
import java.util.ArrayList;

public class Lesson {

    String title;
    ArrayList<DescriptionImage> content;

    public Lesson(String title, ArrayList<DescriptionImage> content) {
        this.title = title;
        this.content = content;
    }

    public Lesson(String title, ArrayList<String> description, ArrayList<String> images, ArrayList<String> imageCaption) {
        if (description.size() != images.size() && images.size() != imageCaption.size()) throw new Error("The length of both images and description must be of the same size");
        this.title = title;
        this.content = new ArrayList();
        for (int i = 0; i < description.size(); i++) {
            content.add(new DescriptionImage(description.get(i), images.get(i), imageCaption.get(i)));
        }
    }

    public ArrayList<DescriptionImage> getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(ArrayList<DescriptionImage> content) {
        this.content = content;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription(int index) {
        return this.content.get(index).getDescription();
    }

    public File getImage(int index) {
        return this.content.get(index).getImage();
    }

    public String getImageCaption(int i) {
        return this.content.get(i).getImageCaption();
    }
}
