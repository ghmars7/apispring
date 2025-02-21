package org.example.apispring.controller;

import org.example.apispring.model.Quote;
import org.example.apispring.service.QuoteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class QuoteController {

    QuoteService quoteService;

    QuoteController(QuoteService qs) {
        this.quoteService = qs;
    }

    @GetMapping("getQuote")
    public Quote getQuote() {
        return quoteService.getQuote();
    }

}
