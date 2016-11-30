package com.jiechic.android.demo.searchviewwithsuggestions;

import android.content.SearchRecentSuggestionsProvider;

/**
 * Created by jiechic on 30/11/2016.
 */

public class RecentHistoryProvider extends SearchRecentSuggestionsProvider {
    public final static String AUTHORITY = "com.jiechic.android.demo.searchviewwithsuggestions.recenthistoryprovider";
    public final static int MODE = DATABASE_MODE_QUERIES;

    public RecentHistoryProvider() {
        setupSuggestions(AUTHORITY, MODE);
    }
}