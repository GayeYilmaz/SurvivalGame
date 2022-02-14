# Survival Game
-- This is a text-based survival game.
You can find the properties and the example class diagram below.

### Characters

| Character      | ID            | Damage        | Health        | Money         |
| ------------- | ------------- |-------------- |---------------|---------------|
| Samurai       | 1             | 5             | 21            | 15            |
| Archer        | 2             | 7             | 18            | 20            |
| Paladin       | 3             | 8             | 24            | 5             |

### Monsters/Obstacles

| Monster       | ID            | Damage        | Health        | Money         |
| ------------- | ------------- |-------------- |---------------|---------------|
| Zombie        | 1             | 3             | 10            | 4             |
| Vampire       | 2             | 4             | 14            | 7             |
| Bear          | 3             | 7             | 20            | 12            |
| Snake         | 4             | Randomly(3-6) | 12            | -             |


### Weapons

| Weapon        | ID            | Damage        | Money         |
| ------------- | ------------- |-------------- |---------------|
| Gun           | 1             | 2             | 25            |
| Sword         | 2             | 3             | 35            |
| Rifle         | 3             | 7             | 45            | 

### Armors

| Armor         | ID            | Block        | Money         |
| ------------- | ------------- |-------------- |---------------|
| Light         | 1             | 1             | 15            |
| Medium        | 2             | 3             | 25            |
| Heavy         | 3             | 5             | 40            | 


### Areas

1- Safe House
 -Your health will increase when you are in safe house.
 
2- Cave
 - Zombies live here.(1-3)
 - You can fight with zombies and gain the award.
 - Prize : Food
 
3- Forest
 - Vampires live here.(1-3)
 - You can fight with vampires and gain the award.
 - Prize : Firewood

4- River
 - Bears live here(1-3)
 - You can fight with bears and gain the award.
 - Prize : Water
 
5- Toolstore
 - you can buy armor and weapon and increase abilities of your character.
 - Weapons : Gun, Sword, Rifle
 - Armors : Light, Medium, Heavy

6- Mine
 - Sanles live here(1-5)
 - Player can get the money, weapon and armor from the defeated monsters randomly.
 - Prize : -

 -Player can get items with posibilit as shown below.
  
   - Chance to get weapon : 15%
     - Rifle : 20%
     - Sword : 30%
     - Gun : 50%

   - Chance to get armor : 15%
     - Heavy Armor : 20%
     - Medium Armor : 30%
     - Light Armor : 50%

   - Chance to get money : 25%
     - 10 Money : 20%
     - 5 Money : 30%
     - 1 Money : 50%

   - Chance to get nothing : 45%

 
 
 ## Class Diagram
 ![image](https://user-images.githubusercontent.com/36278457/153771770-2fbabc67-95a5-4cac-8244-38b7db06a018.png)
 
 ## Requirements
 1- To finish the game, player should defeat all the monsters int the battlefield and player should get the special prizes(firewood,water,food) after each area.Also player can not enter after the getting special prize from the area.
 
 2- When the player and monsters come across first one that will attck first, will be choosen randomly. Both side have 50% chance to make first move.
 
 
 
