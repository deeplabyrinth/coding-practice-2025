### Create a Car object
You're given details about a car.

#### Task
Create and return a constructed Car object.

#### Parameters
- make: A String representing the make of the car
- model: A String representing the model of the car
- year: An integer represeting the year of the car
- color: A String represeting the color of the car

#### Result
- Car: The constructed Car object

#### Constraints
None

#### Example
Input: ```"Honda", "Accord", 2024, "blue"```\
Result: ```Car [Make: Honda, Model: Accord, Year: 2024, Color: blue]```

#### Challenges I faced
- Mistakenly defined a nested class with the access modifier ```public```
- Any class definition with the keyword ```public``` must go in its own separate class file
- Or omit the keyword, making it package-private (only accessibly by other classes in the same package)

