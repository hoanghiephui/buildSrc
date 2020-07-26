/**
 * Configuration of build modules
 */
object BuildModules {
    const val APP = ":app"
    const val BASE = ":base"

    object Features {
        const val AUTHENTICATION = ":features:authentication"
    }

    object Commons {
        const val UI = ":commons:ui"
        const val VIEWS = ":commons:views"
        const val FOUNDATIONS = ":commons:foundations"
    }

    object Libraries {
    }
}
