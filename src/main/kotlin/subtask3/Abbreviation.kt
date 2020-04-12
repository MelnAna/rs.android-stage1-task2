package subtask3

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        var position = 0
        var count = 0
        for (char in b.toLowerCase()) {
            for ((index, letter) in a.toLowerCase().withIndex()) {
                if (char == letter && index >= position) {
                    count++
                    position = index
                }
            }
        }
        return if (count == b.length) "YES"
        else "NO"
    }
}
