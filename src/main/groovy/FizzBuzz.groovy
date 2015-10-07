package don.fizzbuzz

class FizzBuzz {
    
    public static process(int input) {
        ((input % 3 == 0 ? 'Fizz' : '') + (input % 5 == 0 ? 'Buzz' : '')) ?: input
    }
}
