package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            LocalDate
                .of(year.toInt(), month.toInt(), day.toInt())
                .format(DateTimeFormatter.ofPattern("dd MMMM, EEEE", Locale("ru")))
        } catch (ex: Exception) {
            return "Такого дня не существует"
        }
    }
}
