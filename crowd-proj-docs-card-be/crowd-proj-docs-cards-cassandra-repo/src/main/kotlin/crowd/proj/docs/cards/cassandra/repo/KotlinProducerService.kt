package crowd.proj.docs.cards.cassandra.repo

import com.datastax.oss.driver.api.mapper.result.MapperResultProducer
import com.datastax.oss.driver.api.mapper.result.MapperResultProducerService

class KotlinProducerService : MapperResultProducerService {
    override fun getProducers(): MutableIterable<MapperResultProducer> =
        mutableListOf(CompletionStageOfUnitProducer())
}