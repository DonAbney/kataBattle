package don.fizzbuzz

import org.junit.Test

class FizzBuzzAcceptTest {

    @Test
    void shouldDisplayCorrectlyFrom1To100() {
        (1..100).each { testNumber ->
            println FizzBuzz.process(testNumber)
        }
    }
}
