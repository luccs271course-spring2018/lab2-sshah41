# Questions

- What is the complexity of each of the four search methods in terms of array or list size n?
    findTeamPosition= n
    findTeamPosition(list)= n
    findTeamMinFunding= n
    findTeamMinFundingFast= n^2
- What happens in the case of binary search if the array is not sorted?
    The search will not work. Anytime it eliminates one half of the data it could be the half with
    the file we are looking for.
- What is the purpose of constructor argument validity checking?
    To make it easier to test and also so we are not throwing null arguments into aur loops.
- What is the purpose of using the keyword `final` with variables and arguments?
    'final' means that the variable or argument does not change in the loop or class.
- What are alternatives to using `Optional` and how do they compare?
    An alternative to not using optional is to use a method with lists or arrays but
    we would have limited capabilities and would not able to use Optional.of(n) or
    get or Optional.empty()
