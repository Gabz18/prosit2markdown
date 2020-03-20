package com.gabz18.prositmarkdown

import org.springframework.web.bind.annotation.*

/**
 *
 * @author gritzenthaler
 */
@RestController
@RequestMapping("/api")
@CrossOrigin
class Controller(val markdownPrositGenerator: MarkdownPrositGenerator) {

    @PostMapping
    fun generateMarkdownProsit(@RequestBody prosit: Prosit): String {
        return markdownPrositGenerator.generate(prosit)
    }
}