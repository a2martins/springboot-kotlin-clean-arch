package br.com.amartins.kotlin.useCase.impl

import br.com.amartins.kotlin.domain.GithubDomain
import br.com.amartins.kotlin.gateway.RequestGithubGateway
import br.com.amartins.kotlin.useCase.FindByUsernameUseCase
import org.springframework.stereotype.Service

@Service
class FindByUsernameUseCaseImpl(val requestGithubGateway: RequestGithubGateway) : FindByUsernameUseCase {

    override fun execute(username: String): GithubDomain = requestGithubGateway.shoot(username)

}