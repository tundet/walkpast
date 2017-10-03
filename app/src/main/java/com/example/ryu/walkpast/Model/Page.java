package com.example.ryu.walkpast.Model;

/**
 * Page has the story and two possible choices.
 * Created by RYU on 9/18/2017.
 */

public class Page {

    private String story;
    private int mChoice1;
    private int mChoice2;
    private String bgImage;
    private int reqSteps; //required steps to walk

    public Page(String text, int choice1, int choice2, String bg, int steps) {
        bgImage = bg;
        story = text;
        mChoice1 = choice1;
        mChoice2 = choice2;
        reqSteps = steps;
    }

    Page(String text, int choice1, String bg, int steps) {
        bgImage = bg;
        story = text;
        mChoice1 = choice1;
        reqSteps = steps;
    }

    public String getText() {
        return story;
    }

    public int getChoice1() {
        return mChoice1;
    }

    public int getChoice2() {
        return mChoice2;
    }

    public int getSteps() { return reqSteps; }

    public String getBackground() {
        return bgImage;
    }

    public String getStory() {
        return story;
    }
}
