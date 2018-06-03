package kitsche.lukas.click

import org.json.JSONArray
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@RestController
class HtmlController(private val wordRepository: WordRepository) {

    @GetMapping("/")
    fun findAll() = wordRepository.findAll()

    @PostMapping("/")
    fun saveAll(@RequestBody wordList: ArrayList<Word>) {
        System.out.println("received the following: " + wordList.toString())
        fun saveAll() = wordRepository.saveAll(wordList)
    }
}