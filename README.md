

📌 Project Overview
The **Emotion Detector from Text is a Java-based console application that analyzes user input and detects the emotion expressed in a sentence.  
It uses predefined keywords mapped to emotion categories and displays the detected emotion along with an appropriate message or emoji.  
This project is ideal for beginners learning **Java string handling, logic building, and basic text analysis**.

---

🎯 Objective
- Accept a sentence or phrase from the user.
- Identify emotion-related keywords.
- Detect and display the **dominant emotion**.
- Show a relevant **Unicode emoji** for the detected emotion.

---

🛠 Features
- **Predefined emotion mapping** using `HashMap` or `ArrayList`.
- Detects emotions such as joy, sadness, anger, etc.
- **Case-insensitive** keyword matching.
- Handles **spacing and punctuation** issues.
- Optional continuous mode until `"exit"` is typed.
- Supports **Unicode emojis** for visual feedback.
- Optionally highlights detected keywords in output.

---

🧩 Functional Requirements
1. **Input Handling** – Accept a full sentence from the user.
2. **Text Analysis** – Split the sentence into words and search for predefined emotion keywords.
3. **Emotion Mapping** – Count keyword matches for each emotion category.
4. **Dominant Emotion Detection** – Find the emotion with the highest match count.
5. **Output** – Display the detected emotion with a relevant message and emoji.
6. **Exit Condition** – Allow the user to type `"exit"` to quit.

---

🚀 How to Run
1. Clone the repository
```bash
git clone https://github.com/yourusername/emotion-detector-java.git
cd emotion-detector-java
2. Compile the Java file
bash
Copy
Edit
javac EmotionDetector.java
3. Run the program (UTF-8 enabled for emojis)
bash
Copy
Edit
java -Dfile.encoding=UTF-8 EmotionDetector
💡 Windows Users:
If emojis don’t display properly, run this before execution:

bash
Copy
Edit
chcp 65001
📂 Project Structure
bash
Copy
Edit
emotion-detector-java/
│
├── EmotionDetector.java   # Main Java source file
└── README.md              # Project documentation
💻 Tools Used
Language: Java SE 8+

IDE: IntelliJ IDEA / Eclipse / BlueJ / VS Code

Libraries: java.util.Scanner, java.util.HashMap, java.util.ArrayList, java.util.Collections

Emoji Support: Unicode

📚 Java Concepts Practiced
User Input – Scanner class

String Handling – toLowerCase(), split(), replaceAll()

Data Structures – HashMap, ArrayList, Set

Loops & Conditions – for, while, if-else

Algorithm Design – keyword frequency counting

Unicode Output – printing emojis in console

✨ Optional Enhancements
Detect multiple emotions in a sentence.

Highlight detected keywords in output.

Improve emotion mapping with synonyms.

Create a GUI version using JOptionPane or JavaFX.

📜 License
This project is open-source and available under the MIT License.

👨‍💻 Author
Aayush Kumar
