object App {

    object Version {

        private const val MAJOR = 1
        private const val MINOR = 0
        private const val PATCH = 0
        private const val BUILD = 0

        const val CODE = MAJOR * 10000 + MINOR * 1000 + PATCH * 100 + BUILD
        const val NAME = "${MAJOR}.${MINOR}.${PATCH}"

    }

    object Debug {

        object Suffix {

            private const val SUFFIX = "debug"

            const val APPLICATION_ID = ".$SUFFIX"
            const val VERSION_NAME = "-$SUFFIX"

        }

    }

    const val APPLICATION_ID = "io.petros.movies"

}
