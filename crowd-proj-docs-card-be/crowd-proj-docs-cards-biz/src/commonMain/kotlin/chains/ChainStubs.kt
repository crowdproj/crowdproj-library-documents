package chains

import com.crowdproj.kotlin.cor.handlers.CorChainDsl
import com.crowdproj.kotlin.cor.handlers.chain
import crowd.proj.docs.cards.common.MkPlcDocCardContext
import crowd.proj.docs.cards.common.models.MkPlcDocCardState
import crowd.proj.docs.cards.common.models.MkPlcDocCardWorkMode
import workers.stub.failStubNoCase

fun CorChainDsl<MkPlcDocCardContext, Unit>.chainStubs(
    title: String,
    func: CorChainDsl<MkPlcDocCardContext, Unit>.() -> Unit
) = chain {

    func()
    this.title = title
    on {
        (this.workMode == MkPlcDocCardWorkMode.STUB) && (this.state == MkPlcDocCardState.RUNNING)
    }
    failStubNoCase("Недоступная заглушка")
}