package kitsche.lukas.click

import org.json.JSONArray
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class HtmlController(private val wordRepository: WordRepository, private val sentenceRepository: SentenceRepository) {

    @GetMapping("/")
    fun findAll() = wordRepository.findAll()

    @PostMapping("/")
    fun saveAll(@RequestBody sentence: Sentence) {
        System.out.println("received the following: " + sentence.toString())
    }
}