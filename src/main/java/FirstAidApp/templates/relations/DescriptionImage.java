package FirstAidApp.templates.relations;

import java.io.File;

/**
 * This is the model class for having a description and an image.
 */
public class DescriptionImage {

    public File image;
    public String description;
    public String imageCaption;

    /**
     * Constructor
     * @param description for the image
     * @param pathToImage the file PATH to the image
     * @param imageCaption the caption for the image
     */
    public DescriptionImage(String description, String pathToImage, String imageCaption) {
        this.description = description;
        this.image = new File(pathToImage);
        this.imageCaption = imageCaption;
    }

    /**
     * Getter for the image
     * @return the image file
     */
    public File getImage() {
        return image;
    }

    /**
     * Getter for the description
     * @return the description for the image
     */
    public String getDescription() {
        return description;
    }

    /**
     * Getter for the image caption
     * @return the image caption
     */
    public String getImageCaption() {
        return imageCaption;
    }

}
