package kataBattle.fizzbuzz

import org.junit.Test

class FizzBuzzTest {

  @Test
  void "returns the number it is handed"() {
    assert(FizzBuzz.process(1) == 1)
  }

}
