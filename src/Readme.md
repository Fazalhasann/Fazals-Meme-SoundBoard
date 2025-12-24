# Meme Soundboard

A desktop soundboard application built with Java that plays meme sound effects with a single click. You can also click
the soundboard multiple times and it will output the sound repeatedly. Previous sound stops if you click on a different 
sound.

## Features

- 9 meme sound buttons with instant playback
- Clean grid layout with color-coded buttons
- Preloaded audio for zero delay
- Stops previous sound when new one is clicked
- Fullscreen UI that adapts to monitor size

## Tech Stack

- Java
- Swing (UI)
- Java Sound API (audio playback)

## How to Run

1. Clone this repository
2. Open in IntelliJ IDEA or any Java IDE
3. Add your own `.wav` files to the `Sounds/` folder
4. Run `Main.java`

## Project Structure
```
MemeSound/
├── src/
│   ├── Main.java          # Entry point
│   ├── SoundManager.java  # Handles audio logic
│   └── SoundboardUI.java  # Handles UI components
├── Sounds/                # WAV audio files
└── README.md
```

## What I Learned

- Java Swing for building desktop GUIs
- Java Sound API for audio playback
- Separation of concerns with multiple classes
- Preloading assets for better performance