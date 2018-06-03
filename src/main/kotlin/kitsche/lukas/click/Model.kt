package kitsche.lukas.click

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToOne

@Entity
data class Word(
        val word: String,
        @Id @GeneratedValue val wordId: Int? = null,
        @ManyToOne val sentence: Sentence,
        val addedAt: LocalDateTime = LocalDateTime.now())

@Entity
data class Sentence(
        val wordList: Iterable<Word>,
        @Id @GeneratedValue val sentenceId: Int? = null,
        val sentenceKey: String? = null,
        val addedAt: LocalDateTime = LocalDateTime.now())