package rest;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import rest.exchange.ExchangeObject;

public class RestApiTest {
    String url = "https://bank.gov.ua/NBUStatService/v1/statdirectory/exchange?valcode=",
            currencyR = "RUB",
            currencyE = "EUR",
            currencyU = "USD",
            json = "&json";
    @Test
    public void Test() throws JsonProcessingException {

       String s = RestApiGet.GetExchangeRate(url + currencyR + json);
        ExchangeObject myObject = new ObjectMapper().readValue(s, ExchangeObject.class);
        System.out.println(myObject.cc+ " = " + myObject.rate);

    }

    @Test
    public void Test2() throws JsonProcessingException {

        String s = RestApiGet.GetExchangeRate(url + currencyE + json);

        ExchangeObject myObject = new ObjectMapper().readValue(s, ExchangeObject.class);
        System.out.println(myObject.cc+ " = " + myObject.rate);

    }
    @Test
    public void Test3() throws JsonProcessingException {

        String s = RestApiGet.GetExchangeRate(url + currencyU + json);

        ExchangeObject myObject = new ObjectMapper().readValue(s, ExchangeObject.class);
        System.out.println(myObject.cc+ " = " + myObject.rate);

    }

}
