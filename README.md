In the first and the second cases
- the result of testPersonEquals method is only from check a variable "name" of each object and the result of testObjectEquals method is from check an address(in memory) of each object. So if 2 objects have the same "name" but it's not the same object, testPersonEquals method will return true and testObjectEquals will return false. (as the second test case)

And the last case
- the result of these 2 methods should be false because the checked variables are different class. But they are true. Because 2 checked variables have the same name and equals method in Person class don't check the class's type. 

