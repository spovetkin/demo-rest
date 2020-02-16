package ru.spovetkin.demo.rest.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServicePlusImpl implements CalcService {

    @Override
    public long sum(long a, long b) {
        return a + b + 1;
    }

    @Override
    public long mult(long a, long b) {
        return a * b + 1;
    }

}
