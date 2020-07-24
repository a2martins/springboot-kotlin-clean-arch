package br.com.amartins.kotlin.useCase

import br.com.amartins.kotlin.domain.GithubDomain

interface FindByUsernameUseCase {
    fun execute(username: String): GithubDomain
}