# Mars-Expedition
A Java-based Mars colony survival simulation that models astronaut crew management, rover operations, research missions, emergency events, and resource systems within a realistic Mars base environment
# Requirments Mapping
This is a section highlighting where in the document core OOP concepts are outlined.
## Classes and Objects

### Class
**Where**: `CrewMember.java`
| Concept | File | Lines | What It Shows |
|---------|------|-------|---------------|
| Class Definition | `CrewMember.java` | 1 | `public class CrewMember{}` - defines a public class named CrewMember |
| Attributes | `CrewMember.java` | 2-7| `private String name; private int age; private int health;` etc are the attibutes describing a crew member |
| Constructor | `CrewMember.java` | 9 | `public CrewMember(...)` allows to form a method to initialize objects|
| Methods | `CrewMember.java` | 71 - 127 | `public void increaseHealth(int hp) {}` |


### Objects
**Where**: `MissionControlSystem.java`
| Concepts | File | Lines | What it Shows |
|----------|------|-------|---------------|
| Object Instantation | `MissionControlSystem.java` | - | ` ` this show the creation of a new object from class - |

## Encapsulation

### Access Modifiers
**Where**: `Pilot.java`
| Access Modifier | File | Lines | Description |
|-----------------|------|-------|-------------|
| Private | `Pilot.java` | 2 | `private int navigationSkill;` |
| Public | `Pilot.java` | 3 | `public int missionsCompleted;` |

## Inheritance
**Where**: `Engineer.java`, `Medic.java`,`Pilot.java`,`Scientist.java`
| Concept | File | Line | What It Shows |
|---------|------|------|---------------|
| extends keyword |  |  |  |
| Superclass | `CrewMember.java` |  |  |
| Subclasses | `Engineer.java`, `Medic.java`,`Pilot.java`,`Scientist.java` |  |  |
| Code Reusability |  |  |  |

## Polymorphism

### Overriding (Run-time Polymorphism)
**Where**: `Engineer.java`, `Medic.java`,`Pilot.java`,`Scientist.java`, `CrewMember`
| Concept | File | Line | What It Shows |
|---------|------|------|---------------|
| Main Class Method | `CrewMember.java` |  | `System.out.println(name + "  is performing duties");` |
| Sub Class Method | `Scientist.java` | 40 - 43 | `public void performDuty() {conductResearch();}` |


### Overloading (Compile-time Polymorphism)
**Where**: `Engineer.java`
| Concept | File | Line | What It Shows |
|---------|------|------|---------------|
| `repairSystem()` | `Engineer.java` | 22 - 26 | `public void repairSytem() {...}` |
| `repairSytem(String Systemname)` | `Engineer.java` | 35 - 39 |  `public void repairSytem(String Systemname) {...}` |
| `repairSytem(Rover damagedrover)` | `Engineer.java` | 43 - 49 | `public void repairSytem(Rover damagedrover) {}` |


### Upcasting
Note: JDK 26 allows for automatic upcasting
**Where**: `MissionControlSystem.java`
| Concept | File | Line | What It Shows |
|---------|------|------|---------------|



## How to Use It

1. Compile: `javac *.java`
2. Run: `java MissionControlSystem`
3. The app comes pre-loaded with sample data 














