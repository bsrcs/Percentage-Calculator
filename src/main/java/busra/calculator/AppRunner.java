package busra.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AppRunner implements CommandLineRunner {

    @Autowired
    CalculatorService calculatorService;

    public static void main(String[] args) {
        SpringApplication.run(AppRunner.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number and percentage values you want to calculate");
        int number = in.nextInt();
        int percentage = in.nextInt();
        int result = calculatorService.calculatePercentageOfNumber(number,percentage);
        System.out.println("Result is : " + result);
    }
}
