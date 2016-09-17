package com.semi.sopt_19th_5.recyclerview;

/**
 * Created by kh on 2016. 9. 16..
 */
public class ItemData {
    int image;
    String name;
    String part;
    String contents;

    public ItemData(int image, String name, String part, String contents) {
        this.image = image;
        this.name = name;
        this.part = part;
        this.contents = contents;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getPart() {
        return part;
    }

    public String getContents() {
        return contents;
    }
}
