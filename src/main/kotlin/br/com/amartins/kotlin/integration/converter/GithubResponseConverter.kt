package br.com.amartins.kotlin.integration.converter

import br.com.amartins.kotlin.domain.GithubDomain
import br.com.amartins.kotlin.integration.response.GithubResponse
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Component

@Component
class GithubResponseConverter(val modelMapper: ModelMapper) {

    fun toGithubDomain(githubResponse: GithubResponse): GithubDomain = modelMapper.map(
            githubResponse,
            GithubDomain::class.java
    )
}