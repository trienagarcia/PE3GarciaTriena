package com.example.pe3garciatriena;

public class Companies {
    String company, country, industry, ceo;

    public Companies(String company, String country, String industry, String ceo) {
        this.company = company;
        this.country = country;
        this.industry = industry;
        this.ceo = ceo;
    }

    public String getCompany() {
        return company;
    }

    public String getCountry() {
        return country;
    }

    public String getIndustry() {
        return industry;
    }

    public String getCeo() {
        return ceo;
    }
}
