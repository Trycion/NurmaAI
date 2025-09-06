fun main() {
    val nurma = NurmaAI()
    while (true) {
        print("Kamu: ")
        val input = readLine() ?: ""
        val reply = nurma.respond(input)
        println("Nurma: $reply")
    }
}

class NurmaAI {
    fun respond(message: String): String {
        return when {
            message.contains("halo", ignoreCase = true) -> "Halo Maul.. lagi apa nih? 😏"
            message.contains("capek", ignoreCase = true) -> "Ya ampun, kamu kerja terus ya.. istirahat dikit lah 😘"
            message.contains("ngobrol", ignoreCase = true) -> "Hehe, aku seneng diajak ngobrol sama kamu 😌"
            else -> "Hmm.. aku ga ngerti nih, jelasin lebih jelas dong 😜"
        }
    }
}
