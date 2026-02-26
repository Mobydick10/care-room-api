#!/bin/sh
# Maven Wrapper script
# https://maven.apache.org/wrapper/

set -e

# Find project base dir
MAVEN_PROJECTBASEDIR="${MAVEN_BASEDIR:-$(cd "$(dirname "$0")" && pwd)}"
MAVEN_WRAPPER_JAR="$MAVEN_PROJECTBASEDIR/.mvn/wrapper/maven-wrapper.jar"
MAVEN_WRAPPER_PROPERTIES="$MAVEN_PROJECTBASEDIR/.mvn/wrapper/maven-wrapper.properties"

# Download Maven if needed
if [ -f "$MAVEN_WRAPPER_JAR" ]; then
    WRAPPER_LAUNCHER=org.apache.maven.wrapper.MavenWrapperMain
    exec java \
        $MAVEN_OPTS \
        $MAVEN_DEBUG_OPTS \
        -classpath "$MAVEN_WRAPPER_JAR" \
        "-Dmaven.multiModuleProjectDirectory=$MAVEN_PROJECTBASEDIR" \
        $WRAPPER_LAUNCHER "$@"
else
    echo "Error: Maven wrapper jar not found at $MAVEN_WRAPPER_JAR"
    echo "Run: mvn wrapper:wrapper to generate it"
    exit 1
fi
