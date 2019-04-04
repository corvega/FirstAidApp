package FirstAidApp.templates;

/**
 * This is the model class for the settings.
 */
public class SettingsTemplate {

    boolean magnifyText;
    boolean captionImages;
    colorBlind colorBlind;

    /**
     * Contains all the color blind options
     */
    public enum colorBlind {
            DEFAULT, DEUTERANOPIA, PROTANOPIA, TRITANOPIA
    }

    /**
     * Constructor
     * @param magnifyText does the text need to be magnified.
     * @param captionImages does the images need captions.
     * @param colorBlind is color blind needed.
     */
    public SettingsTemplate(boolean magnifyText, boolean captionImages, colorBlind colorBlind) {
        this.magnifyText = magnifyText;
        this.captionImages = captionImages;
        this.colorBlind = colorBlind;
    }

    /**
     * Getter for the color blind option
     * @return color blind option
     */
    public SettingsTemplate.colorBlind getColorBlind() {
        return colorBlind;
    }

    /**
     * Getter for magnify text
     * @return whether the magnified text is set or not
     */
    public boolean getMagnifyText() {
        return this.magnifyText;
    }

    /**
     * Getter for having captionedImages
     * @return whether the captions need to be enabled.
     */
    public boolean getCaptionImages() {
        return this.captionImages;
    }
}
