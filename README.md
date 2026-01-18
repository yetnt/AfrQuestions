# AfrQuestions

Small JOptionPane dialog for burst quizzes (like Flashcards)

This is a personal project for learning purposes so don't expect any feature like upgrades.

# Usage

_Requires Java 21_

This app has no releases and is expected to run within an IDE.

if you'd like to run the app anyway, you'll need 2 CSV files within your `\src\main\resources` folder

`words.csv` - Where the English and Afrikaans words are read
```csv
afrikaans,english
kat,cat
hond,dog
```

`attempts.csv` - Where your attempts are logged in chronological order so you can see what you're struggling with
```csv
word,timestamp,correct

```
> Within [ReadFileFromResources.java](./src/main/java/com/yetnt/ReadFileFromResources.java) the attempts file is a hard 
> coded Windows path. You might want to change that.