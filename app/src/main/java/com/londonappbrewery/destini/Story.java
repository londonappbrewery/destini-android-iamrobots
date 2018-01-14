package com.londonappbrewery.destini;

/**
 * Created by wopr on 1/13/18.
 */

public class Story {
    private int mStoryID;
    private int mAnswer_1_ID;
    private int mAnswer_2_ID;

    public Story(int storyID, int answer_1_ID, int answer_2_ID) {
        mStoryID = storyID;
        mAnswer_1_ID = answer_1_ID;
        mAnswer_2_ID = answer_2_ID;
    }

    public int getStoryID() {
        return mStoryID;
    }

    public void setStoryID(int storyID) {
        mStoryID = storyID;
    }

    public int getAnswer_1_ID() {
        return mAnswer_1_ID;
    }

    public void setAnswer_1_ID(int answer_1_ID) {
        mAnswer_1_ID = answer_1_ID;
    }

    public int getAnswer_2_ID() {
        return mAnswer_2_ID;
    }

    public void setAnswer_2_ID(int answer_2_ID) {
        mAnswer_2_ID = answer_2_ID;
    }
}
