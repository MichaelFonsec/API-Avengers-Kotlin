package one.digitalinovation.avengers.avengersapi.domain.avenger

interface AvengerRepository {

    fun getDetails(id: Long): Avenger?
    fun getAvengers(): List<Avenger>
    fun create(avenger: Avenger): Avenger
    fun delete(id: Long)
    fun update(avenger: Avenger): Avenger
}