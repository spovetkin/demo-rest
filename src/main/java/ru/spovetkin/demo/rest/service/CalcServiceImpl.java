package ru.spovetkin.demo.rest.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class CalcServiceImpl implements CalcService {

    @Override
    public long sum(long a, long b) {
        return a + b;
    }

    @Override
    public long mult(long a, long b) {
        return a * b;
    }

}
