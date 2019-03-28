/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FakeDatabase;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author qwerty
 */
public class Lesson {
    public String title;
    public ArrayList<String> descriptions;
    public ArrayList<File> images;

    public Lesson(String title, ArrayList<String> descriptions, ArrayList<File> images) {
        this.title = title;
        this.descriptions = descriptions;
        this.images = images;
    }

    public ArrayList<File> getImages() {
        return this.images;
    }

    public ArrayList<String> getDescriptions() {
        return this.descriptions;
    }

    public String getTitle() {
        return this.title;
    }

    public File getImage(int index) {
        return this.images.get(index);
    }

    public String getDescription(int index) {
        return this.descriptions.get(index);
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addImage(File image) {
        this.images.add(image);
    }

    public void addDescription(String description) {
        this.descriptions.add(description);
    }

    public void setImages(ArrayList<File> images) {
        this.images = images;
    }

    public void setDescription(ArrayList<String> descriptions) {
        this.descriptions = descriptions;
    }
}
