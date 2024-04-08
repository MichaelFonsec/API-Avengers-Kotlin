package one.digitalinovation.avengers.avengersapi.application.web.resource.response

import one.digitalinovation.avengers.avengersapi.domain.avenger.Avenger

data class AvengerResponse(
    val id: Long? = null,
    val nick: String,
    val person: String,
    val description: String?,
    val history: String?
)  {
    companion object{
        fun from(avenger: Avenger) = AvengerResponse(
           id = avenger.id,
            nick = avenger.nick,
            person = avenger.person,
            description = avenger.description,
            history = avenger.history
        )
    }
}

