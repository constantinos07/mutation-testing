# Mutation Testing
Testing and traditional test coverage allows us to see how much of your code is covered/executed by our tests and therefore ensure that our code functions as intended. Although such information is 
quite useful as it allows developers to find untested parts of their codebase, it doesn't tell us how good our unit tests actually are. For example, it is possible to achieve 100% code/test coverage without having any assertions in our tests.  

To ensure high quality tests which are able to catch bugs and give us confidence that the software will work after future changes, we have used a mutation testing framework called `pit` which determines how much of our code is actually being "tested by" our unit tests. 

The mutation testing framework introduces small changes (eg changing ">" into "<" or "--" into "++") called `mutants` into our byte code and then executes our tests to see if the change has been detected by the unit tests.

If our `tests fail`, then the `mutation is killed`. 
If our `tests pass` then the `mutation lived` which means that the mutant is actually `not tested by the unit tests`.


## Run pitest Mutation Coverage 
 `mvn test pitest:mutationCoverage`
 
A mutation coverage report is generated under: `target/pit-reports/index.html`

Note: `pit_reports` folder entails 2 reports generated for the committed source code

## Related Pages
 * https://pitest.org/
 * https://martinfowler.com/bliki/TestCoverage.html
