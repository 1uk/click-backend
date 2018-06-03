package kitsche.lukas.click

import org.springframework.data.repository.CrudRepository

interface WordRepository : CrudRepository<Word, Int>

interface SentenceRepository : CrudRepository<Word, Int>