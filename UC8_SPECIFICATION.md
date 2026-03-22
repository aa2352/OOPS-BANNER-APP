# UC8: Use Map for Character Patterns and Render via Function

## Overview
UC8 is the final evolution of the OOPS Banner App, focusing on improved code maintainability and scalability by implementing the HashMap data structure for storing and managing character patterns.

## Problem Statement (Drawback of UC7)
- Manual creation and management of CharacterPatternMap objects is cumbersome
- Linear search retrieval of patterns is error-prone
- Lack of efficient data structure for character-to-pattern mapping

## Solution Approach
Replace manual character pattern management with a built-in HashMap data structure for:
- **Efficient Storage**: O(1) lookup time for character patterns
- **Better Maintainability**: Centralized map structure
- **Improved Scalability**: Easy to add new character patterns

## Key Components

### 1. createCharacterMap()
- Creates and returns a HashMap<Character, String[]>
- Maps each character ('O', 'P', 'S') to its corresponding multi-line ASCII art pattern
- 9-line height for consistent visual output

### 2. displayBanner()
- Accepts a message string and the character map
- Iterates through pattern height using nested loops
- For each line, retrieves patterns from the map and concatenates them
- Outputs complete banner to console

## Architecture Benefits
1. **Separation of Concerns**: Pattern storage separated from display logic
2. **Reusability**: Patterns can be easily reused without rebuilding
3. **Extensibility**: New characters can be added by simply putting entries in the map
4. **Performance**: O(1) lookups instead of linear search

## Expected Output
For message "OOPS":
```
   ***    ****** |  ***** |  ***** 
 **    ** **    **|**      |**      
**     ****     **|**      |**      
**     ****     **| **     | **     
**     ******* | ***** |  *** 
**     ****    **|    **  |    ** 
**     ****    **|    **  |    ** 
 **    ****    ** |    ** |    ** 
   ***  ** ***** | ***** | ***** 
```

## Testing
- Code compiles successfully
- Banner renders with correct pattern layout
- All characters display as expected

## Git Repository Setup
- Initialize repo with initial commit
- Merge to dev branch
- Provide GIT URL for submission
