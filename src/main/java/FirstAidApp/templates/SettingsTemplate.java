package FirstAidApp.templates;

public class SettingsTemplate {

    boolean magnifyText;
    boolean captionImages;
    colorBlind colorBlind;

    public enum colorBlind {
            DEFAULT, DEUTERANOPIA, PROTANOPIA, TRITANOPIA
    }

    public SettingsTemplate(boolean magnifyText, boolean captionImages, colorBlind colorBlind) {
        this.magnifyText = magnifyText;
        this.captionImages = captionImages;
        this.colorBlind = colorBlind;
    }

    public SettingsTemplate.colorBlind getColorBlind() {
        return colorBlind;
    }

    public boolean getMagnifyText() {
        return this.magnifyText;
    }

    public boolean getCaptionImages() {
        return this.captionImages;
    }
}
