package ru.otus.crowd.proj.docs.cards.be.stubs

import crowd.proj.docs.cards.common.models.*

object MkPlcDocCardStubPdf {

    val DOC_CARD_PDF1: MkPlcDocCard
        get() = MkPlcDocCard(
            id = MkPlcDocCardId("111"),
            title = "Документ №33",
            description = "Документ об очень важном",
            ownerId = MkPlcDocCardOwnerId("user-1"),
            docCardType = MkPlcDocCardType.PDF,
            visibility = MkPlcDocCardVisibility.VISIBLE_PUBLIC,
            lock = MkPlcDocCardLock("123-234-abc-ABC"),
            permissionsClient = mutableSetOf(
                MkPlcDocCardPermissionClient.READ,
                MkPlcDocCardPermissionClient.UPDATE,
                MkPlcDocCardPermissionClient.DELETE,
                MkPlcDocCardPermissionClient.MAKE_VISIBLE_PUBLIC,
                MkPlcDocCardPermissionClient.MAKE_VISIBLE_GROUP,
                MkPlcDocCardPermissionClient.MAKE_VISIBLE_OWNER,
            )
        )

    val DOC_CARD_PNG = DOC_CARD_PDF1.copy(docCardType = MkPlcDocCardType.PNG)

}