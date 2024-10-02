import java.lang.System.exit
import utils.readIntNotNull
import utils.readNextInt


fun main() {
    runMenu()
}
fun runMenu() {
    do {
        val option = mainMenu()
        when (option) {
            1 -> addNote()
            2 -> listNotes()
            3 -> updateNote()
            4 -> deleteNote()
            0 -> exitApp()
            else -> println("Invalid option entered: ${option}")
        }
    } while (true)
}

fun mainMenu(): Int {
    print(""" 
         > ----------------------------------
         > |        NOTE KEEPER APP         |
         > ----------------------------------
         > | NOTE MENU                      |
         > |   1) Add a note                |
         > |   2) List all notes            |
         > |   3) Update a note             |
         > |   4) Delete a note             |
         > ----------------------------------
         > |   0) Exit                      |
         > ---------------------------------- 
         >""".trimMargin(">"))
    return readNextInt(" > ==>>")
}

fun readNextLine(prompt: String?): String {
    print(prompt)
    return readln()
}


fun readNextChar(prompt: String?): Char {
    do {
        try {
            print(prompt)
            return readln().first()
        } catch (e: NumberFormatException) {
            System.err.println("\tEnter a character please.")
        }
    } while (true)
}
fun addNote(){
    println("You chose Add Note")
}

fun listNotes(){
    println("You chose List Notes")
}

fun updateNote(){
    println("You chose Update Note")
}

fun deleteNote(){
    println("You chose Delete Note")
}

fun exitApp(){
    println("Exiting...bye")
    exit(0)
}