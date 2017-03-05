package com.akristic.www.tennisquiz;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Toni on 2.3.2017..
 */

public class Question {

    private String mText;
    private String mAnswer;

    public Question(String text, String answer){
        mText=text;
        mAnswer=answer;
    }
    public String getText(){
        return mText;
    }
    public String getAnswer(){
        return mAnswer;
    }
    public void setAnswer(String answer){
        mAnswer=answer;
    }
    public int checkAnswer(String answer){
        answer=answer.toLowerCase();
        return mAnswer.compareTo(answer);
    }

}
