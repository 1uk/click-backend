package kitsche.lukas.click

import org.springframework.data.repository.CrudRepository

interface SentenceRepository : CrudRepository<Sentence, Int>