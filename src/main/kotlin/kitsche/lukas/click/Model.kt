package kitsche.lukas.click

import java.time.LocalDateTime
import javax.persistence.*

@Entity
data class Sentence(
        val wordList: ArrayList<String>,
        @Id @GeneratedValue val sentenceId: Int? = null,
        val sentenceKey: String? = null,
        val addedAt: LocalDateTime = LocalDateTime.now())