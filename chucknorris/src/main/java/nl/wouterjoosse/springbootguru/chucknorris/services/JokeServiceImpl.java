package nl.wouterjoosse.springbootguru.chucknorris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes quotesGenerator = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return quotesGenerator.getRandomQuote();
    }
    
}
