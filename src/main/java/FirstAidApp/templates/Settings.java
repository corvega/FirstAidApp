package FirstAidApp.templates;

public class Settings {

    boolean magnifyText;
    boolean captionImages;
    colorBlind colorBlind;

    public enum colorBlind {
            DEFAULT, DEUTERANOPIA, PROTANOPIA, TRITANOPIA
    }

    public Settings(boolean magnifyText, boolean captionImages, colorBlind colorBlind) {
        this.magnifyText = magnifyText;
        this.captionImages = captionImages;
        this.colorBlind = colorBlind;
    }

    public Settings.colorBlind getColorBlind() {
        return colorBlind;
    }

    public boolean getMagnifyText() {
        return this.magnifyText;
    }

    public boolean getCaptionImages() {
        return this.captionImages;
    }
}
