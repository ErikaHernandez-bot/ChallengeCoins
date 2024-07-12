package com.erikachallenge.tools;

import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RequestAPI {

    public Request requestCurrency(String currencyToConvert, String  currencyConverted){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/b3b0add0606b250e43a4d0f3/pair/"+currencyToConvert+"/"+currencyConverted);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request =HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Request.class);
        } catch (Exception e) {
            throw new RuntimeException("There is not the currency conversion");
        }

    }
}
