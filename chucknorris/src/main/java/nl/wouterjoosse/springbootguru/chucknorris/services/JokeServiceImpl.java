package nl.wouterjoosse.springbootguru.chucknorris.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes quotesGenerator = new ChuckNorrisQuotes();

    @Override
    public String getJoke() {
        return quotesGenerator.getRandomQuote();
    }
    
}
