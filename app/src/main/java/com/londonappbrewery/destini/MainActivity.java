package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mTopButton;
    private Button mBottomButton;
    private int mStoryIndex;
    private int mEndIndex;

    //Models
    private Story[] StoryBank = new Story[] {
            new Story(R.string.T1_Story, R.string.T1_Ans1, R.string.T1_Ans2),
            new Story(R.string.T2_Story, R.string.T2_Ans1, R.string.T2_Ans2),
            new Story(R.string.T3_Story, R.string.T3_Ans1, R.string.T3_Ans2)
    };

    private int[] EndBank = new int[] {
            R.string.T4_End,
            R.string.T5_End,
            R.string.T6_End
    };

    //Controllers
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView) findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);
        mStoryIndex = 0;
        mEndIndex = -1;

        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 0: //T1
                        mStoryIndex = 2; //T3
                        updateStory();
                        break;
                    case 1: //T2
                        mStoryIndex = 2; //T3
                        updateStory();
                        break;
                    case 2: //T3
                        mStoryIndex = 4;
                        mEndIndex = 2; //T6
                        updateStory();
                        break;
                    default:
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (mStoryIndex) {
                    case 0: //T1
                        mStoryIndex = 1; //T2
                        updateStory();
                        break;
                    case 1: //T2
                        mStoryIndex = 4;
                        mEndIndex = 0; //T4
                        updateStory();
                        break;
                    case 2: //T3
                        mStoryIndex = 4;
                        mEndIndex = 1; //T5
                        updateStory();
                        break;
                    default:
                }

            }
        });

    }

    private void updateStory() {
        if (mEndIndex != -1) {
            mStoryTextView.setText(EndBank[mEndIndex]);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);

        } else {
            mStoryTextView.setText(StoryBank[mStoryIndex].getStoryID());
            mTopButton.setText(StoryBank[mStoryIndex].getAnswer_1_ID());
            mBottomButton.setText(StoryBank[mStoryIndex].getAnswer_2_ID());
        }
    }
}
