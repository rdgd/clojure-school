# Try Clojure VSCode

This project uses **[VS Code Remote - Containers](https://aka.ms/vscode-remote/containers)** extension to quickly set up a working development environment for the language **[Clojure](https://clojure.org/)**

In addition to providing a docker environment where Clojure is installed, this project will also run the "Calva" extension for VS Code, which is the most common Clojure plugin for VS Code. It allows you to evaluate forms in your text buffer by sending them to the REPL, do structural editing, etc...

## Get Started

1. Clone this repository.
2. Make sure you have docker running on your OS.
3. Make sure you have VS Code Remote - Containers extension installed.
4. Using the VS Code command palette select `Remote-Containers: Open Folder in Container...` and select wherever you cloned this repo to

Once you've done this, and the project starts up successfully, you will see some terminal output which tells you the command to "Jack-in" with Calva. Do that. Then, when your cursor is over a Clojure form use the key combination `ctrl + return`this should yield some output!
