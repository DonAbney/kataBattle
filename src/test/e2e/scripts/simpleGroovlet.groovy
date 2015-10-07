def failedTestCount = 0

html.html {
    head {
        title 'Simple Groovlet'
    }
    body {
        h1 'FizzBuzz E2E Acceptance Tests'
        p "The current time at this server is ${new Date()}"
        ul {
            (1..100).each { input ->
                def returnValue = don.fizzbuzz.FizzBuzz.process(input)
                if (returnValue != (((input%3==0?'Fizz':'')+(input%5==0?'Buzz':'')) ?: input)) {
                    li "Failed test for ${input} returned ${returnValue}"
                    failedTestCount ++
                }
            }

            if (!failedTestCount) {
                p "Congratulations! You passed all 100 tests!"    
            }
        }
    }
}
