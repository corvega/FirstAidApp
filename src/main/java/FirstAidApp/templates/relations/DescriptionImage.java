package FirstAidApp.templates.relations;

import java.io.File;

public class DescriptionImage {

    public File image;
    public String description;
    public String imageCaption;
    /* TODO: Might split this into a nother type  */

    public DescriptionImage(String description, String pathToImage, String imageCaption) {
        this.description = description;
        this.image = new File(pathToImage);
        this.imageCaption = imageCaption;
    }

    public File getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getImageCaption() {
        return imageCaption;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImageCaption(String imageCaption) {
        this.imageCaption = imageCaption;
    }
}
