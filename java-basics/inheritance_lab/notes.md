### Cake! Cake! Cake!
In this challenge, you'll exercise your knowledge of inheritance by creating a bakery of classes.

#### Task
* Implement the ```BirthdayCake``` class
    * It must inherit from the ```Cake``` class.
    * ```BirthdayCake``` should have a field of its own called ```candles```.
    * The default ```flavor``` of a birthday cake should be chocolate.
* Implement the ```WeddingCake``` class
    * This class must inherit from ```Cake```.
    * It should have a field called ```tiers```.
    * The default ```flavor``` of a wedding cake should be almond.
* Uncomment the 2 lines in the ```createWeddingCake()``` method that set the flabvor and the price.

#### Parameters
None

#### Result
```Cake```: Object with flavor as vanilla and price as 29.99\
```BirthdayCake```: Object with flavor as chocolate and price as 9.99\
```WeddingCake```: Object with flavor as pina colada and price as 350.\

#### Constraints
None

#### Example
Result:\
```Cake{flavor='vanilla', price=29.99}```\
```BirthdayCake{flavor='chocolate', price=9.99}```\
```WeddingCake{flavor='pina colada', price=350.00}```\

#### Challenges I faced
* Forgot to implement the non-access modifier ```static``` to the helper methods in the helper class ```Answer```
* In Java, ```this(...);``` inside a constructor is **constructor chaining**: it calls another constructor of the same class (**must be the first statement**). For ex. in ```Cake() { this("vanilla"); }```, the no-arg constructor delegates to ```Cake(String flavor), which then assigns "vanilla" to the ```flavor``` field. Same technique works with subclasses but uses ```super(...)``` instead, calling the constructor in the superclass

### Credit to Angie Jones [@angiejones](https://github.com/angiejones) for constructing the lab.
