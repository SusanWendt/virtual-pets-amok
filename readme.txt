Virtual Pets Amok: Project Description

There are virtual organic pets and virtual robotic pets.
You can walk all of your virtual dogs at once. 
Dogs are in cages now. 
Cats hang out in a communal area and use a common litter box. 
All pets have a health attribute. 
Organic pets have their health decreased by unclean circumstances, and by thirst or hunger growing too high. 
Robotic pets only lose health if they’re not oiled regularly. All pets lose health if their happiness drops too low.


Required Tasks

General
[x] introduce ways to track:
[x] cage cleanliness for organic dogs
[x] shelter litter box cleanliness for organic cats
[x] oil/maintenance level for robot animals

All classes
[x] Encapsulate all instance variables.
[x] Assign appropriate visibility modifiers to methods only used internally by a class or within a class hierarchy.
[x] VirtualPet class and related subclasses/interfaces

In addition to the last project’s requirements:
[x] create a model that allows for dogs and cats, either of which may be robotic
[x] introduce an attribute (instance variable) representing overall health that is updated as 
a result of other attributes moving in a negative or positive direction, influencing happiness

introduce methods that allow for:
[x] oiling robotic pets
[x] walking dogs, decreasing the likelihood that organic dogs will soil their cages, while increasing happiness in all dogs
[x] do not allow:
[x] feeding/watering robotic pets
[x] oiling organic pets

modify the tick method to return a value indicating the amount of waste a pet creates, which should contribute to either:
[x] amount of waste in the litter box
[x] amount of waste in an individual dog cage

VirtualPetShelter class
In addition to the last project’s requirements, introduce methods that allow for:
[x] oiling/maintaining all robotic pets
[x] cleaning dog cages
[x] emptying the litterbox
[x] modify existing methods to only feed/water pets that are not robotic

VirtualPetShelterApp class
In addition to the last project’s requirements, add options to:
[x] walk all dogs
[x] clean dog cages
[x] clean the shelter litterbox
[x] oil all robotic pets

Stretch Tasks
[] Allow for other types of pets. Are they caged? What maintenance do they require?
[] Allow an option for giving treats to pets. What sorts of treats do different pets like?
[] introduce a Cage class for each dog, where cleanliness is tracked, keying these on the dog to which each is assigned (to use a VirtualPet as a key in a HashMap, you should implement hashCode and equals)
[] Herd your cats.
 
Rubric
[x] oilAllRobots()	10
[x] cleanAllCages()	10
[x] emptyLitterBox()	10
[x] has interfaces for necessary functionality	10
[x] instance variable for health	10
[x] modify tick() - amount of waste in the litter box and amount of waste in an individual dog cage	10
[x] encapsulate all instance variables	10
[x] proper modifiers for instance variables	10
[x] adequate unit tests to drive production	10
[x] style/formatting/code quality 10