import com.android.build.gradle.internal.dsl.ProductFlavor
import org.gradle.api.NamedDomainObjectContainer

const val urlName = "BASE_URL"

private const val BASE_URL_ALPHA = "https://api.blockchain.info/"
private const val BASE_URL_STAGING = "https://api.blockchain.info/"
private const val BASE_URL_PRODUCTION = "https://api.blockchain.info/"

interface BuildProductFlavor {
    val name: String
    val baseUrl: String

    fun libraryCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor

    fun appCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor
}

object ProductFlavorAlpha : BuildProductFlavor {
    override val name = "alpha"
    override val baseUrl = BASE_URL_ALPHA

    override fun appCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor {
        return namedDomainObjectContainer.create(name) {
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-alpha"
            dimension = BuildProductDimensions.ENVIRONMENT
            buildConfigField("String", urlName, "\"$baseUrl\"")
        }
    }

    override fun libraryCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor {
        return namedDomainObjectContainer.create(name) {
            versionNameSuffix = "-alpha"
            dimension = BuildProductDimensions.ENVIRONMENT
            buildConfigField("String", urlName, "\"$baseUrl\"")
        }
    }
}

object ProductFlavorStaging : BuildProductFlavor {
    override val name = "staging"
    override val baseUrl = BASE_URL_STAGING

    override fun appCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor {
        return namedDomainObjectContainer.create(name) {
            applicationIdSuffix = ".debug"
            versionNameSuffix = "-staging"
            dimension = BuildProductDimensions.ENVIRONMENT
            buildConfigField("String", urlName, "\"$baseUrl\"")
        }
    }

    override fun libraryCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor {
        return namedDomainObjectContainer.create(name) {
            versionNameSuffix = "-staging"
            dimension = BuildProductDimensions.ENVIRONMENT
            buildConfigField("String", urlName, "\"$baseUrl\"")
        }
    }
}

object ProductFlavorProduction : BuildProductFlavor {
    override val name = "production"
    override val baseUrl = BASE_URL_PRODUCTION

    override fun appCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor {
        return namedDomainObjectContainer.create(name) {
            dimension = BuildProductDimensions.ENVIRONMENT
            buildConfigField("String", urlName, "\"$baseUrl\"")
        }
    }

    override fun libraryCreate(
        namedDomainObjectContainer: NamedDomainObjectContainer<ProductFlavor>
    ): ProductFlavor {
        return namedDomainObjectContainer.create(name) {
            dimension = BuildProductDimensions.ENVIRONMENT
            buildConfigField("String", urlName, "\"$baseUrl\"")
        }
    }
}
