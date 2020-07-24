package br.com.amartins.kotlin.gateway

import br.com.amartins.kotlin.domain.GithubDomain

interface RequestGithubGateway {
    fun shoot(username: String): GithubDomain
}