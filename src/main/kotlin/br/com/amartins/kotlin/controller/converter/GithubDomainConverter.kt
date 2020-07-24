package br.com.amartins.kotlin.controller.converter

import br.com.amartins.kotlin.controller.resource.GithubResource
import br.com.amartins.kotlin.domain.GithubDomain
import org.modelmapper.ModelMapper
import org.springframework.stereotype.Component

@Component
class GithubDomainConverter(val modelMapper: ModelMapper) {

    fun toGithubResource(githubDomain: GithubDomain): GithubResource = modelMapper.map(
            githubDomain,
            GithubResource::class.java
    )

}