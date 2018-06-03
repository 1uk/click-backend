package kitsche.lukas.click

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HtmlController(private val sentenceRepository: SentenceRepository) {

    @GetMapping("/")
    fun findAll() = sentenceRepository.findAll()

    @PostMapping("/")
    fun saveAll(@RequestBody sentence: Sentence) {
        System.out.println("received the following: " + sentence.toString())
        sentenceRepository.save(sentence)
    }
}