package br.com.amartins.kotlin.integration.impl

import br.com.amartins.kotlin.domain.GithubDomain
import br.com.amartins.kotlin.gateway.RequestGithubGateway
import br.com.amartins.kotlin.integration.FindUserGithub
import br.com.amartins.kotlin.integration.converter.GithubResponseConverter
import br.com.amartins.kotlin.integration.response.GithubResponse
import org.springframework.stereotype.Component

@Component
class RequestGithubGatewayImpl(
        val findUserGithub: FindUserGithub,
        val githubResponseConverter: GithubResponseConverter
) : RequestGithubGateway {
    override fun shoot(username: String): GithubDomain {
        val githubResponse: GithubResponse = findUserGithub.getUser(login = username)
        println(githubResponse)
        return githubResponseConverter.toGithubDomain(githubResponse)
    }
}
