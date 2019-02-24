FROM jenkins/slave:alpine

ARG SBT_VERSION=1.2.8

ENV SBT_HOME /usr/local/sbt
ENV PATH ${PATH}:${SBT_HOME}/bin

USER root
RUN apk add --update --no-cache curl \
  && curl -L https://github.com/sbt/sbt/releases/download/v${SBT_VERSION}/sbt-${SBT_VERSION}.tgz \
  | tar -xz -C /usr/local \
  && chown -R root:root /usr/local/sbt \
  && apk del curl

USER jenkins
