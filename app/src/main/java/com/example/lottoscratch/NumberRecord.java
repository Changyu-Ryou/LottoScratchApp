package com.example.lottoscratch;

import android.provider.BaseColumns;

public class NumberRecord {

    private NumberRecord(){
    }

    public static class NumberEntry implements BaseColumns{
        public static final String TABLE_NAME="number";
        public static final String TIME_STAMP="number";
        public static final String FIRST_NUMBER="number1";
        public static final String SECOND_NUMBER="number2";
        public static final String THIRD_NUMBER="number3";
        public static final String FOURTH_NUMBER="number4";
        public static final String FIFTH_NUMBER="number5";
        public static final String SIXTH_NUMBER="number6";
        public static final String LIKE_NUMBER="number7";

    }



}
