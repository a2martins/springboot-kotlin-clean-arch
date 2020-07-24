package br.com.amartins.kotlin.controller

import br.com.amartins.kotlin.controller.converter.GithubDomainConverter
import br.com.amartins.kotlin.controller.resource.GithubResource
import br.com.amartins.kotlin.domain.GithubDomain
import br.com.amartins.kotlin.useCase.FindByUsernameUseCase
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/github-user")
class GithubController(
        val findByUsernameUseCase: FindByUsernameUseCase,
        val githubDomainConverter: GithubDomainConverter
) {

    @GetMapping("/{username}")
    fun findByUsername(@PathVariable username: String): GithubResource {
        val githubDomain: GithubDomain = findByUsernameUseCase.execute(username)
        return githubDomainConverter.toGithubResource(githubDomain)
    }

}