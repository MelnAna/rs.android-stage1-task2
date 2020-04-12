package subtask2

class TimeConverter {

    fun toTextFormat(hour: String, minute: String): String {
        val minuteList: List<String> = listOf(
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine"
        )

        val hr: Int = hour.toInt()

        return when (val min: Int =
            if (minute[0] == '0') Integer.parseInt("${minute[1]}") else Integer.parseInt(minute)) {
            0 -> "${minuteList[hr - 1]} o' clock"
            1 -> "${minuteList[min - 1]} minute past ${minuteList[hr - 1]}"
            in (2..14) -> "${minuteList[min - 1]} minutes past ${minuteList[hr - 1]}"
            15 -> "quarter past ${minuteList[hr - 1]}"
            in (16..29) -> "${minuteList[min - 1]} minutes past ${minuteList[hr - 1]}"
            30 -> "half past ${minuteList[hr - 1]}"
            in (31..44) -> "${minuteList[60 - min - 1]} minutes to ${minuteList[hr]}"
            45 -> "quarter to ${minuteList[hr]}"
            in (46..59) -> "${minuteList[60 - min - 1]} minutes to ${minuteList[hr]}"
            else -> ""
        }
    }
}
