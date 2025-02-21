package org.example.apispring.service;

import org.example.apispring.model.Quote;
import org.example.apispring.repository.QuoteRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class QuoteService {

    QuoteRepository repository;

    public QuoteService(QuoteRepository rep) {
        this.repository = rep;
    }

    public Quote getQuote(){
        List<Quote> quotes = repository.findAll();

        Random random = new Random();
        int randomIndex = random.nextInt(quotes.size());
        return quotes.get(randomIndex);
    }


}
