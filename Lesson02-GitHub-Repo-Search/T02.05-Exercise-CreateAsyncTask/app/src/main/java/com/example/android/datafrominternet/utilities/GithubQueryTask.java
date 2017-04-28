package com.example.android.datafrominternet.utilities;

import android.os.AsyncTask;

import java.io.IOException;
import java.net.URL;

/**
 * Created by Oluwatimilehin on 28/04/2017.
 */

public class GithubQueryTask extends AsyncTask<URL, Void, String> {



    @Override
    protected String doInBackground(URL... urls) {
        String githubSearchResults = null;
        try {
            githubSearchResults = NetworkUtils.getResponseFromHttpUrl(urls[0]);
            return githubSearchResults;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return githubSearchResults;
    }

    @Override
    protected void onPostExecute(String s) {
        if(s != null && !s.equals("")){

        }
    }
}
