//package org.sonatype.maven.polyglot.kotlin

import org.codehaus.plexus.component.annotations.Component
import org.sonatype.maven.polyglot.mapping.Mapping
import org.sonatype.maven.polyglot.mapping.MappingSupport

@Component(role = Mapping::class, hint = "kotlin")
class KotlinMapping: MappingSupport("kotlin") {

    init {
        setPomNames("pom.kts")
        setAcceptLocationExtensions(".kts")
        setAcceptOptionKeys("kts")
        priority = -1f
    }
}