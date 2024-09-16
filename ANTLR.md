# AUT
Automata repo for my minor semseter

## Installation

### Short, automated Antlr4 Installation (Win10)

[Follow this guide!](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md)

#### Usage

**To compile grammer to java manually:**
```bash
antlr4 <path to .g4 file> <params, just run antlr4 to see options>
# For example:
antlr4 .\src\Arithmetic\Arithmetic.g4 -visitor -listener -package Arithmetic -o .
```

**To visualize a tree:**
```bash
antlr4-parse <path to grammer> <starting rule to visualize> -gui <path to input txt, leave empty to have interactive input
antlr4-parse .\src\Arithmetic\Arithmetic.g4 expr -gui .\src\Arithmetic\input.txt
```

### Long, manual Antlr4 Installation (Win10)

Ive used [this guide](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#windows) paired with [this video](https://www.youtube.com/watch?v=p2gIBPz69DM) to install antlr4 on my windows 10 machine.

---
1. Install Java and download the antlr jar file from the antlr website. 
> https://download.oracle.com/java/22/latest/jdk-22_windows-x64_bin.exe
> https://www.antlr.org/download/antlr-4.13.2-complete.jar

Ive put the antlr jar in the root of the project, but you can put it anywhere you want. Keep note of the path to the jar file.
```bash
/path/to/project/antlr-4.13.2-complete.jar
```

2. Create the following batch file in the root of the project. 

```bash
# /path/to/project/antlr4.bat
java org.antlr.v4.Tool %*
```

```bash
# /path/to/project/grun.bat
@ECHO OFF
SET TEST_CURRENT_DIR=%CLASSPATH:.;=%
if "%TEST_CURRENT_DIR%" == "%CLASSPATH%" ( SET CLASSPATH=.;%CLASSPATH% )
@ECHO ON
java org.antlr.v4.gui.TestRig %*
```

---
3. Next make the following changes to your environment variables.
- New user variable named `CLASSPATH` and set its value to `/path/to/project/antlr-4.13.2-complete.jar`
- Add to the user `Path` variable:
  - `%CLASSPATH%`
  - `/path/to/project/`

---
4. Ensure that you have java installed (JDK Version 22.0.2, see above link). You can check this by running the following command:
```bash
java -showversion

# Output
java version "22.0.2" 2024-07-16
Java(TM) SE Runtime Environment (build 22.0.2+...
```

**NOTE: Java should add the `bin` directory to the `Path` system variable automatically. If it does not, you can add it manually** (below is the default path for the JDK):  
> `C:\Program Files\Java\jdk-22\bin`

This is the path where the `java.exe` and `javac.exe` are located.

---
5. Lastly, test the installation by running the following command:
```bash
java -jar /path/to/project/antlr-4.13.2-complete.jar

# Output
ANTLR Parser Generator  Version 4.13.2
 -o ___              specify output directory where all output is generated
 -lib ___            specify location of grammars, tokens files
 -atn                generate rule augmented transition network diagrams
 -encoding ___       specify grammar file encoding; e.g., euc-jp
 -message-format ___ specify output style for messages in antlr, gnu, vs2005
 -long-messages      show exception details when available for errors and warnings
 -listener           generate parse tree listener (default)
 -no-listener        don't generate parse tree listener
 -visitor            generate parse tree visitor
 -no-visitor         don't generate parse tree visitor (default)
 -package ___        specify a package/namespace for the generated code
 -depend             generate file dependencies
 -D<option>=value    set/override a grammar-level option
 -Werror             treat warnings as errors
 -XdbgST             launch StringTemplate visualizer on generated code
 -XdbgSTWait         wait for STViz to close before continuing
 -Xforce-atn         use the ATN simulator for all predictions
 -Xlog               dump lots of logging info to antlr-timestamp.log
 -Xexact-output-dir  all output goes into -o dir regardless of paths/package
```
---

If you see the above output, then the installation was successful.

[A first example for using antlr is provided in the guide used to install antlr4.](https://github.com/antlr/antlr4/blob/master/doc/getting-started.md#a-first-example)




### OLD
Please install the [antlr4 vscode extention](https://marketplace.visualstudio.com/items?itemName=mike-lischke.vscode-antlr4) before continuing.

1. Create a new grammar file, add some rules and save the file. This should let the extention generate the lexer and parser files for you. If this does not happen, you can run the following command in the terminal:
```bash
java -jar /path/to/project/antlr-4.13.2-complete.jar -Dlanguage=java /path/to/project/YourGrammar.g4
```
This should result in having a `.antlr` folder in the same directory as your grammar file. This folder contains the lexer and parser files.

2. Enter the newly generated `.antlr` folder and run the following command to compile the lexer and parser files:
```bash
javac *.java
```

3. Run the following command to test the grammar:
```bash
grun Hello r -gui
```

4. Enter some text in the terminal and press `Ctrl+D` on linux or `Ctrl+Z` on windows to see the parse tree.

## Useful Links
- [Grammars Documentation](https://github.com/antlr/antlr4/blob/master/doc/grammars.md)