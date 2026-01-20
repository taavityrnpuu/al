#!/usr/bin/env bash
set -euo pipefail

ROOT_DIR="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
LIB_DIR="${ROOT_DIR}/lib"

SPRING_VERSION="${SPRING_VERSION:-6.0.13}"
SPRING_SECURITY_VERSION="${SPRING_SECURITY_VERSION:-6.0.9}"
MAVEN_BASE_URL="${MAVEN_BASE_URL:-https://repo1.maven.org/maven2}"

SPRING_ARTIFACTS=(
  spring-aop
  spring-beans
  spring-context
  spring-context-support
  spring-core
  spring-expression
  spring-jdbc
  spring-orm
  spring-tx
  spring-web
  spring-webmvc
  spring-jcl
)

SPRING_SECURITY_ARTIFACTS=(
  spring-security-acl
  spring-security-aspects
  spring-security-cas
  spring-security-config
  spring-security-core
  spring-security-crypto
  spring-security-data
  spring-security-ldap
  spring-security-messaging
  spring-security-oauth2-client
  spring-security-oauth2-core
  spring-security-oauth2-jose
  spring-security-openid
  spring-security-remoting
  spring-security-taglibs
  spring-security-test
  spring-security-web
)

remove_old_spring_jars() {
  rm -f "${LIB_DIR}"/spring-*.jar
}

download_artifact() {
  local group_path="$1"
  local artifact="$2"
  local version="$3"
  local target="${LIB_DIR}/${artifact}-${version}.jar"
  local url="${MAVEN_BASE_URL}/${group_path}/${artifact}/${version}/${artifact}-${version}.jar"

  echo "Downloading ${url}"
  curl -fL --retry 3 --retry-delay 2 -o "${target}" "${url}"
}

main() {
  echo "Upgrading Spring Framework to ${SPRING_VERSION}"
  echo "Upgrading Spring Security to ${SPRING_SECURITY_VERSION}"
  echo "Using Maven base URL: ${MAVEN_BASE_URL}"

  remove_old_spring_jars

  for artifact in "${SPRING_ARTIFACTS[@]}"; do
    download_artifact "org/springframework" "${artifact}" "${SPRING_VERSION}"
  done

  for artifact in "${SPRING_SECURITY_ARTIFACTS[@]}"; do
    download_artifact "org/springframework/security" "${artifact}" "${SPRING_SECURITY_VERSION}"
  done

  echo "Spring upgrade completed."
}

main "$@"
