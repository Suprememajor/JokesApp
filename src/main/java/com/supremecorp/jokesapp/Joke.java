package com.supremecorp.jokesapp;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

import java.util.concurrent.Callable;

public class Joke {
    public static String randomQuote() {
        ChuckNorrisQuotes chuckNorrisQuotes = new ChuckNorrisQuotes();
        return chuckNorrisQuotes.getRandomQuote();
    }
}
