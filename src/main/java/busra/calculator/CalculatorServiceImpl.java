package busra.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int calculatePercentageOfNumber(int num, int percentage) {
        int percentageOfNumber =  (num * percentage)/100;
        return percentageOfNumber;
    }
}
