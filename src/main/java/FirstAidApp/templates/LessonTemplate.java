package FirstAidApp.templates;

import FirstAidApp.templates.relations.DescriptionImage;

import java.io.File;
import java.util.ArrayList;

/**
 * This is a model class for the lesson.
 */
public class LessonTemplate {

    String title;
    ArrayList<DescriptionImage> content;

    /**
     * Constructor
     * @param title of the lesson
     * @param content Will hold the content of the lesson which is of type DescriptionImage
     */
    public LessonTemplate(String title, ArrayList<DescriptionImage> content) {
        this.title = title;
        this.content = content;
    }

    /**
     * Constructor
     * Description, image and imageCaption array lists must be of the same size.
     * @param title of the lesson.
     * @param description of the lesson.
     * @param images PATH route of the image used in the lesson.
     * @param imageCaption  caption for the image
     * @throws Exception if the arrays are not of same length.
     */
    public LessonTemplate(String title, ArrayList<String> description, ArrayList<String> images, ArrayList<String> imageCaption) {
        if (description.size() != images.size() && images.size() != imageCaption.size()) throw new Error("The length of both images and description must be of the same size");
        this.title = title;
        this.content = new ArrayList();
        for (int i = 0; i < description.size(); i++) {
            content.add(new DescriptionImage(description.get(i), images.get(i), imageCaption.get(i)));
        }
    }

    /**
     * Getter for the content
     * @return content
     */
    public ArrayList<DescriptionImage> getContent() {
        return content;
    }

    /**
     * Getter for the title
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for the content
     * @param content which is going to replace the current content in the lesson.
     */
    public void setContent(ArrayList<DescriptionImage> content) {
        this.content = content;
    }

    /**
     * Getter for the description
     * @param index for the description that is wanted to be returned
     * @return the description of the given index
     */
    public String getDescription(int index) {
        return this.content.get(index).getDescription();
    }

    /**
     * Getter for the FILE of the image
     * @param index for the image that is wanted to be returned.
     * @return the FILE of the image.
     */
    public File getImage(int index) {
        return this.content.get(index).getImage();
    }

    /**
     * Getter for the image caption
     * @param index for the image caption that is wanted to be returned.
     * @return the image caption.
     */
    public String getImageCaption(int index) {
        return this.content.get(index).getImageCaption();
    }
}
