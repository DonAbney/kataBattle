package don.fizzbuzz

import org.junit.Test

class FizzBuzzTest {

    @Test
    void shouldReturn1for1() {
        assert(FizzBuzz.process(1) == 1)    
    }

    @Test
    void shouldReturn2for2() {
        assert(FizzBuzz.process(2) == 2)    
    }

    @Test
    void shouldReturnFizzfor3() {
        assert(FizzBuzz.process(3) == 'Fizz')    
    }

    @Test
    void shouldReturnBuzzfor5() {
        assert(FizzBuzz.process(5) == 'Buzz')    
    }

    @Test
    void shouldReturnFizzfor6() {
        assert(FizzBuzz.process(6) == 'Fizz')    
    }

    @Test
    void shouldReturnBuzzfor10() {
        assert(FizzBuzz.process(10) == 'Buzz')    
    }

    @Test
    void shouldReturnFizzBuzzfor15() {
        assert(FizzBuzz.process(15) == 'FizzBuzz')    
    }

    @Test
    void shouldReturnFizzBuzzfor30() {
        assert(FizzBuzz.process(30) == 'FizzBuzz')    
    }

    @Test
    void shouldReturn76for76() {
        assert(FizzBuzz.process(76) == 76)    
    }

    @Test
    void shouldReturnFizzBuzzfor90() {
        assert(FizzBuzz.process(90) == 'FizzBuzz')    
    }

    @Test
    void shouldReturnFizzfor93() {
        assert(FizzBuzz.process(93) == 'Fizz')    
    }

    @Test
    void shouldReturnBuzzfor95() {
        assert(FizzBuzz.process(95) == 'Buzz')    
    }
    
}
