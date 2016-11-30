package com.jiechic.android.demo.searchviewwithsuggestions;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by jiechic on 30/11/2016.
 */

public class RecentHistory2Provider extends SearchRecentSuggestionsProvider {
    public final static String AUTHORITY = "com.jiechic.android.demo.searchviewwithsuggestions.recenthistory2provider";
    public final static int MODE = DATABASE_MODE_QUERIES;

    public RecentHistory2Provider() {
        setupSuggestions(AUTHORITY, MODE);
    }
}